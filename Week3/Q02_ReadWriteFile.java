import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Q02_ReadWriteFile {
    public static void main(String[] args) {

        try {
            
            FileWriter writer = new FileWriter("data.txt");

            writer.write("Hello, this is my Java file handling practice.");
            writer.close();

            System.out.println("Data written successfully.");

            
            FileReader reader = new FileReader("data.txt");

            int ch;

            System.out.println("File content:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}