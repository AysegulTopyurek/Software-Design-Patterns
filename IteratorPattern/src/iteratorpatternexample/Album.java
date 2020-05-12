package iteratorpatternexample;

public class Album {//Album bilgileri burada tutuyoruz
	private String singerName;
	private AlbumsType TYPE;
	
	public Album(String singer, AlbumsType type){
		this.singerName=singer;
		this.TYPE=type;
	}

	public String getSingerName() {
		return singerName;
	}

	public AlbumsType getTYPE() {
		return TYPE;
	}
	
	@Override
	public String toString(){
		return "SingerName="+this.singerName+", Type="+this.TYPE;
	}
	
}
