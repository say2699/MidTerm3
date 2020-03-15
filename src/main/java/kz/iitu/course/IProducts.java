package kz.iitu.course;

public interface IProducts {
    void PrintStructures();
    void Accept(IVisitor visitor);
}
