
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(7);
        nums.add(8);
        nums.add(-2);
        nums.add(0);
        System.out.println(positive(nums));
        

    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> newList = new ArrayList<>();
        newList = numbers.stream()
                .filter(i -> i > 0)
                .collect(Collectors.toList());
        return newList;
    }

}
