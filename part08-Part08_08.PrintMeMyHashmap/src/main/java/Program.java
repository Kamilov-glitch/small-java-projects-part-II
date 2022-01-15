
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printKeys(HashMap<String, String> hashMap) {
        for (String i : hashMap.keySet()) {
            System.out.println(i);
        }
    }
    
    public static void printKeysWhere(HashMap<String, String> hashMap, String text) {
        for (String i : hashMap.keySet()) {
            if (i.contains(text)) {
                System.out.println(i);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text) {
        for (String i : hashMap.keySet()) {
            if (i.contains(text)) {
                System.out.println(hashMap.get(i));
            }
        }
    }

}
