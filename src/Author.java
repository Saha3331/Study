public class Author {
    public String fistName;
    public String lastName;
    public Author() {
    }

    public Author(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName;
    }
}
