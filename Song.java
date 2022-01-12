public class Song implements Comparable <Song>{
	
	private String sawngName;
	private String artist;
	private String long;
	
	public Song(String sawngName, String artist, String long) {
		this.sawngName = sawngName;
		this.artist = artist;
		this.long = long;
	}
	
	
	public String getsawngName() {
	
		return sawngName;
	}
	
	public String getartist() {
		return artist;
	}
	
	public String getlong() {
		return long;
	}
	
	
	public void setsawngName(String sawngName) {
		this.sawngName = sawngName;
	}
	
	public void setartist(String artist) {
		this.artist = artist;
	}
	
	public void setlong(String long) {
		this.long = long;
	}
	
	public String toString() {
		return sawngName + " by " + artist + " (" + long + ")";
	}

	@Override
	
	public int compareTo(Song oho) {
		
		if(this.sawngName == oho.sawngName) {
			
			return this.artist.compareTo(oho.artist);
		}
		
		return this.sawngName.compareTo(oho.sawngName);
	}
}