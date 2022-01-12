import java.util.ArrayList;


public class UserSongPlaylist {
    
	private String uname;
	private ArrayList<PlaylistAnu> playlsts = new ArrayList<PlaylistAnu>();
	
	public UserSongPlaylist(String uname) {
		this.uname = uname;
		
	}
	
	public String getuname() {
	    return uname;
	}
	
	public void addPlaylist(PlaylistAnu playlist) {
		playlsts.add(playlist);
	}
	
	public PlaylistAnu removePlaylist(String playlistTitle) {
        
		for (PlaylistAnu rem: playlsts)
			
            if (rem.getplTitle().equals(playlistTitle)) {
				playlsts.remove(rem);

				return rem;
			}
		return null;
	}
	
	public PlaylistAnu getPlaylist(String playlistTitle) {
        
		for (PlaylistAnu tar: playlsts)
			if (tar.getplTitle().equals(playlistTitle)) {
				return tar;
			}
		return new PlaylistAnu("TEMP");
	}
	
	ArrayList<PlaylistAnu> getAllplaylsts(){
	    return this.playlsts;
	}
	
	public void makeCollaborativePlaylist(String playlistTitle, UserSongPlaylist friend) {
		friend.addPlaylist(getPlaylist(playlistTitle));
	}
	
	public String toString() {
		return uname  + " " + playlsts;
	}
}