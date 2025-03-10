//Set (Unordered, No Duplicates)
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice"); // Ignored

        System.out.println(uniqueNames); // Output: [Alice, Bob]
    }
}
