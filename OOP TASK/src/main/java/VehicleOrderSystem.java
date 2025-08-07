
import java.util.*;

public class VehicleOrderSystem {
     VehicleInventory inventory = new VehicleInventory();

    public void placeOrder(String type, Map<String, Object> desiredFeatures) {
        if (inventory.checkAvailability(type, desiredFeatures)) {
            Vehicle v = inventory.reserveVehicle(type, desiredFeatures);
            double price = v.calculatePrice();
            System.out.println("Vehicle reserved: " + v.registrationNumber);
            System.out.println("Total price: $" + price);
        } else {
            System.out.println("No available vehicle matches your criteria.");
        }
    }
}


