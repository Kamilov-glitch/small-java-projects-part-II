import java.util.ArrayList;

public class Hideout<T> {
    private ArrayList<T> elements;
    
    public Hideout() {
        this.elements = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide) {
        if (this.elements.contains(toHide)) {
            this.elements.remove(toHide);
            return;
        }
        this.elements.add(toHide);
    }
    
    public T takeFromHideout() {
        if (!this.elements.isEmpty()) {
            return this.elements.remove(this.elements.size() - 1);
        }
        return null;
    }
    
    public boolean isInHideout() {
        if (this.elements.isEmpty()) {
            return false;
        }
        return true;
    }
}
