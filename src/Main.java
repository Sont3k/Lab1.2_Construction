import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Title", 45.4f, new Date(1942, 1, 1));

        System.out.println(book.toString());
        System.out.println(book.equals(book));
    }
}
