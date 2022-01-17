import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private final int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public int balance() {
        int balance = 0;
        for (Item i : this.items) {
            balance+=i.getWeight();
        }
        return balance;
    }
    
    @Override
    public void add(Item item) {
        if (item.getWeight() + this.balance() > this.capacity) {
            return;
        }
        this.items.add(item);
    }
    
    @Override
    public void add(ArrayList<Item> items) {
        items.forEach(i -> {
            this.add(i);
        });
    }
    
    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
