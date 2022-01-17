import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> items;
    
    public ShoppingCart() {
        this.items = new HashMap<>();
    }
    
    public void add(String product, int price) {
        Item item = new Item(product, 1, price);
        if (!this.items.containsKey(product)) {
            this.items.put(product, item);
        } else {
            this.items.get(product).increaseQuantity();
        }
    }
    
    public int price() {
        int sum = 0;
        for(Item i : this.items.values()) {
            sum += i.price();
        }
        return sum;
    }
    
    public void print() {
        for (Item i : this.items.values()) {
            System.out.println(i);
        }
    }
}
