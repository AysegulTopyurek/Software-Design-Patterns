package orneknesnehavuzu;

public class Main {
 
    public static final int NUM_OF_PAT�ENT = 8;
 
    public static void main(String[] args) {
        Doktor_sirasi doktorSirasi = new Doktor_sirasi();
        for (int i = 1; i <= NUM_OF_PAT�ENT; i++) {
            Runnable hasta = new Hastalar(doktorSirasi);
            Thread thread = new Thread(hasta);
            thread.start();
        }
    }

}