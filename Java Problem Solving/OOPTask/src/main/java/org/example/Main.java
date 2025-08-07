package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class VehicleOrderSystem {
    // Inner class to represent a Vehicle
    class Vehicle {
        String registrationNumber;
        String vehicleType; // e.g., Car, Motorcycle, Truck
        String fuelType; // Petrol, Diesel, Electric, Hybrid
        boolean isAvailable;
        Map<String, Object> features; // e.g., sunroof, cargo capacity, etc.

        Vehicle(String regNum, String type, String fuel, Map<String, Object> feats) {
            this.registrationNumber = regNum;
            this.vehicleType = type;
            this.fuelType = fuel;
            this.isAvailable = true;
            this.features = feats;
        }
    }

    // List to store all vehicles
    List<Vehicle> inventory;

    public VehicleOrderSystem() {
        inventory = new ArrayList<>();
        // Initialize with some vehicles
        Map<String, Object> carFeatures = new HashMap<>();
        carFeatures.put("sunroof", true);
        carFeatures.put("transmission", "Automatic");
        inventory.add(new Vehicle("ABC123", "Car", "Petrol", carFeatures));

        Map<String, Object> truckFeatures = new HashMap<>();
        truckFeatures.put("cargoCapacity", 1500);
        inventory.add(new Vehicle("XYZ789", "Truck", "Diesel", truckFeatures));
    }

    // Method to check availability
    public boolean checkAvailability(String type, Map<String, Object> desiredFeatures) {
        for (Vehicle v : inventory) {
            if (v.vehicleType.equals(type) && v.isAvailable) {
                boolean matches = true;
                for (String key : desiredFeatures.keySet()) {
                    if (!v.features.containsKey(key) || !v.features.get(key).equals(desiredFeatures.get(key))) {
                        matches = false;
                        break;
                    }
                }
                if (matches) {
                    return true;
                }
            }
        }
        return false;
    }

    // Method to reserve a vehicle
    public Vehicle reserveVehicle(String type, Map<String, Object> desiredFeatures) {
        for (Vehicle v : inventory) {
            if (v.vehicleType.equals(type) && v.isAvailable) {
                boolean matches = true;
                for (String key : desiredFeatures.keySet()) {
                    if (!v.features.containsKey(key) || !v.features.get(key).equals(desiredFeatures.get(key))) {
                        matches = false;
                        break;
                    }
                }
                if (matches) {
                    v.isAvailable = false;
                    return v;
                }
            }
        }
        return null; // No matching vehicle available
    }

    // Method to calculate price based on vehicle and features
    public double calculatePrice(Vehicle v) {
        double basePrice = 0;
        switch (v.vehicleType) {
            case "Car":
                basePrice = 50;
                if (v.features.containsKey("sunroof") && (Boolean) v.features.get("sunroof")) {
                    basePrice += 10;
                }
                break;
            case "Truck":
                basePrice = 80;
                if (v.features.containsKey("cargoCapacity")) {
                    basePrice += ((int) v.features.get("cargoCapacity")) * 0.05;
                }
                break;
            case "Motorcycle":
                basePrice = 30;
                break;
        }
        return basePrice;
    }

    // Method to place an order
    public void placeOrder(String type, Map<String, Object> desiredFeatures) {
        if (checkAvailability(type, desiredFeatures)) {
            Vehicle v = reserveVehicle(type, desiredFeatures);
            double price = calculatePrice(v);
            System.out.println("Vehicle reserved: " + v.registrationNumber);
            System.out.println("Total price: $" + price);
        } else {
            System.out.println("No available vehicle matches your criteria.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        VehicleOrderSystem system = new VehicleOrderSystem();

        // Example order for a Car with sunroof and automatic transmission
        Map<String, Object> features = new HashMap<>();
        features.put("sunroof", true);
        features.put("transmission", "Automatic");
        system.placeOrder("Car", features);

        // Example order for a Truck with cargo capacity 1500
        Map<String, Object> truckFeatures = new HashMap<>();
        truckFeatures.put("cargoCapacity", 1500);
        system.placeOrder("Truck", truckFeatures);
    }

}