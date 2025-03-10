//List (Ordered Collection, Allows Duplicates)
import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // Duplicates allowed

        System.out.println(names); // Output: [Alice, Bob, Alice]
    }
}
