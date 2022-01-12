
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class javareplacer {

    public static void main(String[] args) throws FileNotFoundException {

        String fileName = args[0];
        File file = new File("./"+ fileName);
        File file2 = new File("./"+ fileName.replace(".txt", "") + "toHTML.txt");

        Scanner in = new Scanner(file);
        PrintWriter writer = new PrintWriter(file2);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String replace = line.replace("Java", "HTML");
            
            System.out.println(line);
            System.out.println(replace);

            writer.print(replace + "\n");

     
        }
        

        Scanner in2 = new Scanner(file2);


        writer.close();
        in.close();
    
    
    
    }

}
