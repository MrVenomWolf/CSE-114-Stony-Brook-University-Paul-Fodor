import java.util.Scanner;

public class changemakerdollar {

     public static void main(String[] args) {

          int hundreed, fifties, twenty, tens, fives, ones, rem, qs, ds, ns, ps;

          System.out.print("Enter amount: ");
          Scanner input = new Scanner(System.in);
          int change = (int)(input.nextDouble() * 100);
          hundreed = change / 10000;
          rem = change % 10000;
          fifties = rem / 5000;
          rem = rem % 5000;
          twenty = rem / 2000;
          rem = rem % 2000;
          tens = rem / 1000;
          rem = rem % 1000;
          fives = rem / 500;
          rem = rem % 500;
          ones = rem / 100;
          rem = rem % 100;
          qs = rem / 25;
          rem = rem % 25;
          ds = rem / 10;
          rem = rem % 10;
          ns = rem / 5;
          ps = rem % 5;
          if(hundreed!=0)
              System.out.println(hundreed + " x $100 bills");
          if(fifties!=0)
              System.out.println(fifties + " x $50 bills");
          if(twenty!=0)
              System.out.println(twenty + " x $20 bills");
          if(tens!=0)
              System.out.println(tens + " x $10 bills");
          if(fives!=0)
              System.out.println(fives + " x $5 bills");
          if(ones!=0)
              System.out.println(ones + " x $1 bills");
          if(qs!=0)
              System.out.println(qs + " x 25c coins");
          if(ds!=0)
              System.out.println(ds + " x 10c coins");
          if(ns!=0)
              System.out.println(ns + " x 5c coins");
          if(ps!=0)
              System.out.println(ps + " x 1c coins");
     }

}