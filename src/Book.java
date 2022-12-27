import java.util.Objects;

public class Book {
    private String title;
    private final Author author; /* автор не меняется */
    private int published;


    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublished() {
        return published;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublished(int published) {
        if (published < 1950 || published > 2050) {
            System.out.println("Передан неправильный параметр 'Год издания': " + published);
            return;
        }
        this.published = published;
    }

    public Book(String title, Author author, int published) {
        this.title = title;
        this.author = author;
        this.published = published;
    }

    @Override
    public String toString() {
        return this.title + " " + this.author + " " + this.published;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; /* любой объект равен сам себе  */
        if (o == null || getClass() != o.getClass()) return false; /* если пустой или другого класса */
        Book book = (Book) o;
        return published == book.published && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, published);
    }


}
