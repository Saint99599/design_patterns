// Concrete mediator class
class AlarmMediator implements Mediator {
    private Sprinkler sprinkler;
    private CoffeePot coffeePot;

    public AlarmMediator(Sprinkler sprinkler, CoffeePot coffeePot) {
        this.sprinkler = sprinkler;
        this.coffeePot = coffeePot;
    }

    @Override
    public void notify(AlarmEvent event, String device) {
        if (event == AlarmEvent.END) {
            System.out.println("Alarm event ended from " + device);
        }
    }
}