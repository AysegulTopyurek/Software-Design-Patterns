package iteratorpatternexample;

public interface AlbumsCollection {//Aggregate
public void addAlbum(Album m);
	
	public void removeAlbum(Album m);
	
	public AlbumIterator iterator(AlbumsType type);//Agregate iterator tipinde nesne olu�turaca�� i�in 
}
