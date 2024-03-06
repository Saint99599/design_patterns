//concrete command
public class AirconditionerOff implements Job{

	private Airconditioner airconditioner;

    public void setAirconditioner(Airconditioner airconditioner) {
        this.airconditioner = airconditioner;
    }

    @Override
    public void run() {
        if (this.airconditioner != null) {
            System.out.print("Off button ");
            this.airconditioner.off();
        }
    }

}
