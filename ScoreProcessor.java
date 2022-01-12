import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScoreProcessor {

    public static void main(String[] args) throws FileNotFoundException    
    {
        int numScores = 0;
        int total = 0;
        String fileName = args[0];
        File file = new File("./" + fileName);
        Scanner in = new Scanner(file);
        while (in.hasNextLine() && in.hasNextInt())
        {
            int num = in.nextInt();
            total += num;
            numScores++;
            
        }

        System.out.println("Total: " + total);
        System.out.println("Average: " + total * 1.0/numScores);
    }


}

