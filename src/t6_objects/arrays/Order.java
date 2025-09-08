package t6_objects.arrays;

public class Order {
    User customer;
    Product product;
    int quantity;
    void display(){
        System.out.println("Заказчик: "+customer.email);
        System.out.println("Товар: "+product.name);
        System.out.println("Цена за единицу; "+product.price);
        System.out.println("Количество; "+quantity);
        System.out.println("Общая стоимость; "+product.price*quantity);
    }
}
