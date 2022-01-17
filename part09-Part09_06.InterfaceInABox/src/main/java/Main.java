
public class Main {

    public static void main(String[] args) {
        Box box = new Box(10);
        System.out.println("bumbas");
        Box box2 = box;
        CD disc = new CD("ala", "bulala", 1299);
        box.add(disc);
        box.add(box2);
        System.out.println(box);
    }

}
