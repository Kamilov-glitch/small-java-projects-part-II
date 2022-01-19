import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person> workers;
    
    public Employees() {
        this.workers = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.workers.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();
        while (iterator.hasNext()) {
            this.workers.add(iterator.next());
        }
    }
    
    public void print() {
        Iterator<Person> iterator = this.workers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.workers.iterator();
        while (iterator.hasNext()) {
            Person nextOne = iterator.next();
            if (nextOne.getEducation() == education) {
                System.out.println(nextOne);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = this.workers.iterator();
        while (iterator.hasNext()) {
            Person nextOne = iterator.next();
            if (nextOne.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
