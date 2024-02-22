import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class Main {
    public static void main(String[] args) {
        Author author = new Author();
        author.lastName = "Иванов";
        author.fistName = "Иван";
        System.out.println(author);
        Book book = new Book("Книга",2022,author);
        System.out.println(book);
        System.out.println(book.getYear());
        book.setYear(2023);
        System.out.println(book.getYear());




    }
    }
