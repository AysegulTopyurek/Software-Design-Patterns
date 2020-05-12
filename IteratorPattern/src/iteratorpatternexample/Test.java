package iteratorpatternexample;

public class Test {

	public static void main(String[] args) {
		AlbumsCollection albums = populateAlbums();
		AlbumIterator baseIterator = albums.iterator(AlbumsType.Mix);
		while (baseIterator.hasNext()) {
			Album m = baseIterator.next();
			System.out.println(m.toString());
		}
		System.out.println("******");
		// Album Type Iterator
		AlbumIterator englishIterator = albums.iterator(AlbumsType.Top100America);
		while (englishIterator.hasNext()) {
			Album m = englishIterator.next();
			System.out.println(m.toString());
		}
	}

	private static AlbumsCollection populateAlbums() {
		AlbumsCollection albums = new AlbumList();
		albums.addAlbum(new Album("Drake", AlbumsType.Top100America));
		albums.addAlbum(new Album("Rihanna", AlbumsType.Top100America));
		albums.addAlbum(new Album("Nil›pek", AlbumsType.Top100Turkey));
		albums.addAlbum(new Album("Special", AlbumsType.Mix));
		
		return albums;
	}
		

	}


