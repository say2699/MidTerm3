package kz.iitu.course;

public interface IVisitor {
    void VisitCompositeElement(Brands brand);
    void VisitLeafNode(Product product);
}
