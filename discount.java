import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
    System.out.println("Retail Price: ");
    Scanner inputs = new Scanner(System.in);
    int price = inputs.nextInt();

    System.out.print("How many items are you buying: ");
    int numOfItems = inputs.nextInt();

    double discount = 0;
    if (numOfItems >= 10 && numOfItems <= 19) discount = 0.8;
    else if (numOfItems >= 20 && numOfItems <= 49) discount = 0.7;
    else if (numOfItems >= 50 && numOfItems <= 99) discount = 0.6;
    else if (numOfItems >= 100) discount = 0.5;

    double result = (price * discount) * numOfItems;
    int newDiscount = (int) ((1 - discount)*100);
    System.out.println("Discount: " + newDiscount + "%");
    System.out.println("Total prinve: " + result);

    inputs.close();

  }
}