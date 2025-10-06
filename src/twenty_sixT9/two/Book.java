package twenty_sixT9.two;

public class Book {
    String title;
    String author;
    int year;
    boolean isAvailabl;

    Book(String newTitle,String newAuthor,int newYear){
        title = newTitle;
        author = newAuthor;
        year = newYear;
        isAvailabl = true;
    }

    void display(){
        System.out.print("Название: "+title+" .Автор: "+author+" .Год:" +year+" .Книга:");
        if (isAvailabl){
            System.out.println("Доступна");
        }else {
            System.out.println("Не доступна");
        }
    }

    void borrowBook(String readerName){
        if (isAvailabl){
            System.out.println(readerName+" берет книгу");
            isAvailabl = false;
        }else {
            System.out.println("Книга уже выдана");
        }
    }

    void returnBook(){
        if (!isAvailabl){
            System.out.println("Книга возвращена "+title);
            isAvailabl = true;
        }else {
            System.out.println("Книга уже на полке "+title);
        }
    }

    boolean isClassic(){
        if (year < 1950){
            return true;
        }else {
           return false;
        }

    }

}
