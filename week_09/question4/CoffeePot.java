// CoffeePot class with mediator
public class CoffeePot {
    private Mediator mediator;

    public CoffeePot(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doCoffeePot() {
        System.out.println("I am coffee pot,... doing my task");
        mediator.notify(AlarmEvent.END, "Coffee Pot");
    }
}