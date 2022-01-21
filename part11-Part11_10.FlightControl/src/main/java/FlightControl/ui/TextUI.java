package FlightControl.ui;

import FlightControl.domain.*;
import FlightControl.logic.FlightController;
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private FlightController fc;

    public TextUI() {
        this.scanner = new Scanner(System.in);
        this.fc = new FlightController();
    }
    
    public void start() {
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();
    }

    public void startAssetControl() {
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
            if (answer.equals("x")) {
                break;
            }
            if (answer.equals("1")) {
                addAirplane();
            } else if (answer.equals("2")) {
                addFlight();
            }
        }
    }
    
    public void startFlightControl() {
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
            if (answer.equals("x")) {
                break;
            }
            if (answer.equals("1")) {
                printAirplanes();
            } else if (answer.equals("2")) {
                printFlights();
            } else if (answer.equals("3")) {
                printAirplaneDetails();
            }
            
        }
    }
    
    public void printAirplanes() {
        fc.getAirplanes().stream()
                .forEach(System.out::println);
    }
    
    public void printFlights() {
        for (Flight flight : fc.getFlights()) {
            System.out.println(flight);
            System.out.println("");
        }
    }
    
    public void printAirplaneDetails() {
        System.out.println("Give the airplane id:");
        String id = scanner.nextLine();
        System.out.println(fc.getAirplane(id));
        System.out.println();
    }

    public void addAirplane() {
        System.out.println("Give the airplane id:");
        String id = scanner.nextLine();
        System.out.println("Give the airplane capacity:");
        int capacity = Integer.valueOf(scanner.nextLine());
        fc.addAirplane(id, capacity);
    }
    
    public void addFlight() {
        System.out.println("Give the airplane id:");
        String id = scanner.nextLine();
        System.out.println("Give the departure airport id:");
        String d = scanner.nextLine();
        System.out.println("Give the target airport id:");
        String t = scanner.nextLine();
        Airplane plane = getAirplane(id);
        fc.addFlight(plane, d, t);
    }
    
    public Airplane getAirplane(String id) {
        return fc.getAirplane(id);
    }
    
}
