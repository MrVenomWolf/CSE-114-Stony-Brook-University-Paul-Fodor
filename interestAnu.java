// Anubrota Majumdar, 114586887
import java.util.Scanner;

public class interestAnu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
		System.out.print("Loan Amount: ");
		
		double loanamount = in.nextDouble();
		System.out.print("Number of Years: ");
		
		int numberofyears = in.nextInt();


		System.out.println(
			"Interest Rate    Monthly Payment    Total Payment");
		

		for (double i = 5.0; i <= 8; i += 0.125) {
			  System.out.printf("%-5.3f", i);
			  System.out.print("%           ");
			
			  double monthlyinterestrate = i / 1200;
		      double monthlypayment = loanamount * monthlyinterestrate / (1 - 1 / Math.pow(1 + monthlyinterestrate, numberofyears * 12));
			
			  System.out.printf("%-19.2f", monthlypayment);
			  System.out.printf("%-8.2f\n",(monthlypayment * 12) * numberofyears);
		}
	}
}