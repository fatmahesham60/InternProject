
import java.util.Map;

public class Car extends Vehicle {

    public Car(String registrationNumber, String vehicleType, String fuelType, Map<String, Object> features) {
        super(registrationNumber, vehicleType, fuelType, features);
    }

    @Override
    public double calculatePrice() {
        double price = 50;
        if (features.containsKey("sunroof") && (Boolean) features.get("sunroof")) {
            price += 10;
        }
        return price;
    }
}
