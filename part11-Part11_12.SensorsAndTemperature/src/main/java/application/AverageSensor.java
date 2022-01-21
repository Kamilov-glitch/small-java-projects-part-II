package application;
import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }
    
    public boolean isOn() {
        return this.sensors.stream()
                .allMatch(s -> s.isOn() == true);
    } 
    
    public void setOn() {
        this.sensors.forEach(s -> s.setOn());
    }
    
    public void setOff() {
        this.sensors.forEach(s -> s.setOff());
    }
    
    public int read() {
        if (this.isOn() == false) {
            throw new IllegalStateException("Sensors are off");
        }
        double d =  this.sensors.stream().mapToInt(s -> s.read())
                .average().getAsDouble();
        int num = (int) Math.round(d);
        this.readings.add(num);
        return num;
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
}
