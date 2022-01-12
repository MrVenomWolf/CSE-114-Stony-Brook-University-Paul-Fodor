import java.util.Scanner;
 
public class perfectnumbersAnu{
 
 public static void main(String[] args) {
 

      Scanner in = new Scanner(System.in);


       System.out.println("Enter the number: ");
       int n = in.nextInt();

    int sumOfDivisor = 0;
    int numberOfPerfect = 0;
 
  for (int i = 1; i <= n; i++) 
  {


    for (int j = 1; j < i; j++) 
    {
      if (i % j == 0) {

      sumOfDivisor += j;
    }
   }
 
   if (sumOfDivisor == i) {
    System.out.println(i + " is a perfect number");

    numberOfPerfect++;
   }

   sumOfDivisor = 0;
  }
  System.out.println("Total number of perfect number is " + numberOfPerfect);
 
 }
}