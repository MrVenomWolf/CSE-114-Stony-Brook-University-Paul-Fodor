import java.util.Scanner;

public class zipcode {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the zipcode: ");
		String string = in.next();
		
		if (string.matches("[0-9]{5}")) System.out.println("It is a valid zipcode");
		else System.out.println("It is an invalid zipcode");
		

	}

}
