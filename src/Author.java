import java.util.Objects;

public class Author {
    public String name;
    public String surname;
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return "Author: " + name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
