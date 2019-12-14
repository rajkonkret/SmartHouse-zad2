package drivers.samsung;

public class Tv {

    private String name;

    Tv() {
        name = "Samsung Smart Tv";
    }

    public void on() {
        System.out.println(name + " is turn on");
    }

    public void off() {
        System.out.println(name + " is turn off");
    }
}
