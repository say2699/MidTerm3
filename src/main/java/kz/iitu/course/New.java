package kz.iitu.course;

public class New implements BrandsPossibleStates {

    @Override
    public void MakeUnpopular(Brands context) {
        context.setCurrentState(new Unpopular());

    }
    @Override
    public void MakePopular(Brands context) {
        context.setCurrentState(new Popular());

    }
}
