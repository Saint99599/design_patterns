public class Remote {
    public static void main(String[] args)
    {
        init();
    }
 
    private static void init()
    {
        ThreadPool pool = new ThreadPool(1);

        Light light = null;
        LightOn  lightOnBedRoom = new LightOn();
        LightOff  lightOffBedRoom = new LightOff();

        LightOn  lightOnKitchen = new LightOn();
        LightOff  lightOffKitchen = new LightOff();
        
        Airconditioner airconditioner = null;
        AirconditionerOn  airconditionerOn = new AirconditionerOn();
        AirconditionerOff  airconditionerOff = new AirconditionerOff();

        light = new Light("Bed Room");
        lightOnBedRoom.setlight(light);
        lightOffBedRoom.setlight(light);

        light = new Light("Kitchen");
        lightOnKitchen.setlight(light);
        lightOffKitchen.setlight(light);
        
        airconditioner = new Airconditioner("Bed Room");
        System.out.println(airconditioner);
        airconditionerOn.setAirconditioner(airconditioner);
        airconditionerOff.setAirconditioner(airconditioner);

        System.out.println("slot 0, light Bed Room");
        pool.addJob(lightOnBedRoom);
        pool.addJob(lightOffBedRoom);
        System.out.println("--------------------------------");

        System.out.println("slot 1, light Kitchen");
        pool.addJob(lightOnKitchen);
        pool.addJob(lightOffKitchen);
        System.out.println("--------------------------------");
        	
        System.out.println("slot 2, AC Bed Room");
        pool.addJob(airconditionerOn);
        pool.addJob(airconditionerOff);
        System.out.println("--------------------------------");

        System.out.println("test one unavailable slot, slot 3");
        pool.addJob(airconditionerOn);
        
        pool.shutdownPool();

    }
}
