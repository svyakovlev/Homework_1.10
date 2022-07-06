import java.util.Arrays;

public class Library {
    public Book[] library;
    public Library(int size) {
        this.library = new Book[size];
    }
    public void addBook (Book books) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] == null) {
                library[i] = books;
                break;
            }
        }
    }
    public String toString () {
        String A = "";
        for (int i = 0; i < library.length; i++) {
            A = A + "Book: " + library[i].bookName + " by " + library[i].author + "\n";
        }
        return "Library: \n" + A;
    }
}
