
import java.util.Objects;


public class Item {
    private int unitPrice;
    private int qty;
    private String product;
    
    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return unitPrice * qty;
    }
    
    public void increaseQuantity() {
        this.qty += 1;
    }
    
    public String toString() {
        return this.product + ": " + this.qty;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.unitPrice != other.unitPrice) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }
    
    
}
