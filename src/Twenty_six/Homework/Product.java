package Twenty_six.Homework;

public class Product {
    String name;
    int price;

    public Product(String newName,int newPrice){
        price = newPrice;
        name = newName;
    }

    void display(){
        System.out.print("Название: "+name+" .Цена: "+price);
    }
}
