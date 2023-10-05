import java.util.Scanner;

public class DudeneyNumber {
    // Function to calculate the sum of digits of a number
    public static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    // Function to check if a number is a Dudeney number
    public static boolean isDudeneyNumber(int num) {
        int cubeRoot = (int) Math.cbrt(num); // Calculate the number of digits+
        int sumOfDigits = calculateSumOfDigits(num);

        return sumOfDigits == cubeRoot;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isDudeneyNumber(num)) {
            System.out.println(num + " is a Dudeney number.");
        } else {
            System.out.println(num + " is not a Dudeney number.");
        }
    }
}
