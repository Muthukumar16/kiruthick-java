import java.util.Scanner;

public class DisariumNumber {
    // Function to calculate the sum of digits raised to their respective positions
    public static int calculateDigitPowerSum(int number) {
        int sum = 0;
        int position = 1;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, position);
            position++;
            number /= 10;
        }

        return sum;
    }

    // Function to check if a number is a Disarium number
    public static boolean isDisariumNumber(int number) {
        int digitPowerSum = calculateDigitPowerSum(number);
        return digitPowerSum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isDisariumNumber(num)) {
            System.out.println(num + " is a Disarium number.");
        } else {
            System.out.println(num + " is not a Disarium number.");
        }
    }
}
