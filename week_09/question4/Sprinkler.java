// Sprinkler class with mediator
public class Sprinkler {
    private Mediator mediator;

    public Sprinkler(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doSprinkler() {
        System.out.println("I am sprinkler,... doing my task");
        mediator.notify(AlarmEvent.END, "Sprinkler");
    }
}
