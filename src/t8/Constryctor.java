package t8;

import java.util.ArrayList;

public class Constryctor {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Samsung s35 ultra pro max chicken macnagets bugati edition",9_999_999));
        products.add(new Product("Sony",21_990));
        products.add(new Product("IPhone 17air",9_999_998));
        for(Product product : products){
            System.out.println("Товары: "+product.produxt+" И стоимость: "+product.price+"тг");
        }

    }
}
