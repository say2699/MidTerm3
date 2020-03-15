package kz.iitu.course;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;





public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        List<Composite> children = Arrays.asList(new WareHouse());
        WareHouse warehouse = WareHouse.getInstance();
        Available initialState = new Available();
        Product product = new Product(initialState);
        New initialState1 = new New();
        Brands brand = new Brands(initialState1);


        User user1 = (User) context.getBean("user1", User.class);
        User user2 = (User) context.getBean("user2", User.class);


        ProductBuilder productbuilder = new ProductBuilder();

        Brands shoes = ( Brands) context.getBean("brand1",  Brands.class);
        Brands adidas = ( Brands) context.getBean("brand2",  Brands.class);


        shoes.Add(adidas);


        ProductBuilder product1 = (ProductBuilder) context.getBean("product1", ProductBuilder.class);
        warehouse.add(productbuilder.getResult());
        adidas.Add(productbuilder.getResult());

        ProductBuilder product2 = (ProductBuilder) context.getBean("product2", ProductBuilder.class);
        warehouse.add(productbuilder.getResult());
        adidas.Add(productbuilder.getResult());



        warehouse.registerObserver(user1);

        System.out.println("\n ---List---\n");
        shoes.PrintStructures();
        System.out.println("\n");

        ProductBuilder product3 = (ProductBuilder) context.getBean("product3", ProductBuilder.class);
        warehouse.add(productbuilder.getResult());
        adidas.Add(productbuilder.getResult());


        warehouse.giveProduct(1, user1);
        warehouse.giveProduct(2, user1);
        warehouse.giveProduct(1, user2);
        warehouse.giveProduct(3, user2);



        System.out.println("\n---" + user1.getName() + "'s products:---");
        user1.printProducts();
        System.out.println("\n---" + user2.getName() + "'s products:---");
        user2.printProducts();





    }
}
