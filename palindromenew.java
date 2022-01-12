import java.util.Scanner;
public class palindromenew {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String string = in.next();
		
		int backIndex = string.length() - 1;
		
		boolean isPalin = true;
		
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(backIndex)) {
				isPalin = false;
			    break;
			}
			backIndex--;
			
		}
		
		if (isPalin) System.out.println("The string entered is a palindrome");
		else System.out.println("The string entered is not a palindrome");
		
		

	}

}
