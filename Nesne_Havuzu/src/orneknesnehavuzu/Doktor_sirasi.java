package orneknesnehavuzu;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import java.util.concurrent.atomic.AtomicBoolean;
	import java.util.concurrent.atomic.AtomicInteger;
	 
	
	public class Doktor_sirasi {
	 
	    private static final long EXPIRED_TIME_IN_MILISECOND = 1200; // 1.2s
	    private static final int NUMBER_OF_DOCTOR = 4;
	 
	    private final List<Doktor> available = Collections.synchronizedList(new ArrayList<>());
	    private final List<Doktor> inUse = Collections.synchronizedList(new ArrayList<>());
	 
	    private final AtomicInteger count = new AtomicInteger(0);
	    private final AtomicBoolean waiting = new AtomicBoolean(false);
	 
	    public synchronized Doktor getDoktor() {
	        if (!available.isEmpty()) {
	            Doktor doktor = available.remove(0);
	            inUse.add(doktor);
	            return doktor;
	        }
	        if (count.get() == NUMBER_OF_DOCTOR) {
	            this.waitingUntilDoktorAvailable();
	            return this.getDoktor();
	        }
	        Doktor doktor = this.createSira();
	        inUse.add(doktor);
	        return doktor;
	    }
	 
	    public synchronized void release(Doktor doktor) {
	        inUse.remove(doktor);
	        available.add(doktor);
	        System.out.println(doktor.getName() + " boþ");
	    }
	 
	    private Doktor createSira() {
	        waiting(200); 
	        Doktor doktor = new Doktor("Müsait doktor " + count.incrementAndGet());
	        System.out.println(doktor.getName() + " oluþturuldu");
	        return doktor;
	    }
	 
	    private void waitingUntilDoktorAvailable() {
	        if (waiting.get()) {
	            waiting.set(false);
	            throw new DoktorNotFoundException("Müsait doktor yok");
	        }
	        waiting.set(true);
	        waiting(EXPIRED_TIME_IN_MILISECOND);
	    }
	     
	    private void waiting(long numberOfSecond) {
	        try {
	            TimeUnit.MILLISECONDS.sleep(numberOfSecond);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	            Thread.currentThread().interrupt();
	        }
	    }
}
