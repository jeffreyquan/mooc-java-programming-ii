/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author jeffreyquan
 */
public class FlightControl {
    
    private HashMap<String, Airplane> airplanes = new HashMap<>();
    private HashMap<String, Flight> flights = new HashMap<>();
 
    public void start(Scanner scanner) {
        startAssetControl(scanner);
        System.out.println();
        startFlightControl(scanner);
        System.out.println();
    }
 
    private void startAssetControl(Scanner scanner) {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
 
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
 
            System.out.print("> ");
            String answer = scanner.nextLine();
 
            if (answer.equals("1")) {
                addAirplane(scanner);
            } else if (answer.equals("2")) {
                addFlight(scanner);
            } else if (answer.equals("x")) {
                break;
            }
        }
    }
 
    private void addAirplane(Scanner scanner) {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());
 
        Airplane airplane = new Airplane(id, capacity);
        airplanes.put(id, airplane);
    }
 
    private void addFlight(Scanner scanner) {
        System.out.print("Give the airplane id: ");
        Airplane airplane = askForAirplane(scanner);
        System.out.print("Give the departure airport id: ");
        String departureID = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String targetID = scanner.nextLine();
 
        Flight flight = new Flight(airplane, departureID, targetID);
        flights.put(flight.toString(), flight);
    }
 
    private void startFlightControl(Scanner scanner) {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();
 
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
 
            System.out.print("> ");
            String answer = scanner.nextLine();
            if (answer.equals("1")) {
                printAirplanes();
            } else if (answer.equals("2")) {
                printFlights();
            } else if (answer.equals("3")) {
                printAirplaneDetails(scanner);
            } else if (answer.equals("x")) {
                break;
            }
        }
    }
 
    private void printAirplanes() {
        airplanes.values().stream().forEach(l -> System.out.println(l));
    }
 
    private void printFlights() {
        flights.values().stream().forEach(l -> System.out.println(l));
        System.out.println();
    }
 
    private void printAirplaneDetails(Scanner scanner) {
        System.out.print("Give the airplane id: ");
        Airplane airplane = askForAirplane(scanner);
        System.out.println(airplane);
        System.out.println();
    }
 
    private Airplane askForAirplane(Scanner scanner) {
        Airplane airplane = null;
        while (airplane == null) {
            String id = scanner.nextLine();
            airplane = airplanes.get(id);
 
            if (airplane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }
 
        return airplane;
    }
}
