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


}
