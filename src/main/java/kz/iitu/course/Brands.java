package kz.iitu.course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class Brands implements IProducts {

    private String name;
    private int id;
    private int pop;
    private ArrayList<IProducts> controls;
    private BrandsPossibleStates currentState;
    IVisitor aVisitor = new Visitor();


    public Brands(String name,  int id, int pop) {
        controls = new ArrayList<IProducts>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public void setControls(ArrayList<IProducts> controls) {
        controls = new ArrayList<IProducts>();
    }

    public void Add(IProducts e) {
        controls.add(e);
    }

    public void Remove(IProducts e) {
        controls.remove(e);
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }
    public int getPOP() {
        return pop;
    }


    public ArrayList<IProducts> getControls() {
        return controls;
    }

    public void PrintStructures() {
        if(pop == 0) {
            System.out.println("\t" + this.name + " its ID is " +
                    this.id  + " and this is a type of a product");
            for (IProducts e:controls
            ) {
                e.PrintStructures();
                e.Accept(aVisitor);
                System.out.println("\n");
            }
        }else {
            System.out.println("\t" + this.name + " its ID is " +
                    this.id  + " and popularity is " + this.pop);
            for (IProducts e:controls
            ) {
                e.PrintStructures();
                e.Accept(aVisitor);
                System.out.println("\n");
            }
        }
    }

    public Brands(BrandsPossibleStates currentState)
    {
        this.currentState = currentState;
    }

    public BrandsPossibleStates getCurrentState() {

        return currentState;
    }

    public void setCurrentState(BrandsPossibleStates currentState) {

        this.currentState = currentState;
    }
    public void MakePopular()
    {
        currentState.MakePopular(this);
    }

    public void MakeUnpopular()
    {
        currentState.MakeUnpopular(this);
    }

    public void Accept(IVisitor visitor)
    {
        visitor.VisitCompositeElement(this);
    }
}


