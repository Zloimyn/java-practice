package twenty_six.New_task;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Война и мир");
        book.setPages(1225);

        System.out.println("Книга: " + book.getTitle());
        System.out.println("Страниц: " + book.getPages());

        book.setPages(-10);
    }
}
