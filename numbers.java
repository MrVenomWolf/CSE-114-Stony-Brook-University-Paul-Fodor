//Anubrota Majumdar, 114586887
import java.util.Scanner;
public class numbers {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);	
				
		System.out.print("Enter an integer: ");
		int number = inp.nextInt();

			
		System.out.println("Is "+number+" divisible by 5 and 6? " + ((number % 5 == 0) && (number % 6 == 0)));
		System.out.println("Is "+number+" divisible by 5 or 6? " + 	((number % 5 == 0) || (number % 6 == 0)));
		System.out.println("Is "+number+" divisible by 5 of 6, but not both? " + ((number % 5 == 0) ^ (number % 6 == 0)));
	
	}
}