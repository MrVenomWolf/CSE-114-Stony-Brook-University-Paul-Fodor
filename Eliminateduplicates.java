import java.util.*;
public class Eliminateduplicates 
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the String: ");
    String str = in.nextLine();
    System.out.println(eliminateDuplicates(str));
  }

  public static String eliminateDuplicates(String str) 
  {
    String newStr =" ";
    for(int i = 0;  i<str.length();i++) 
    {
      char a = str.charAt(i);
      if(newStr.indexOf(a)==-1) 
      {
        newStr += a;
      }
    }
    return newStr;
  }
}