
import java.util.*;

public class VehicleInventory {

    List<Vehicle> inventory = new ArrayList<>();

    public VehicleInventory() {
        Map<String, Object> carFeatures = new HashMap<>();
        carFeatures.put("sunroof", true);
        carFeatures.put("transmission", "Automatic");
        inventory.add(new Car("ABC123", "Car", "Petrol", carFeatures));

        Map<String, Object> truckFeatures = new HashMap<>();
        truckFeatures.put("cargoCapacity", 1500);
        inventory.add(new Truck("XYZ789", "Truck", "Diesel", truckFeatures));
    }

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

}