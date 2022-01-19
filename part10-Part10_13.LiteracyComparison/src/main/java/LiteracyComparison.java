
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class LiteracyComparison {
    
    public static void main(String[] args) {
//        System.out.println("hola");
//        String ab = " female (%)";
//        String[] parts = ab.split(" ");
//        System.out.println(Arrays.toString(parts));
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(l -> l.split(","))
                    .sorted((p1, p2) -> {
                        return Double.valueOf(p1[5]).compareTo(Double.valueOf(p2[5]));
                    }).map(l -> l[3] + " (" + l[4] + "), " + l[2].split(" ")[1] + ", " + l[5])
                    .forEach(System.out::println);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
