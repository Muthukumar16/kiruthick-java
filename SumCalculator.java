/**
 * This class provides overloaded methods to calculate sums and products.
 */
public class SumCalculator {

    /**
     * Calculates the sum of even numbers in the range [A, B].
     *
     * @param A The starting integer value (inclusive).
     * @param B The ending integer value (inclusive).
     * @return The sum of even numbers in the range [A, B].
     */
    public int Sum(int A, int B) {
        int sum = 0;
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Calculates the product of the series 1.0 x 1.2 x 1.4 x ... x N.
     *
     * @param N The upper limit of the series.
     * @return The product of the series.
     */
    public double Sum(double N) {
        double product = 1.0;
        for (double i = 1.0; i <= N; i += 0.2) {
            product *= i;
        }
        return product;
    }

    /**
     * Calculates the sum of odd digits in an integer N.
     *
     * @param N The integer from which to calculate the sum of odd digits.
     * @return The sum of odd digits in N.
     */
    public int Sum(int N) {
        int sum = 0;
        while (N != 0) {
            int digit = N % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            N /= 10;
        }
        return sum;
    }

    /**
     * Main method to create an object of the SumCalculator class and invoke the methods.
     */
    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();

        // Example 1: Sum of even numbers in the range [4, 16]
        int evenSum = calculator.Sum(4, 16);
        System.out.println("Sum of even numbers: " + evenSum);

        // Example 2: Product of the series 1.0 x 1.2 x 1.4 x ... x 5.0
        double product = calculator.Sum(5.0);
        System.out.println("Product of the series: " + product);

        // Example 3: Sum of odd digits in the number 43961
        int oddDigitSum = calculator.Sum(43961);
        System.out.println("Sum of odd digits: " + oddDigitSum);
    }
}
