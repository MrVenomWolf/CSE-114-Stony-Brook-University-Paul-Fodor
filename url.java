import java.util.Scanner;
public class url {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a url: ");
		String string = in.next();
		
		
	    if (string.matches("http[s]{0,1}://www.(.){2,}\\.(.){2,3}")) System.out.println("The url is valid ");
	    else System.out.println("The url input is invalid ");
	    
	

	}

}
