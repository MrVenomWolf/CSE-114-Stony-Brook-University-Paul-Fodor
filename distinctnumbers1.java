import java.util.Scanner;

public class distinctnumbers1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int[] distinctnumbers = new int[10]; 
		
		int num; 				
		
		int count = 0;			

		
		System.out.print("Enter ten numbers: ");
		
		for (int i = 0; i < 10; i++) {
			num = in.nextInt();

		
			if (isDistinct(distinctnumbers, num)) {
				distinctnumbers[count] = num;
				count++;	
			}
		}

		
		System.out.println("Number of distinct numbers is " + count);
		
		System.out.print("Required distinct numbers are");
		
		for (int i = 0; i < distinctnumbers.length; i++) {
			if (distinctnumbers[i] > 0)
				System.out.print(" " + distinctnumbers[i]);
		}
		System.out.println();
	}


	public static boolean isDistinct(int[] array, int num) {
		
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) 
				return false;
		}
		return true;
	}
}