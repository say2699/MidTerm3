package kz.iitu.course;

public class Available implements PossibleStates {

    public Available() {
        System.out.println("\tProduct state now is: Available");
    }
    @Override
    public void MakeNotAvailable(Product context) {
        context.setCurrentState(new NotAvailable());

    }
    @Override
    public void MakeAvailable(Product context) {

    }

}
