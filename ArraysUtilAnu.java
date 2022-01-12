import java.util.*;
public class ArraysUtilAnu{
  public static int[] RandomArray(int size, int upperlimit) 
  {
    int ar[]=new int[size];
    Random rand = new Random(); 
    for(int i = 0; i<size; i++) 
    {
      ar[i]=rand.nextInt(upperlimit);
    }
    return ar;
  }
  public static int arraySum(int ar[]) 
  {
    int sum = 0;
    for(int i=0; i<ar.length; i++) 
    {
      sum +=ar[i];
    }
    return sum;
  }
  public static int countMultiplesOf(int[] numArr, int num) 
  {
    int count = 0;
    for (int i = 0; i < numArr.length; i++) 
    {
      if(isMultipleOf(numArr[i], num)) 
      {
        count++;
      }
    }
    return count;
  }
  private static boolean isMultipleOf(int num1, int num2) 
  {
    return num1 % num2 == 0 || num2 % num1 == 0;
  }
  public static int contains(int[] numArr, int num) 
  {
    int index = -1;
    for (int i = 0; i < numArr.length; i++) 
    {
      if(numArr[i] == num) 
      {
        index = i;
        break;
      }
    }
    return index;
  }
  public static void print(int[] numArr) 
  {
    for (int i=0; i< numArr.length; i++) 
    {
      System.out.print(numArr[i] + "  ");
    }
  }
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the upper limit for RandArray: ");
    
    int upperlimit=in.nextInt();
    System.out.print("Enter the size of RandArray: ");
    
    int size=in.nextInt();
    int[] array=RandomArray(size, upperlimit);
    print(array);
    
    System.out.println(arraySum(array));
    System.out.println("Enter a number to count multiples of");
   
    int n=in.nextInt();
    System.out.println(countMultiplesOf(array, n));
    System.out.println("Enter a number to check multiples");
    
    int number = in.nextInt();
    System.out.println("Enter another number");
    
    int x=in.nextInt();
    System.out.println(isMultipleOf(number, x));
    System.out.println("Enter a number to check");
   
    int y=in.nextInt();
    System.out.println(contains(array, y));
  }
}