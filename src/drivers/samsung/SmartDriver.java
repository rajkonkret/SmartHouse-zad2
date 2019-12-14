package drivers.samsung;

public class SmartDriver {

    private String samsungName = "[SamsungSmart]";
    private Printer printer;
    private Tv tv;

    public SmartDriver() {
        samsungSmartInitializing();
    }

    private void samsungSmartInitializing() {
        System.out.println(samsungName + " is very smart and ready to use.");
    }

    public void connectPrinter() {
        printer = new Printer(samsungName);
    }

    public void connectTv() {
        tv = new Tv();
    }

    public Printer getPrinter() {
        return printer;
    }

    public Tv getTv() {
        return tv;
    }

}
