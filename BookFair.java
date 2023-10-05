import java.util.Scanner;

class BookFair {
    // Instance variables
    String BName;
    double price;

    // Parameterized constructor to initialize data members
    public BookFair(String BName, double price) {
        this.BName = BName;
        this.price = price;
    }

    // Method to calculate the price after discount
    public void calculate() {
        if (price <= 1000) {
            price -= (0.2 * price);
        } else if (price <= 3000) {
            price -= (0.10 * price);
        } else {
            price -= (0.15 * price);
        }
    }

    // Method to display the name and price of the book after discount
    public void display() {
        System.out.println("Book Name: " + BName);
        System.out.println("Price after discount: Rs. " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the book: ");
        String bookName = scanner.nextLine();

        System.out.print("Enter the price of the book: Rs. ");
        double bookPrice = scanner.nextDouble();

        // Create an object of the BookFair class
        BookFair book = new BookFair(bookName, bookPrice);

        // Calculate the price after discount
        book.calculate();

        // Display the book details after discount
        book.display();
    }
}
