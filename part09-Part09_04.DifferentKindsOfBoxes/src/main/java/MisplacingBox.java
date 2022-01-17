import java.util.ArrayList;

public class MisplacingBox extends Box {
    public MisplacingBox() {
        
    }
    

    @Override
    public void add(Item item) {
        
    }
    
    @Override
    public void add(ArrayList<Item> items) {
        items.forEach(i -> {
            this.add(i);
        });
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
