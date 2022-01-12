// Anubrota Majumdar, 114586887
import java.util.Scanner;
import java.lang.Math;

public class pyramidtriangle {
  public static void main(String[] args) {
  
	  Scanner in = new Scanner(System.in);
        int i = 0;
        
        System.out.println("Enter the number of lines: ");
        
        int j = in.nextInt();
        j = j - 1; 
        
        double num = Math.pow(2, j);
        for (int row = 1; row <= num ; row += row) {

            for (int start = 0; start < j; start++) {
                System.out.print("    ");
            }

            for (int l = 1; l <= row; l += l) {
                System.out.printf("%4d", (l));
            }

            for (int r = i; r > 0 ; r /= 2 ) {
                System.out.printf("%4d", (r));
            }
            System.out.println();
        
            j--;
            i = row;
        }
    }

  
}