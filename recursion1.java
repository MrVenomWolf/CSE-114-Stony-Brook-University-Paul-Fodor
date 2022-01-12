/*  (Factorial.java) Write a method factorial(n) to compute the factorial of an integer n using iteration (n! = 1 * 2 * ... * n) and test it.
Note that you should use a long to store the computed result, and return a long (due to possible overflow issues past 13!)
*/
public class recursion1 {

    public static long factorial(int n) {
        if (n ==0 || n == 1) 
            return 1;
        return n * factorial(n-1);

        
    }

/*(SequenceSum.java) Write a recursive method to compute the following series:
m(i) = 1 + 1/2 + 1/3 + ... + 1/i
Write a test program that displays the value of m(i) for values of i between 1 and 10 (inclusive).*/

    public static double sequenceSum(int n) {
        if (n == 1)
            return 1;
        return (1.0 / n) + sequenceSum(n-1);
    }

/* (SumDigits.java) Write a recursive method sumDigits(n) that recursively adds up the digits in an integer. Use the following header:
public static int sumDigits(long n)
For example, sumDigits(234) would return 9 (because 2+3+4 = 9). Write a test program that reads in a number from the user and prints the sum of its digits.*/
    

    public static int SumDigits(long n) {
        String string = String.valueOf(n);
        if (string.length() < 2) return Integer.parseInt(string.substring(0,1));
        else return Integer.parseInt(string.substring(0,1)) + SumDigits(Long.parseLong(string.substring(1,string.length())));
    }

/* (ReverseDisplay.java) Write a recursive method reverseDisplay(n) that takes an integer argument and prints the digits of that integer in reverse order on the console.
For example, given the input 12345, the method would print out 54321. Use the following method header:

public static void reverseDisplay (int value)*/

    public static void reverseDisplay (int value) {
        String string = String.valueOf(value);

        if (string.length() < 2) {
            System.out.print(string.substring(0));

        }
        else {
            reverseDisplay(Integer.parseInt(string.substring(1,string.length())));
            System.out.print(string.substring(0,1));
        }
    }

/* (ReverseNumber.java) Write a recursive method reverse(n) that computes and returns the reverse of an integer
 (the reverse of an integer is a new integer that contains all the digits of the original, but in reverse order). 
For example, reverse(12345) returns 54321*/
    
    public static int reverseNumber(int value) {
        String string = String.valueOf(value);

        if (string.length() < 2) {
            return Integer.parseInt(string.valueOf(string.substring(0,1)));

        }

        int result = reverseNumber(Integer.parseInt(string.substring(1, string.length())));
        String resultString = String.valueOf(result);

        resultString += string.substring(0,1);

        return Integer.parseInt(resultString);
    }


}
