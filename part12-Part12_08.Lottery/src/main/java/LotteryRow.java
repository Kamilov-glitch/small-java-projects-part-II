
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        while (true) {
            if (this.numbers.size() == 7) {
                break;
            }
            int newNum = this.getRandomNumber();
            if (!this.containsNumber(newNum)) {
                this.numbers().add(newNum);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers

        return this.numbers().contains(number);
    }

    private int getRandomNumber() {
        Random rand = new Random();
        return 1 + rand.nextInt(40);
    }
}
