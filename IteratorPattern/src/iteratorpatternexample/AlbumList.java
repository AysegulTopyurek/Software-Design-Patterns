package iteratorpatternexample;

import java.util.ArrayList;

import java.util.List;
public class AlbumList implements AlbumsCollection {//concreateAggregate
	
	private List<Album> albumsList;

	public AlbumList() {
		albumsList = new ArrayList<>();
	}

	public void addAlbum(Album m) {
		this.albumsList.add(m);
	}

	public void removeAlbum(Album m) {
		this.albumsList.remove(m);
	}

	@Override
	public AlbumIterator iterator(AlbumsType type) {
		return new AlbumIteratorList(type, this.albumsList);
	}
//ConcreateIterator
	private class AlbumIteratorList implements AlbumIterator {// �teratorden kal�t�lan s�n�f�m�z ConcreateIterator

		private AlbumsType type;
		private List<Album> albums;
		private int position;

		public AlbumIteratorList(AlbumsType ty,
				List<Album> albumsList) {
			this.type = ty;
			this.albums = albumsList;
		}

		@Override
		public boolean hasNext() {//�terat�rden kal�tt���m�z i�in bunu da tan�mlamam�z laz�m 
			                       //hasnext devam� varm� onu kontrol ediyor
			while (position < albums.size()) {
				Album m = albums.get(position);
				if (m.getTYPE().equals(type) || type.equals(AlbumsType.Mix)) {
					return true;
				} else
					position++;
			}
			return false;
		}

		@Override
		public Album next() {
			Album m = albums.get(position);
			position++;
			return m;
		}

	}

}
