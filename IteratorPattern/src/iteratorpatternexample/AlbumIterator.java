package iteratorpatternexample;
//bu s�n�f� kal�tan her s�n�f  tan�ml� olan foksiyonlar�da ger�ekle�tirmesi laz�m!
public interface AlbumIterator {//ITERATOR
    public boolean hasNext();//sonraki var m� yok mu bununla kontrol ediyor
	
	 public Album next();
}
