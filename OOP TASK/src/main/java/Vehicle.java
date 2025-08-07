
import java.util.Map;

public abstract class Vehicle {
     String registrationNumber;
     String vehicleType;
     String fuelType;
     boolean isAvailable;
     Map<String, Object> features;

    public Vehicle(String registrationNumber, String vehicleType, String fuelType, Map<String, Object> features) {
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
        this.isAvailable = true;
        this.features = features;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void reserve() {
        this.isAvailable = false;
    }

    public Map<String, Object> getFeatures() {
        return features;
    }

    public String getType() {
        return vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public abstract double calculatePrice();
}