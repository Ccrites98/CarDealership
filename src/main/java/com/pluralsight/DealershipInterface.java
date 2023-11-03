package com.pluralsight;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
public class DealershipInterface {
    private static double price;
    private static Vehicle[] vehicles;

    public static void main(String[] args) {
        Dealership app = new Dealership();
        app.run();
        while (true) {
            displayHomeScreen();
            Scanner keyboard = new Scanner(System.in);
            String choice = keyboard.nextLine();
        }
    }
    private static void displayHomeScreen() {
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        System.out.println("Greetings knave, input thy wishes:");
        System.out.println("1.) Search by Price Range");
        System.out.println("2.) Search by make/model");
        System.out.println("3.) Search by year range");
        System.out.println("4.) Search by color");
        System.out.println("5.) Search by mileage range");
        System.out.println("6.) Search by vehicle type");
        System.out.println("7.) List ALL vehicles");
        System.out.println("8.) Add a vehicle");
        System.out.println("9.) Remove a vehicle");
        System.out.println("99.) Give up, go home.");
        System.out.print("State thy choice: ");
        choice = keyboard.nextLine();

        while (true) {
            switch (choice) {
                case "1":
                    System.out.print("State thy minimum price, ye peasant: ");
                    double minPrice = keyboard.nextDouble();
                    System.out.print("State thy maximum price, noble lord: ");
                    double maxPrice = keyboard.nextDouble();
                    boolean found = false;
                    System.out.println("Vehicles within the specified price range:");
                    break;
                case "2":
                    System.out.print("State thy make: ");
                    String make = keyboard.nextLine();
                    System.out.print("State thy model: ");
                    String model = keyboard.nextLine();
                    System.out.println("Here be the vehicles matching these descriptors: ");
                    for (Vehicle vehicles : vehicles) {
                        if (vehicles.getMake().equalsIgnoreCase(make) && vehicles.getModel().equalsIgnoreCase(model)) ;
                        System.out.println(vehicles);
                        found = true;
                        break;
                    }
                case "3":
                    System.out.print("State thy minimum range of years for thy vehicle: ");
                    int minYear = keyboard.nextInt();
                    System.out.print("State thy maximum range of years for thy vehicle: ");
                    int maxYear = keyboard.nextInt();
                    System.out.println("Hark! Here be the vehicles matching thy range: ");
                    for (Vehicle vehicles : vehicles) {
                        if (vehicles.getMinYear().equalsIgnoreCase(String.valueOf(minYear)) && vehicles.getMaxYear().equalsIgnoreCase(String.valueOf(maxYear)));
                        System.out.println(vehicles);
                        found = true;
                        break;
                    }
                case "4":
                    System.out.print("State the color that thou desireth: ");
                    String color = keyboard.nextLine();
                    System.out.print("Here they be!: ");
                    for (Vehicle vehicles : vehicles) {
                        if (vehicles.getColor().equalsIgnoreCase(color));
                        System.out.println(vehicles);
                        found = true;
                        break;
                    }
            case "5":
                System.out.print("State thy mileage: ");
                int odometer = keyboard.nextInt();
                break;
            }
            case "6":
                System.out.print("State thy vehicle type thou desireth: ");
                String vehicleType = keyboard.nextLine();
                System.out.print("Here be what thou wisheth for!");


        }
    }}