import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
    // Function to calculate the sum of the squares of digits in a number
    public static int calculateSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    // Function to check if a number is a happy number
    public static boolean isHappyNumber(int num) {
        Set<Integer> seen = new HashSet<>();

        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            num = calculateSumOfSquares(num);
        }

        return num == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isHappyNumber(num)) {
            System.out.println(num + " is a happy number.");
        } else {
            System.out.println(num + " is an unhappy number.");
        }
    }
}
