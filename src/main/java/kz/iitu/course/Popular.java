package kz.iitu.course;

public class Popular implements BrandsPossibleStates {
    public Popular() {
        System.out.println("\tBrand state now is: Popular");
    }
    @Override
    public void MakeUnpopular(Brands context) {
        context.setCurrentState(new Unpopular());

    }
    @Override
    public void MakePopular(Brands context) {

    }
}

