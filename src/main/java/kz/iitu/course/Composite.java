package kz.iitu.course;

public interface Composite {
    public boolean isComposite();
    public String getName();
    public int getID();
    public int getPrice();
    public int getAmount();
    public int execute();
    public void setAmount(int i);

}
