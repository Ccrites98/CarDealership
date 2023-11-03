package com.pluralsight;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class Dealership {
    private List<Vehicle> vehicles;
    public Dealership() {
        vehicles = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Thy vehicle hath been added to the record.");
    }
    public void removeVehicle(int index) {
        if (index >= 0 && index < vehicles.size()) {
            vehicles.remove(index);
            System.out.println("Thy vehicle hath been stricken from the record.");
        } else {
            System.out.println("Thou speaketh madness Try again, bozo.");
        }}
    public void listAllVehicles() {
        String csvFile = "src/main/resources/inventory.csv";
        String line;
        String cvsSplitBy = ("\\|");
        List<String[]> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] attributes = line.split(cvsSplitBy);
                records.add(attributes);
            }
            if (records.isEmpty()) {
                System.out.println("Woe! Our stocks hath been rendered empty!");
            } else {
                System.out.println("Verily, here be a compendium of our vehicles: ");
                for (String[] record : records) {
                    int vin = Integer.parseInt(record[0]);
                    int year = Integer.parseInt(record[1]);
                    String make = record[2];
                    String model = record[3];
                    String vehicleType = record[4];
                    String color = record[5];
                    int odometer = Integer.parseInt(record[6]);
                    double price = Double.parseDouble(record[7]);
                    System.out.println("VIN: " + vin);
                    System.out.println("Year: " + year);
                    System.out.println("Make: " + make);
                    System.out.println("Model: " + model);
                    System.out.println("Vehicle Type: " + vehicleType);
                    System.out.println("Color: " + color);
                    System.out.println("Odometer: " + odometer + " miles");
                    System.out.println("Price: $" + price);
                    System.out.println();
                }}
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }}
    public void run() {
    }}
