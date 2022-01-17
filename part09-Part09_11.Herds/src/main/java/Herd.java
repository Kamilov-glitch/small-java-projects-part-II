import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> animals;
    
    public Herd() {
        this.animals = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        String positions = "";
        for (Movable i : this.animals) {
            positions = positions + i.toString() + "\n";
        }
        return positions;
    }
    
    public void addToHerd(Movable movable) {
        this.animals.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable i : this.animals) {
            i.move(dx, dy);
        }
    }
    
}
