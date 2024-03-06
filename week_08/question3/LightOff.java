//receiver
public class LightOff implements Job{
    private Light light;

    public void setlight(Light light) {
        this.light = light;
    }

    @Override
    public void run() {
        if (this.light != null) {
            System.out.print("Off button ");
            this.light.off();
        }
    }
}
