package kz.iitu.course;

public interface Builder {
    public void setID(int id);
    public void setPrice(int price);
    public void setName(String name);
    public Product getResult();
    public void reset();
}

