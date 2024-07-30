public class Main {
    public static void main(String[] args) {
        Library library = new Library(5);

        String[] bookID = {"B101", "B102", "B103", "B104", "B105"};
        String[] title = {"A", "B", "C", "D", "E"};
        String[] author = {"Raju", "Sai", "Vidya", "Rahul", "Ayu"};

        for (int i = 0; i < bookID.length; i++) {
            library.addBook(new Book(bookID[i], title[i], author[i]));
        }

        Book search = library.linearSearchByTitle("C");
        System.out.println(search != null ? "Book Found " + search : "Book not found!");

        search = library.binarySearchByTitle("C");
        System.out.println(search != null ? "Book Found " + search : "Book not found!");
    }
}