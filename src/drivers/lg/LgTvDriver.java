package drivers.lg;

public class LgTvDriver {

    private int channel;

    public void changeChannel() {
        channel = channel++ % 100;
        System.out.println("Channel changed: " + channel);
    }

    public void turnOn() {
        System.out.println("Tv is turn on");
    }

    public void turnOff() {
        System.out.println("Tv is turn off (stand by)");
    }

    public void vacationMode() {
        System.out.println("Earth will survived. Vacation mode is fun. No stand by.");
    }
}
