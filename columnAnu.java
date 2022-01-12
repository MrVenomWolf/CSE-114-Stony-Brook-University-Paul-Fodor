import java.util.Scanner;

public class columnAnu {
	
	public static void main(String[] args) {
		
		double[][] matrix = getmatrix();

		
		System.out.println("Sum of the elements in the major diagonal is " + 
			summajordiagonal(matrix));
	}

	
	public static double[][] getmatrix() {
		
		Scanner input = new Scanner(System.in);

		
		final int rows = 4;
		final int columns = 4;
		
		double[][] m = new double[rows][columns];
		
	
		System.out.println("Enter the 4-by-4 matrix in row by row:");
		
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				m[row][col] = input.nextDouble(); 
			}
		}
		return m;
	}


	public static double summajordiagonal(double[][] m) {
		
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		
		return sum;
	}
}