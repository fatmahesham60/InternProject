

import java.util.*;

public class Main{

public static void main(String[] args) {
    VehicleOrderSystem system = new VehicleOrderSystem();

    Map<String, Object> features = new HashMap<>();
    features.put("sunroof", true);
    features.put("transmission", "Automatic");
    system.placeOrder("Car", features);
    Map<String, Object> truckFeatures = new HashMap<>();
    truckFeatures.put("cargoCapacity", 1500);
    system.placeOrder("Truck", truckFeatures);
}

}