package kz.iitu.course;

import java.util.ArrayList;
import java.util.List;




public class WareHouse extends Product implements Composite {
    List<Composite> product = new ArrayList<>();
    private ArrayList<Observer> observers = new ArrayList<>();
    private ArrayList<Composite> yourList = new ArrayList<>();
    private static  WareHouse instance;
    private int id;
    private String name;
    private int price;
    private int amount;




    public static WareHouse getInstance(){
        if(instance == null){
            instance = new WareHouse();
        }
        return instance;
    }



    public ArrayList<Composite> getYourList(){
        return this.yourList;
    }

    public void giveProduct(int id, User user){
        for(Composite children: yourList) {
            if(children.getID() == id) {
                if(children.getAmount() > 0) {
                    user.addInBasket(children);
                    children.setAmount(children.getAmount()-1);
                    break;
                }else if(children.getAmount() == 0) {
                    System.out.println("Product " + children.getName() + " ID:" + children.getID() + " is not available now");
                }
            }
        }

    }

    public void add(Composite composite) {
        yourList.add(composite);
        if(!composite.isComposite()) {
            this.notifyObserver(composite);
        }
    }


    public void remove(Composite composite) {
        yourList.remove(composite);
    }

    public boolean isComposite() {
        return true;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public int getPrice() {
        return this.price;
    }

    public int getAmount() {
        return this.amount;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObserver(Composite product) {
        for(Observer observer: observers) {
            observer.update(product);
        }
    }



}
