package validating;

public class Calculator {

    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Given number can't be a negative.");
        }
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if (subsetSize > setSize|| setSize<0 || subsetSize<0) {
            throw new IllegalArgumentException("parameters can't be negative or subsetsize cant be bigger than setsize");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
