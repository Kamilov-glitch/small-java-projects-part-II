import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> items;
    private final double capacity;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public double weight() {
        if (this.items.isEmpty()) {
            return 0;
        }
        double totalWeight = 0;
        for (Packable i : this.items) {
            totalWeight += i.weight();
        }
        return totalWeight;
    }
    
    public void add(Packable item) {
        if ((item.weight() + this.weight()) <= this.capacity) {
            this.items.add(item);
        }
    }
    
    @Override
    public String toString() {
        return ("Box: " + this.items.size() + " items, total weight " + this.weight() + " kg");
    }
}
