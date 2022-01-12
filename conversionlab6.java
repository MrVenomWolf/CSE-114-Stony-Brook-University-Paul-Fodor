import java.util.Scanner;

public class conversionlab6 {
	public static void main(String[] args) 
	{	
	Scanner input = new Scanner(System.in);
		char option = ' ';
		do {
			
			System.out.println("A :- Convert pounds to kilos");
			System.out.println("B :- Convert kilos to pounds");
			System.out.println("C :- Convert kilometers to miles");
			System.out.println("D :- Convert miles to kilometers");
			System.out.println("E :- Convert Celsius to Fahrenheit");
			System.out.println("F :- Convert Fahrenheit to Celsius");
			System.out.println("X :- Exit");
			
			System.out.print("Enter your option : ");
			 option = input.nextLine().charAt(0);
			 
			 
			double pounds, kilos, km, miles, celsius, Fahrenheit;
			switch (option) 
			{
			case 'A' :
				System.out.print("Enter the quantity in pounds: ");
				pounds = input.nextDouble();
				kilos = poundsTokilos(pounds);
				System.out.println(pounds + " kilos is " + kilos + " pounds");
				break;
				
			case 'B' :
				System.out.print("Enter the quantity in kilos: ");
				kilos = input.nextDouble();
				pounds = kilosToPounds(kilos);
				System.out.print(kilos + " kilos is " + pounds + " pounds");
				break;
				
			case 'C' :
				System.out.print("Enter the length in kilometers: ");
				km = input.nextDouble();
				miles = kmToM(km);
				System.out.print(km + " kilometers is " + miles + " miles");
				break;
				
			case 'D' :
				System.out.print("Enter the length in miles: ");
				miles = input.nextDouble();
				km = milesTokm(miles);
				System.out.print(miles + " miles is " + km + " kilometers");
				break;
				
			case 'E' :
				System.out.print("Enter the temperature in Celcius: ");
				celsius = input.nextDouble();
				Fahrenheit = celsiusToFahrenheit(celsius);
				System.out.print(celsius + " celsius is " + Fahrenheit + " fahrenheit");
				break;
				
			case 'F' :
				System.out.print("Enter the temperature in Fahrenheit: ");
				Fahrenheit = input.nextDouble();
				celsius = FahrenheitTocelsius(Fahrenheit);
				System.out.print(Fahrenheit + " Fahrenheit is " + celsius + " celsius");
				break;
				
			case 'X' :
				break;
			default:
				option = 'X';
			}
			
			
			if(option != 'X') {
				input.nextLine();
				System.out.println();
			}
		
		}while(option != 'X');
		
		
	}
	
	
	public static double poundsTokilos(double pounds) {
		return 0.453592*pounds;
	}
	public static double kilosToPounds(double kilos) {
		return 2.20462*kilos;
	}
	public static double kmToM(double km) {
		return 0.621371*km;
	}
	public static double milesTokm(double miles) {
		return 1.60934*miles;
	}
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0/5)*(celsius + 32);
	}
	public static double FahrenheitTocelsius(double Fahrenheit) {
		return (5.0/9)*(Fahrenheit - 32);
	}
		
		
				
				
}
