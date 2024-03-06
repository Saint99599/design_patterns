//receiver
public class LightOn implements Job{
    private Light light;

    public void setlight(Light light) {
        this.light = light;
    }

    @Override
    public void run() {
        if (this.light != null) {
            System.out.print("On button ");
            this.light.on();
        }
    }
}
