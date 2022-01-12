import java.util.Scanner;
public class email {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a email: ");
		String string = in.next();
		
		if (string.matches("(.)+@(.)+")) System.out.print("Valid email");
		else System.out.println("Invalid email");
		

	}

}
