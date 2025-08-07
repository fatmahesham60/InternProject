import java.util.*;

public class VehicleOrderSystem {
    List<Vehicle> inventory;

    public VehicleOrderSystem() {
        inventory = new ArrayList<>();
        Map<String, Object> carFeatures = new HashMap<>();
        carFeatures.put("sunroof", true);
        carFeatures.put("transmission", "Automatic");
        inventory.add(new org.example.VehicleOrderSystem.Vehicle("ABC123", "Car", "Petrol", carFeatures));

        Map<String, Object> truckFeatures = new HashMap<>();
        truckFeatures.put("cargoCapacity", 1500);
        inventory.add(new org.example.VehicleOrderSystem.Vehicle("XYZ789", "Truck", "Diesel", truckFeatures));
    }



    // Method to check if a vehicle matches the desired type and features
    private boolean isMatching(Vehicle v, String type, Map<String, Object> desiredFeatures) {
        if (!v.vehicleType.equals(type) || !v.isAvailable) {
            return false;
        }
        for (String key : desiredFeatures.keySet()) {
            if (!v.features.containsKey(key) || !v.features.get(key).equals(desiredFeatures.get(key))) {
                return false;
            }
        }
        return true;
    }

    // Method to check availability
    public boolean checkAvailability(String type, Map<String, Object> desiredFeatures) {
        for (Vehicle v : inventory) {
            if (isMatching(v, type, desiredFeatures)) {
                return true;
            }
        }
        return false;
    }

    // Method to reserve a vehicle
    public Vehicle reserveVehicle(String type, Map<String, Object> desiredFeatures) {
        for (Vehicle v : inventory) {
            if (isMatching(v, type, desiredFeatures)) {
                v.isAvailable = false;
                return v;
            }
        }
        return null;
    }

}
