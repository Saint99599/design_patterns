public class App {
    public static void main(String[] args) {
        Sprinkler sprinkler = new Sprinkler(new AlarmMediator(null, null));
        CoffeePot coffeePot = new CoffeePot(new AlarmMediator(null, null));
        AlarmMediator mediator = new AlarmMediator(sprinkler, coffeePot);

        sprinkler = new Sprinkler(mediator);
        coffeePot = new CoffeePot(mediator);

        Alarm alarm = new Alarm(mediator);
        alarm.doAlarm();
        coffeePot.doCoffeePot();
        sprinkler.doSprinkler();
    }
}