
package FlightControl.domain;

public class Flight {
    private Airplane airplane;
    private Place departure;
    private Place target;
    
    public Flight(Airplane airplane, Place d, Place t) {
        this.airplane = airplane;
        this.departure = d;
        this.target = t;
    }
    
    public Airplane getAirplane() {
        return this.airplane;
    }
    
    public Place getDeparturePlace() {
        return this.departure;
    }
    
    public Place getTargetPlace() {
        return this.target;
    }
    
    public String toString() {
        return this.airplane + " " + this.target;
    }
}
