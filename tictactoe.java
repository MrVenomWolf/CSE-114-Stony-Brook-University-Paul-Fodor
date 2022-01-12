import java.util.Scanner;
public class tictactoe {
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	boolean firstplayersturn = true; 
	
	String[][] b = new String[3][3];
	for (int i=0; i<b.length; i++) {
		for(int j=0; j< b.length; j++) {
			b[i][j] = "_"; 
		}
	}
	while (true) {
		printboard(b);
		if (firstplayersturn) {
			
			System.out.print("Player 1: Enter a row and column for your piece: ");
		}
		else {
			System.out.print("Player 2: Enter a row and column for your piece: ");
	}
		
		int row = s.nextInt();
		int column = s.nextInt();
		if (firstplayersturn) {
			
			boolean validTurn = taketurn(b, row, column, "X");
			if (!validTurn) { 
				
				System.out.println("Invalid.Try again.");
				continue;
			}
		}
		else { boolean validTurn = taketurn(b, row, column, "O");
		
		
		if (!validTurn) { 
			System.out.println("Invalid move. Try again.");
			continue;
		}
		}
		String result = checkwin(b);
		if (result.equals("Unfinished")) {
			firstplayersturn = !firstplayersturn;
			continue;
		}
		
		System.out.println("\n");
		printboard(b);
		if (result.equals("Win")) {
			if (firstplayersturn) System.out.println("Congrats Player1! you win");
			else System.out.println(" Congrats Player2! you win");
		}
		
		if (result.equals("Draw")) {
			System.out.println("Draw");
		} break;
	
} s.close();

}

public static boolean taketurn(String[][] matrix, int row, int column, String piece) {
	
	if (matrix[row][column].equals("O") || matrix[row][column].equals("X")) return false;
	else { matrix[row][column] = piece;
	return true;
	}
}
public static void printboard(String[][] matrix) {
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j<matrix[0].length; j++) {
			System.out.println(matrix[i][j] + " ");	
		}System.out.println("");
	}
}

public static String checkwin(String[][] matrix) {
	int count = 0;
	
	for(int i = 0; i < matrix.length; i++) {
		int inrow = 0;
		for ( int j = 0; j < matrix[0].length; j++) {
			if (matrix[i][j].equals("O") || matrix[i][j].equals("X")) count++;
			if (matrix[i][j].equals("O")) inrow++;
			if (matrix[i][j].equals("X")) inrow--;
		}
		if (Math.abs(inrow) == 3) return "Win";
	}
	
	for (int j = 0; j < matrix.length; j++) {
		int incolumn = 0;
		
		for(int i = 0; i < matrix.length; i++) {
			if (matrix[i][j].equals("O")) incolumn++;
			if (matrix[i][j].equals("X")) incolumn--;
		}
		if (Math.abs(incolumn) == 3) return "Win";	
	}
	if (matrix[1][1].equals("O") || matrix[1][1].equals("X")) {
		
		if (matrix[0][0].equals(matrix[1][1]) && matrix[1][1].equals(matrix[2][2])) return "Win";
		if (matrix[0][2].equals(matrix[1][1]) && matrix[1][1].equals(matrix[2][0])) return "Win";
	}
	
	if (count == 9) return "Draw";
	else return "Unfinished";
}

}