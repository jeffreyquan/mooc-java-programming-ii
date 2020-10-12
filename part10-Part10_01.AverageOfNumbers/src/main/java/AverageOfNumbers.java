
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        
        while (true) {
            System.out.println("Input numbers, type \"end\" to stop.");
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            inputs.add(Integer.valueOf(input));
        }
        
        double average = inputs.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
                
        System.out.println("average of the numbers: " + average);

    }
}
