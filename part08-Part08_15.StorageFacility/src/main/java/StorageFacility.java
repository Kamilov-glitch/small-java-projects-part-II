import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> units;
    
    public StorageFacility() {
        this.units = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.units.putIfAbsent(unit, new ArrayList<>());
        this.units.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.units.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        if (this.units.get(storageUnit).contains(item)) {
            System.out.println(this.units.get(storageUnit));
            for (String i : this.units.get(storageUnit)) {
                if (i.equals(item)) {
                    System.out.println(i);
                    this.units.get(storageUnit).remove(i);
                    break;
                }
            }
        }
        if (this.units.get(storageUnit).isEmpty()) {
            this.units.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> unitNames = new ArrayList<>();
        for (String i : this.units.keySet()) {
            if (!this.units.get(i).isEmpty()) {
                unitNames.add(i);
            }
        }
        return unitNames;
    }
}
