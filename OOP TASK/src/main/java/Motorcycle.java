import java.util.Map;

public class Motorcycle extends Vehicle {

        public  Motorcycle(String regNum, String type, String fuel, Map<String, Object> features) {
            super(regNum, type, fuel,features);
        }

        @Override
        public String getType(){
            return "Motorcycle";
        }

        @Override
        public double calculatePrice() {
            double basePrice = 30;
            if (features.containsKey("cargoCapacity")) {
                basePrice += ((int) features.get("cargoCapacity")) * 0.05;
            }
            return basePrice;
        }
    }

