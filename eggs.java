// Anubrota Majumdar, 114586887
import java.util.Scanner;
public class eggs {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("The number of the eggs in order:- ");
		int eggsnum = input.nextInt();
		
		int doz = eggsnum / 12;
		int rem = eggsnum % 12;
        double total = doz * 3.25 + rem * 0.45;
		String output = "You ordered " + eggsnum + " eggs.That's " + doz + " dozen at $3.45 per dozen and " + rem + " loose eggs at 45 cents for a total of $" + total;
		System.out.println(output);

        input.close();

	}

}