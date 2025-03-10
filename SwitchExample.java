
import java.util.Scanner;


public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number (1 for Monday, 2 for Tuesday, ..., 7 for Sunday): ");
        int day = scanner.nextInt();
        String dayName;

        // Use a switch statement
        
        switch (day) 
        {
            case 1:
                dayName = "Monday";
                break;
            
            case 2:
                dayName = "Tuesday";
                break;
            
            case 3:
                dayName = "Wednesday";
                break;
            
            case 4:
                dayName = "Thursday";
                break;
            
            case 5:
                dayName = "Friday";
                break;
            
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        // Print the result
        System.out.println("The day is " + dayName);
    }
}
