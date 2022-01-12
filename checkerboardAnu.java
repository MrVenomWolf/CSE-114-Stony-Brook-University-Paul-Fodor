import java.util.Arrays;

public class checkerboardAnu {
	public static void main(String[] args) {
	
	
		int [] [] checkerboard = new int[8][8];
	
		for (int i = 0; i < 8; j++) {
		
			for (int j = 0; j < 8; j++) {
			double randomvalue = Math.random();
			if (randomvalue > 0.5) checkerboard[i][j] = 1;
			
		    }
	
		}
	
	    displayboard(checkerboard);
	    checkhorizontal(checkerboard);
	    checkvertical(checkerboard);
	    checkdiagonal(checkboard);
	

}