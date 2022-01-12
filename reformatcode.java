import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class reformatcode {

    public static void main(String[] args) throws FileNotFoundException {

        String filename = args[0];
        File file = new File("./" + filename);
        Scanner in = new Scanner(file);
        File file2 = new File("./" + filename.replace(".java", "") + "2.java");
        PrintWriter writer = new PrintWriter(file2);
        String prevLine = "";
        boolean writePrev = false;


        while (in.hasNextLine()) {
            if (writePrev) writer.write(prevLine);
            String line = in.nextLine();

            if (line.matches("[ \t]*\\{")) {
                writer.write(" {\n");
                writePrev = false;
            }

            else {

                if (writePrev) writer.write("\n");
                prevLine = line;
                writePrev = true;
            }
        }

        writer.write(prevLine);
        writer.close();
        in.close();


        writer = new PrintWriter(file);
        in = new Scanner(file2);
        while (in.hasNextLine()) {
            writer.write(in.nextLine());
            writer.write("\n");

        }

        writer.close();
        in.close();

        file2.delete();

    }
            

}
