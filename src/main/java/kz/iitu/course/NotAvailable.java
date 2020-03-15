package kz.iitu.course;

public class NotAvailable implements PossibleStates {


    public NotAvailable() {
        System.out.println("\tProduct state now is: Not available");
    }

    @Override
    public void MakeAvailable(Product context) {
        context.setCurrentState(new Available());

    }
    @Override
    public void MakeNotAvailable(Product context) {

    }

}
