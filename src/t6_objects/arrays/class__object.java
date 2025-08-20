package t6_objects.arrays;

public class class__object {
    public static void main(String[] args) {

//        Hamster bite = new Hamster();
//        bite.name = "БАйт";
//        System.out.println(bite.name);
//
//        Hamster homa = new Hamster();
//        homa.name = "ХоМа";
//        System.out.println(homa.name);
//
//        Movie theDarkKnight = new Movie();
//        theDarkKnight.name = "TheDarkKnight";
//        theDarkKnight.rating = 8.9;
//        theDarkKnight.genre = "Sci-fi";
//        theDarkKnight.publication = 2009;
//        theDarkKnight.display();
//
//        Movie guardiansOFTheGalaxy = new Movie();
//        guardiansOFTheGalaxy.name = "GuardiansOFTheGalaxy";
//        guardiansOFTheGalaxy.rating = 7.8;
//        guardiansOFTheGalaxy.genre = "Fantasy";
//        guardiansOFTheGalaxy.publication = 2014;
//        guardiansOFTheGalaxy.display();
//
//        BankAccount account = new BankAccount();
//        account.owner = "Mike";
//        account.deposit(1_250_000);
//
//        Product product = new Product();
//        product.name = "Samsa A06";
//        product.price = 2_189_990;
//
//        account.buy(product);
//        System.out.println(account.balance);

//        User user = new User();
//        user.email = "jon@dzen.www";
//        user.name = "Jon";
//
//        Product product = new Product();
//        product.price = 20000;
//        product.name = "samsung A26";
//
//        Order order = new Order();
//        order.product = product;
//        order.customer = user;
//        order.quantity = 2;
//
//        order.display();

//        Product[] products = new Product[5];
//        products[0] = new Product();
//        products[0].name = "Samsa A36";
//        products[0].price = 159_999;
//
//        products[1] = new Product();
//        products[1].name = "Samsa galaxy s23";
//        products[1].price = 370_999;
//
//        products[2] = new Product();
//        products[2].name = "iphone 15pro";
//        products[2].price = 469_999;
//        int totalPrice = 0;
//        for (int i = 0; i < products.length; i++) {
//            if (products[i] != null){
//                System.out.println(products[i].name);
//                totalPrice += products[i].price;
//            }
//        }
//        System.out.println("Общая стоимость: "+totalPrice);

        Category category = new Category();
        category.name = "Tovari IKEA";
        category.products = new Product[4];

        Product product = new Product();
        product.name = "Table";
        product.price = 228_335;
        category.addProduct(product);

        Product secondproduct = new Product();
        secondproduct.name = "Chair";
        secondproduct.price = 77_777;
        category.addProduct(secondproduct);

        Product thirdproduct = new Product();
        thirdproduct.name = "Sofa";
        thirdproduct.price = 200_001;
        category.addProduct(thirdproduct);

        Product fourthproduct = new Product();
        fourthproduct.name = "Doner";
        fourthproduct.price = 2_000;
        category.addProduct(fourthproduct);


        category.showAllProducts();
        System.out.println("Средняя сумма всех товаров: "+category.getProductsSum());;
        System.out.println("Сума товаров: "+category.getAverageSum());

    }
}
