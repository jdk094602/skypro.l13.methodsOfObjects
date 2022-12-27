import java.util.Objects;

public class Author {
    private String name;
    private String lastName;


    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Автор (" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author authorInside = (Author) o; /* для удобства */
        return Objects.equals(name, authorInside.name) && Objects.equals(lastName, authorInside.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

}
