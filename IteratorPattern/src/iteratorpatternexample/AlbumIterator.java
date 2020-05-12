package iteratorpatternexample;
//bu sýnýfý kalýtan her sýnýf  tanýmlý olan foksiyonlarýda gerçekleþtirmesi lazým!
public interface AlbumIterator {//ITERATOR
    public boolean hasNext();//sonraki var mý yok mu bununla kontrol ediyor
	
	 public Album next();
}
