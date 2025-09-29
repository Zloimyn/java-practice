package twenty_six.two;

public class main {
    public static void main(String[] args) {
        Book book = new Book("Война и мир","Лев Толстой",1869);
        Book book1 = new Book("Евгений Онегин","Александр Пушкин",1824);

        book1.display();
        book1.borrowBook("Анна");
        book1.borrowBook("Иван");
        book1.returnBook();
        book1.returnBook();

        if (book1.isClassic()){
            System.out.println("Это классическая литература");
        }

    }
}
