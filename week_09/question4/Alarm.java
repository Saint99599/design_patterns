// Enumeration for alarm events
enum AlarmEvent {
    END
}

// Alarm class with mediator
public class Alarm {
    private Mediator mediator;

    public Alarm(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doAlarm() {
        System.out.println("Alarm is sending event to all...");
        mediator.notify(AlarmEvent.END, "Alarm");
    }
}