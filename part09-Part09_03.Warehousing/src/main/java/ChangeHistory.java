import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changes;
    
    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }
    
    public void add(double status) {
        this.changes.add(status);
    }
    
    public void clear() {
        this.changes.clear();
    }
    
    public double maxValue() {
        double max = this.changes.get(0);
        for (double i : this.changes) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    
    public double minValue() {
        double min = this.changes.get(0);
        for (double i : this.changes) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    
    public double sum() {
        double sum = 0;
        for (double i : this.changes) {
            sum += i;
        }
        return sum;
    }
    
    public double average() {
        return this.sum() / this.changes.size();
    }
    
    @Override
    public String toString() {
        return this.changes.toString();
    }
}
