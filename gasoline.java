import java.util.Scanner;
public class gasoline {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the minutes on the track: ");
		double minutes = in.nextDouble();
		System.out.print("Input the mph of the car: ");
		double mph = in.nextDouble();
		System.out.print("Input the mpg of the car: ");
		double mpg = in.nextDouble();
		System.out.println("Consumed gas: " + minutes/60 * mph * 1/mpg);
		in.close();
		
		

	}

}
