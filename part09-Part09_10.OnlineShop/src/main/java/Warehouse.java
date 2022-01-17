import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stocks;
    
    public Warehouse() {
        this.products = new HashMap<>();
        this.stocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product) {
        if (!this.products.containsKey(product)) {
            return -99;
        }
        return this.products.get(product);
    }
    
    public int stock(String product) {
        if (!this.stocks.containsKey(product)) {
            return 0;
        }
        return this.stocks.get(product);
    }
    
    public boolean take(String product) {
        if (!this.stocks.containsKey(product)) {
            return false;
        }
        int stock = this.stocks.get(product);
        if (stock < 1) {
            return false;
        }
        this.stocks.replace(product, stock - 1);
        return true;
    }
    
    public Set<String> products() {
        Set<String> prods = this.products.keySet();
        return prods;
    }
}
