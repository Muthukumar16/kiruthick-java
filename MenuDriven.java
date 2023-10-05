import java.util.Scanner;

/**
 * This program accepts an integer input from the user and checks whether it is a Harshad number or not.
 * A Harshad number is a number that is divisible by the sum of its digits.
 */
public class MenuDriven {
    
    public static void verifyHarshadNumber(int num) {
        int rem, sum = 0, n;
        n = num;
        while (num > 0) {
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        if (n % sum == 0) {
            System.out.println(n + " is a Harshad number.");
        } else {
            System.out.println(n + " is not a Harshad number.");
        }
    }
    
    public static void verifyPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
    
    public static void main(String[] args) {
        String menuOption;
        int num = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Enter 'h' to verify Harshad Number.");
        System.out.println("2. Enter 'p' to verify Perfect Number.");
        menuOption = sc.next();
        
        if(menuOption.equals("h")) {
            System.out.println("Enter a number: ");
            num = sc.nextInt();
            verifyHarshadNumber(num);
        } else if (menuOption.equals("p")) { 
            System.out.println("Enter a number: ");
            num = sc.nextInt();
            verifyPerfectNumber(num);
        } else {
            System.out.println("Invalid option select valid menu option");
        }
    }
}