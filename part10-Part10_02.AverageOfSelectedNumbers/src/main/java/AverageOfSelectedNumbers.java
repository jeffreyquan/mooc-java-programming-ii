
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    
   

    public static void main(String[] args) {
        
        ArrayList<Integer> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            inputs.add(Integer.valueOf(input));
        }
        
        System.out.println("Print the average of the negative or the positive numbers? (n/p)");
        String command = scanner.nextLine();
       
        if (command.equals("n")) {
            System.out.println("Average of the negative numbers: " + inputs.stream().mapToInt(i -> i).filter(number -> number < 0).average().getAsDouble());
        } else {
            System.out.println("Average of the positive numbers: " + inputs.stream().mapToInt(i -> i).filter(number -> number > 0).average().getAsDouble());
        }
            
    }
}
