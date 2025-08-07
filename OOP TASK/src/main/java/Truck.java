

import java.util.Map;

public class Truck extends Vehicle {

    public Truck(String registrationNumber, String vehicleType, String fuelType, Map<String, Object> features) {
        super(registrationNumber, vehicleType, fuelType, features);
    }
    
    @Override
    public double calculatePrice() {
        double price = 80;
        if (features.containsKey("cargoCapacity")) {
            price += ((int) features.get("cargoCapacity")) * 0.05;
        }
        return price;
    }
}
