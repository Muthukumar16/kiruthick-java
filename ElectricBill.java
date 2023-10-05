import java.util.Scanner;

/**
 * The ElectricBill class represents an electric bill for a customer
 * It stores the name of the customer, the number of units consumed
 * The class provides method to accept customer details, calculate
 * bill amount, and print the bill amount
 */
public class ElectricBill
{
    private String n;
    private int units;
    private double bill;

    //Accept the name of the customer and number of units consumed
    public void accept() 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of the Customer: ");
        n = scan.next();
        System.out.println("Enter number of units consumed: ");
        units = scan.nextInt();
    }
    
    //Calculate the bill amount as per tariff
    public double calculate() 
    {
        if(units <= 100) {
         bill = units * 2.0;
        } else if (units > 100 && units <= 300) {
         bill = 100 * 2.0 + (units-100)*3.0;
        } else {
            bill = 100 * 2.0 + 200*3.0 + (units-300)*5.0;
            double surcharge = bill * 2.5/100;
            bill = bill + surcharge;
        }
        return bill;
    }
    
    //Print the details of the electric bill
    public void print() 
    {
        System.out.println("Name of the Customer: "+n);
        System.out.println("Number of units consumed: "+units);
        System.out.println("Bill amount: "+bill);
    }
    
    //Main method to create an object and call methods
    public static void main(String[] args) {
        ElectricBill eleBill = new ElectricBill();
        eleBill.accept();
        eleBill.calculate();
        eleBill.print();
    }
}
