package com.pluralsight;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
public class Vehicle {
    int vin;
    int year;
    String make;
    String model;
    String vehicleType;
    String color;
    int odometer;
    double price;
    private double getPrice;
    private Vehicle[] vehicles;
    private int getYear;

    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }
    public int getVin() {
        return vin;
    }
    public int getYear() {
        return year;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public String getColor() {
        return color;
    }
    public int getOdometer() {
        return odometer;
    }
    public double getPrice() {
        return price;
    }
    public void setVin(int vin) {
        this.vin = vin;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public List<Vehicle> findVehiclePriceRange (double minPrice, double maxPrice) {
        List<Vehicle> result = new ArrayList<>();
        System.out.println("Here's the list: ");
        for (Vehicle vehicle : vehicles) {
            double Price = vehicle.getPrice;
            if (price >= minPrice && price <= maxPrice);
        }
     return result;
    }
    public List<Year> findVehicleYearRange (double minYear, double maxYear) {
        List<Year> result = new ArrayList<>();
        System.out.println("Here be the range: ");
        for (Vehicle vehicle : vehicles) {
            int year = vehicle.getYear;
            if (year >= minYear && year <= maxYear);
        }
        return result;
    }

    public String getMinYear() {
        return null;
    }

    public String getMaxYear() {
   return null;
    }
}

