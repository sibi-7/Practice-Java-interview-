//Reading and Writing Files
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {
        // Writing to a file
        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write("Hello, Java!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Reading from a file
        try (FileReader reader = new FileReader("test.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
