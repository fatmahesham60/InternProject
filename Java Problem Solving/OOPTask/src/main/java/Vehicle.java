import java.util.Map;

public class Vehicle {

    private String registrationNumber;
    private String vehicleType;
    private String fuelType;
    private boolean isAvailable;
    private Map<String, Object> features;

    Vehicle(String regNum, String type, String fuel, Map<String, Object> feats) {
        this.registrationNumber = regNum;
        this.vehicleType = type;
        this.fuelType = fuel;
        this.isAvailable = true;
        this.features = feats;
    }

    public Map<String, Object> getFeatures() {
        return features;
    }

    public void setFeatures(Map<String, Object> features) {
        this.features = features;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }


    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }



}


}
