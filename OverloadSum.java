import java.util.Scanner;

public class OverloadSum {

    public int Sum(int A, int B) {
        int sum = 0;
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
  
    public double Sum(double N) {
        double sum = 1.0;
        for (double i = 1.2; i <= N; i += 0.2) {
            sum *= i;
        }
        return sum;
    }
  
    public int Sum(int N) {
        int sum = 0;
        while (N > 0) {
            int digit = N % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            N /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        OverloadSum sum = new OverloadSum();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = scanner.nextInt();
        System.out.print("Enter B: ");
        int B = scanner.nextInt();

        System.out.print("Enter N: ");
        double N = scanner.nextDouble();

        System.out.print("Enter an integer N for (iii): ");
        int integerN = scanner.nextInt();

        int sumEven = sum.Sum(A, B);
        System.out.println("Sum of even numbers in the range: " + sumEven);

        double product = sum.Sum(N);
        System.out.println("Product of the series: " + product);

        int sumOddDigits = sum.Sum(integerN);
        System.out.println("Sum of odd digits in the number: " + sumOddDigits);
        
        scanner.close();
    }

}
