
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        try {
            return Files.lines(Paths.get(file)).map(l -> l.split(","))
                    .filter(a -> a.length == 4)
                    .map(a -> new Book(a[0], Integer.valueOf(a[1]), Integer.valueOf(a[2]), a[3]))
                    .collect(Collectors.toList());
        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        return new ArrayList<>();
        }

    }
