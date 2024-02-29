package Thursday_LAB_22_02_2024;
import java.util.*;


public class BookManagementSystem {
    private Map<String, Book> books;
    private Scanner scanner;

    public BookManagementSystem() {
        this.books = new HashMap<>();
        this.scanner = new Scanner(System.in);

        // Adding initial books
        books.put("The Great Gatsby", new Book("The Great Gatsby", "F. Scott Fitzgerald", 899));
        books.put("To Kill a Mockingbird", new Book("To Kill a Mockingbird", "Harper Lee", 399));
        books.put("1984", new Book("1984", "George Orwell", 999));
    }

    public void addBook() {
        System.out.println("Enter book title:");
        String title = scanner.nextLine();

        System.out.println("Enter author name:");
        String author = scanner.nextLine();

        System.out.println("Enter Book Price in INR:");
        float price;
        while (true) {
            try {
                price = Float.parseFloat(scanner.nextLine());
                if (price <= 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid price. Please enter a positive number:");
            }
        }

        Book book = new Book(title, author, price);
        books.put(title, book);
        System.out.println("Book added: " + book);
    }

    public void displayBooks() {
        System.out.println("Books in the collection:");
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        BookManagementSystem bookSystem = new BookManagementSystem();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            // Display menu to the user
            System.out.println("\nBook Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        bookSystem.addBook();
                        break;
                    case 2:
                        // Implement updateBook method
                        System.out.println("Update Book");
                        break;
                    case 3:
                        // Implement deleteBook method
                        System.out.println("Delete Book");
                        break;
                    case 4:
                        bookSystem.displayBooks();
                        break;
                    case 5:
                        System.out.println("Exiting the application. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                choice = 0;
            }

        } while (choice != 5);

        scanner.close();
    }
}
