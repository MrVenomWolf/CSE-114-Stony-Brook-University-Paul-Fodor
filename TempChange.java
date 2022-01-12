import java.util.Scanner;

public class TempChange {
    public static void main(String[] args) {
        // insert input
        System.out.print("Enter temperature to convert from Celcius to Fahrenheit: ");
        Scanner in = new Scanner(System.in);
        double celcius = in.nextDouble();
        double fahrenheit = celcius * 1.8 +32;
        String output = celcius + " in Celcius is " + fahrenheit + " in Fahrenheit.";
        System.out.println(output);

        in.close();

    }

}