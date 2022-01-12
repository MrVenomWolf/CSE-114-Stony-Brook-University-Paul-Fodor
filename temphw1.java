//Anubrota Majumdar, 114586887
import java.util.Scanner;
public class temphw1 {
	
	public static void main(String[] args) {
		System.out.println("Enter the temperature between -58 Fahrenheit and 41 Fahrenheit: ");
	    Scanner input = new Scanner(System.in);
	     
   		double temp = input.nextDouble();
	    		System.out.print("Enter the wind speed which is greater than 2 mph in miles per hour: ");
	    		double speed = input.nextDouble();

	    		double wind_chill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16);

	    		
	    		System.out.println("The wind chill index is " + wind_chill);
	    	
	 }
		

}
