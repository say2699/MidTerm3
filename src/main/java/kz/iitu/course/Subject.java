package kz.iitu.course;


public interface Subject {
    public void registerObserver(Observer observer);
    public void unregisterObserver(Observer observer);
    public void notifyObserver(Composite product);
}
