public class Book {
    private String title;
    private String author;
    private String description;
    private String isbn;

    /**
     * Initializes a new Book record.
     * Some fields start empty, to be filled in later.
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;

        // Common way to set an empty string
        this.description = "";

        // Another way to create an empty string object
        this.isbn = new String();

        System.out.println("New Book Record Created:");
        System.out.println("  Title: " + this.title);
        System.out.println("  Author: " + this.author);
        System.out.println("  Description (empty default): '" + this.description + "'");
        System.out.println("  ISBN (empty default): '" + this.isbn + "'");
    }

    // Getters for book details
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getDescription() { return description; }
    public String getIsbn() { return isbn; }

    public static void main(String[] args) {
        // Example usage: create a new book entry
        Book newBookEntry = new Book("Digital Catalog System Basics", "Library Staff");
    }
}
