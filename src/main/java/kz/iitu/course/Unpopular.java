package kz.iitu.course;


public class Unpopular implements BrandsPossibleStates {
    public Unpopular() {
        System.out.println("\tBrand state now is: Unpopular");
    }
    @Override
    public void MakePopular(Brands context) {
        context.setCurrentState(new Popular());

    }
    @Override
    public void MakeUnpopular(Brands context) {

    }
}
