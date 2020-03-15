package kz.iitu.course;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Product implements Composite, IProducts {
    List<Composite> product = new ArrayList<>();
    private int id;
    private String name;
    private int price;
    private int amount;
    private PossibleStates currentState;


    public int execute() {
        return price;
    }

    public Product(int id, String name, int price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;

    }
    public Product() {

    }

    public boolean isComposite() {
        return false;
    }


    public int getID(){
        return this.id;
    }

    public int getPrice(){
        return this.price;
    }

    public int getAmount(){
        return this.amount;
    }

    public String getName(){
        return this.name;
    }

    public void setID(int id) {
        this.id = id;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void PrintStructures() {

        System.out.println("\t" + this.name + " its ID is " +
                this.id  + " and amount is " + this.amount);
    }


    public Product(PossibleStates currentState)
    {
        this.currentState = currentState;
    }

    public PossibleStates getCurrentState() {

        return currentState;
    }

    public void setCurrentState(PossibleStates currentState) {

        this.currentState = currentState;
    }

    public void MakeAvailable()
    {
        currentState.MakeAvailable(this);
    }

    public void MakeNotAvailable()
    {
        currentState.MakeNotAvailable(this);
    }

    @Override
    public void Accept(IVisitor visitor) {
        visitor.VisitLeafNode(this);

    }


}

