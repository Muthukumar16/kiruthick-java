import java.util.Scanner;

class MovieMagic {
    // Instance variables
    int year;
    String title;
    float rating;

    // Default constructor
    MovieMagic() {
        year = 0;
        title = "";
        rating = 0;
    }

    // Method to input and store year, title, and rating
    void accept() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the year of release: ");
        year = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        System.out.print("Enter the title of the movie: ");
        title = scanner.nextLine();
        
        System.out.print("Enter the popularity rating (0.0 to 5.0): ");
        rating = scanner.nextFloat();

        // Ensure that the rating is within the specified range (0.0 to 5.0)
        if (rating < 0.0 || rating > 5.0) {
            System.out.println("Invalid rating. Setting rating to 0.0.");
            rating = 0;
        }
    }

    // Method to display movie title and message based on the rating
    void display() {
        System.out.println("Movie Title: " + title);
        
        if (rating >= 0.0 && rating <= 2.0) {
            System.out.println("Rating of the Movie: Flop");
        } else if (rating <= 3.4) {
            System.out.println("Rating of the Movie: Semi-hit");
        } else if (rating <= 4.5) {
            System.out.println("Rating of the Movie: Hit");
        } else {
            System.out.println("Rating of the Movie: Super Hit");
        }
    }

    public static void main(String[] args) {
        MovieMagic movie = new MovieMagic();
        movie.accept(); // Input movie details
        movie.display(); // Display movie details and rating message
    }
}
