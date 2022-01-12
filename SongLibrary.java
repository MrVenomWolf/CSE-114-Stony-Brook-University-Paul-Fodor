import java.util.ArrayList;


public class SongLibrary{
    
	private static ArrayList<UserSongPlaylist> people = new ArrayList<UserSongPlaylist>();
    
    public static void addUser(UserSongPlaylist user) {
        people.add(new UserSongPlaylist(user.getuname()));
    }
    
    public UserSongPlaylist removeUser(String userName) {
        
    	for (UserSongPlaylist rem: people)
            if (rem.getuname().equals(userName)) {
                people.remove(rem);
                return rem;
            }
    	
        return null;
    }

    static ArrayList<PlaylistAnu> getUserPlaylists(UserSongPlaylist user){
        
    	for (UserSongPlaylist rem: people)
            
    		if (rem.getuname().equals(user.getuname())) {
                return user.getAllplaylsts();
            }
         return null;
    }
}