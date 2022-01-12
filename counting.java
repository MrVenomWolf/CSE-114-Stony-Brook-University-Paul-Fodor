import java.util.Scanner;


public class counting {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int total = 0;
        int pos = 0;
        int neg = 0;
        while (true)
        {
            System.out.print("Enter integers, type '0' to exit: ");
            int num = in.nextInt();
            if (num == 0)
                break;
            if (num > 0)
                pos++;
            else
                neg++;

            total += num;
        }

        System.out.println("Positive numbers: " + pos);
        System.out.println("Negative numbers: " + neg);
        System.out.println("Total sum: " + total);
        System.out.println("Average: " + (total/(1.0 * pos + neg)));
        in.close();

    }
}
