package Twenty_six.Homework;

public class Book extends Product {
    String author;

    public Book(String newName,int newPrice,String newAuthor){
        super(newName,newPrice);
        author = newAuthor;
    }

    @Override
    void display(){
        super.display();
        System.out.print(".Автор: "+author);
    }
}
