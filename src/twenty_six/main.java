package twenty_six;

public class main {
    public static void main(String[] args) {
        Book book = new Book();
        book.author = "Лев Толстой";
        book.title = "Война и мир";
        book.year = 1869;
        book.isAvailabl = true;

        book.display();

    }
}
