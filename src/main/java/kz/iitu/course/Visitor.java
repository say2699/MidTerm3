package kz.iitu.course;

public class Visitor implements IVisitor {

    @Override
    public void VisitCompositeElement(Brands brand) {
        New initialState = new New();
        Brands state = new Brands(initialState);
        if(brand.getPOP() > 15) {
            state.MakePopular();
        }else if(brand.getPOP() == 0) {
            state.MakeUnpopular();
            System.out.println("This is a product type");
        }else {
            state.MakeUnpopular();
        }
    }

    @Override
    public void VisitLeafNode(Product product) {
        Available initialState = new Available();
        Product state = new Product(initialState);
        if(product.getAmount() > 0) {
            state.MakeAvailable();
            System.out.println("\tProduct " + product.getName() + " amount now is:" + product.getAmount());
        }else if(product.getAmount() == 0 || product.getAmount() < 0) {
            state.MakeNotAvailable();
            System.out.println("\tProduct " + product.getName() + " is not available now");
        }
    }


}
