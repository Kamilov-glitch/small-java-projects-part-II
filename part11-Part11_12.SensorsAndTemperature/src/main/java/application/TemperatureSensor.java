package application;
import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean state;
    
    public TemperatureSensor() {
        this.state = false;
    }
    
    public void setOn() {
        this.state = true;
    }
    
    public void setOff() {
        this.state = false;
    }
    
    public boolean isOn() {
        return this.state;
    }
    
    public int read() {
        if (this.state == false) {
            throw new IllegalStateException("Sensor if off");
        }
        return new Random().nextInt(61) - 30;
    }
}
