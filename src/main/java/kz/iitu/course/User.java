package kz.iitu.course;

import org.springframework.stereotype.Component;

import java.util.ArrayList;



@Component
public class User implements Observer{
    private ArrayList<Composite> children = new ArrayList<>();
    private String name;
    private int total=0;




    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void addInBasket(Composite children) {

        this.children.add(children);
        total+=children.getPrice();
    }

    public ArrayList<Composite> getProducts(){
        return this.children;
    }


    public void printProducts(){
        if(this.children.size()==0) {
            System.out.println("You have no products in basket\n");
        }else {
            for(Composite children: this.children) {
                System.out.println("-" + children.getName() + " " + children.getPrice());
            }
            System.out.println("Total is:" + total + "\n");

        }
    }
    public void update(Composite product) {
        Product product1 = (Product)product;
        System.out.println("Notification for " + this.getName());
        System.out.println("New product created");
        System.out.println("ID:" + product1.getID());
        System.out.println("Name:" + product1.getName());
        System.out.println("Price:" + product1.getPrice() + "\n");
    }

}
