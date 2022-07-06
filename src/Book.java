import java.util.Objects;

public class Book {
    public String bookName;
    public Author author;
    public int publicationDate;

    public Book(String bookName, Author author, int publicationDate) {
        this.bookName = bookName;
        this.author = author;
        this.publicationDate = publicationDate;
    }
    public String toString() {
        return "Book: " + bookName + " by " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationDate == book.publicationDate && bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publicationDate);
    }
}
