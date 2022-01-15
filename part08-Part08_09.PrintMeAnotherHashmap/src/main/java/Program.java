
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printValues(HashMap<String, Book> hashMap) {
        for (Book i : hashMap.values()) {
            System.out.println(i);
        }
    }
    
    public static void printValueIfNameContains(HashMap<String, Book> hashMap, String text) {
        for (Book i : hashMap.values()) {
            if (i.getName().contains(text)) {
                System.out.println(i);
            }
        }
    }
    

}
