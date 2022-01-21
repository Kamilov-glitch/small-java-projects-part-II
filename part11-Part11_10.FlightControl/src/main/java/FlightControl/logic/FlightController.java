package FlightControl.logic;
import FlightControl.domain.*;
import java.util.Collection;
import java.util.HashMap;

public class FlightController {
    private HashMap<String, Airplane> planes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;
    
    public FlightController() {
        this.planes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }
    
    public void addAirplane(String id, int capacity) {
        this.planes.putIfAbsent(id, new Airplane(id, capacity));
    }
    
    public void addFlight(Airplane plane, String d, String t) {
        this.places.putIfAbsent(d, new Place(d));
        this.places.putIfAbsent(t, new Place(t));
        
        Flight flight = new Flight(plane, this.places.get(d), this.places.get(t));
        this.flights.put(flight.toString(), flight);  
    }
    
    public Collection<Airplane> getAirplanes() {
        return this.planes.values();
    }
    
    public Collection<Flight> getFlights() {
        return this.flights.values();
    }
    
    public Airplane getAirplane(String id) {
        return this.planes.get(id);
    }
}
