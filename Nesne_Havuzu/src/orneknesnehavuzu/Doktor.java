package orneknesnehavuzu;

public class Doktor {
	private String isim;
	 
    public Doktor(String isim) {
        super();
        this.isim = isim;
    }
 
    public String getName() {
        return isim;
    }
 
    public void setName(String isim) {
        this.isim = isim;
    }
 
    @Override
    public String toString() {
        return "Doktor [isim=" + isim + "]";
    }
}

