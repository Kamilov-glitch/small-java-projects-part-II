import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry.keySet().contains(licensePlate)) {
            return false;
        }
        this.registry.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.keySet().contains(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate i : this.registry.keySet()) {
            System.out.println(i);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owns = new ArrayList<>();
        for (String i : this.registry.values()) {
            if (!owns.contains(i)) {
                System.out.println(i);
                owns.add(i);
            }
        }
    }
}
