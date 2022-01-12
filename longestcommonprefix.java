import java.util.Scanner;

public class longestcommonprefix {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter the first string here: ");
		String string1 = inp.nextLine();
		
		System.out.print("Enter the second string here: ");
		String string2 = inp.nextLine();

		int index = 0;				
		String prefix = "";		

		
		while (string1.charAt(index) == string2.charAt(index)) {
			prefix += string1.charAt(index);
			index++;
		}

		
		if (prefix.length() > 0)
			
			System.out.println("The commmon prefix is " + prefix);
		else
			System.out.println(string1 + " and " + string2 + " have no commmon prefix");
	
	}
	
}



