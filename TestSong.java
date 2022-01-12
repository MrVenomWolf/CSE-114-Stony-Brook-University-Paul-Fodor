public class TestSong {
	public static void main(String[] args) {
		PlaylistAnu p0 = new PlaylistAnu("Study Songs");
		Song s1 = new Song("Studying1", "ABC", "3:00");
		Song s2 = new Song("Studying2", "XYZ", "4:50");
		
		p0.addSong(s1);
		p0.addSong(new Song("Studying3", "CDE", "2:50"));
		p0.addSong(new Song("Studying4", "EFG", "3:25"));
	
		PlaylistAnu p1 = new PlaylistAnu("Workout Songs");
		
		p1.addSong(new Song("Exercising1", "JKL", "3:00"));
		p1.addSong(new Song("Exercising2", "OPQRS", "2:50"));
		p1.addSong(new Song("Exercising3", "Wxyz", "4:35"));
		p1.addSong(new Song("Exercising3", "Stu", "3:25"));
	
		 
	
		UserSongPlaylist u0 = new UserSongPlaylist("user0");
		UserSongPlaylist u1 = new UserSongPlaylist("user1");
	
		SongLibrary.addUser(u0);
		SongLibrary.addUser(u1);    
	 
		u0.addPlaylist(p0);
		u1.addPlaylist(p1);

		
		System.out.println("ORIGINAL STUDY SONGS PlaylistAnu BY USER0:");
		for(PlaylistAnu p : SongLibrary.getUserPlaylists(u0)) {
			System.out.println(p);
		}
	
		System.out.println("ORIGINAL STUDY SONGS PlaylistAnu BY USER1:");
		for(PlaylistAnu p2 : SongLibrary.getUserPlaylists(u1)) {
			System.out.println(p2);
		}
	
		u0.makeCollaborativePlaylist("Study Songs", u1);
		
		u0.getPlaylist("Study Songs").setplTitle("Study Songs with "+u1.getuname());
		u1.getPlaylist("Study Songs with "+u1.getuname()).removeSong("Studying4");
		u1.getPlaylist("Study Songs with "+u1.getuname()).addSong(s2);
		u1.getPlaylist("Study Songs with "+u1.getuname()).swapSongs(s1, s2);
		u1.getPlaylist("Study Songs with "+u1.getuname()).swapSongs(new Song("Does Not Exist", "In PlaylistAnu", "5:00"), s2);
	
		System.out.println("UPDATED Playlist BY USER1:");
		for(PlaylistAnu p1 : SongLibrary.getUserPlaylists(u1)) {
			System.out.println(p1);
		}
	
		 
	
		u0.getPlaylist("Study Songs with "+u1.getuname()).sortsawngs();
		u1.getPlaylist("Workout Songs").sortsawngs();
		
		System.out.println("AFTER SORTING BOTH Playlists:");
		for(PlaylistAnu po : SongLibrary.getUserPlaylists(u1)) {
			System.out.println(po);
		}
	}
}