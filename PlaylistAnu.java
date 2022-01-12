import java.util.ArrayList;
import java.util.Collections;



public class PlaylistAnu{

    private String plTitle;
    private ArrayList<Song> sawngs = new ArrayList<Song>();
    
   
    public PlaylistAnu(String plTitle) {
        this.plTitle = plTitle;
    }
    
  
    public String getplTitle() {
        return plTitle;
    }
    public void setplTitle(String plTitle) {
        this.plTitle = plTitle;
    }
    
    
    public void addSong(Song song) {

        sawngs.add(new Song(song.getSongName(),song.getArtistName(),song.getDuration()));
    }
    
    
    public Song deleteSong(String songName) {
        for (Song r: sawngs)

            if (r.getSongName().equals(songName)) {
                sawngs.remove(r);
                
				return r;
            }

        return null;
    }
    
    
    public void swapsawngs(Song song1, Song song2) {
        int s1 = 0, s2 = 0;
        boolean flag1 = false, flag2 = false;
        for (Song r: sawngs) {

            if (r.getSongName().equals(song1.getSongName())) {
                 s1 = sawngs.indexOf(r);
                 flag1 = true; 
            }

            if (r.getSongName().equals(song2.getSongName())) {
                 s2 = sawngs.indexOf(r);
                 flag2 = true;
            }
        }

        if(flag1 & flag2 == true) {
        Collections.swap(sawngs, s1, s2);
        }
    }
    
   
    public String ttime() {
        int mins = 0;
        int sec = 0;

        for (Song r: sawngs) {
			
                String[] timeSplit = r.getDuration().split(":"); 
                int min = Integer.parseInt(timeSplit[0]);  
                int second = Integer.parseInt(timeSplit[1]);  
                
                mins += min;
                sec += second;
            }

        int total_min, total_sec;
        total_sec = sec % 60;
        total_min = mins + (sec/60);
        
        return total_min + "mins, " + total_sec + "secs";
    
    }
    
    
    public void sortsawngs() {

        Collections.sort(sawngs);

    }
    
    public String toString() {

        String res = plTitle  + " " + ttime() +  "\n";

                for (Song ind: sawngs) 
                    res +=  ind.toString() + "\n";
					
                return res;
    }

}