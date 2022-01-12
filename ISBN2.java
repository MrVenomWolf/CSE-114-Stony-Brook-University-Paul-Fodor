import java.util.Scanner;

public class ISBN2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int isbn = input.nextInt();
		
		int d1 = isbn / 100000000;
		int rem = isbn % 100000000;
		int d2 = rem / 10000000;
		rem %= 10000000;
		int d3 = rem / 1000000;
		rem %= 1000000;
		int d4 = rem / 100000;
		rem %= 100000;
		int d5 = rem / 10000;
		rem %= 10000;
		int d6 = rem / 1000;
		rem %= 1000;
		int d7 = rem / 100;
		rem %= 100;
		int d8 = rem / 10;
		rem %= 10;
		int d9 = rem;
		
		
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
		if (d10 == 10)
			System.out.print("X");
		else
			System.out.println(d10);
		
	}

}
