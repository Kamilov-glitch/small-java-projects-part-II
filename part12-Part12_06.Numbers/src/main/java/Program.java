
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("how many numbers should be generated?");
        int num = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.println(rand.nextInt(11));
        }
    }

}
