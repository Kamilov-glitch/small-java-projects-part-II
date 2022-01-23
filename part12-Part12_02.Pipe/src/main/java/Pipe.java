import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> elements;
    
    public Pipe() {
        this.elements = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        if (this.elements.contains(value)) {
            this.elements.remove(value);
            return;
        }
        this.elements.add(value);
    }
    
    public T takeFromPipe() {
        if (!this.elements.isEmpty()) {
            return this.elements.remove(0);
        }
        return null;
    }
    
    public boolean isInPipe() {
        if (this.elements.isEmpty()) {
            return false;
        }
        return true;
    }
}
