package t6_objects.arrays;

public class Category {
    String name;
    Product[] products;

    void showAllProducts(){
        for (int i = 0; i < products.length; i++) {
            if (products[i] !=null){
                System.out.println(products[i].name);
            }
        }
    }

    int getProductsSum(){
        int srArifmetic = 0;
        int total = 0;
        int num = 0;
        for (int i = 0; i < products.length; i++) {
            num++;
            if (products[i] != null){
                total += products[i].price;
            }
        }
        srArifmetic = total / num;
        return srArifmetic;
    }

    int getAverageSum(){
        int temp = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null){
                temp +=products[i].price;
            }
        }
        return temp;
    }

    void addProduct(Product product){
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null){
                products[i] = product;
                return;
            }
        }
        System.out.println("Нет свободного места в массиве");
    }
}
