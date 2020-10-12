package FlightControl;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        FlightControl flightcontrol = new FlightControl();
        Scanner scanner = new Scanner(System.in);
        flightcontrol.start(scanner);
    }
}
