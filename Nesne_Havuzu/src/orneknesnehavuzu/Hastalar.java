package orneknesnehavuzu;
import java.util.Random;
	import java.util.concurrent.TimeUnit;
public class Hastalar implements Runnable {
	     
	    private Doktor_sirasi doktorSirasi;
	     
	    public Hastalar(Doktor_sirasi doktorSirasi) {
	        this.doktorSirasi = doktorSirasi;
	    }
	 
	    @Override
	    public void run() {
	        takeADoktor();
	    }
	 
	    private void takeADoktor() {
	        try {
	            System.out.println("yeni hasta: " + Thread.currentThread().getName());
	            Doktor doktor= doktorSirasi.getDoktor();
	             
	            TimeUnit.MILLISECONDS.sleep(randInt(10000, 15000)); 
	             
	            doktorSirasi.release(doktor);
	            System.out.println("Hastalar: " + Thread.currentThread().getName());
	        } catch (InterruptedException | DoktorNotFoundException e) {
	            System.out.println("hasta isteði reddedildi: " + Thread.currentThread().getName());
	        }
	    }
	     
	    public static int randInt(int min, int max) {
	        return new Random().nextInt((max - min) + 1) + min;
	    }
}
