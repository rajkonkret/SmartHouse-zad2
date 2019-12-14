package drivers.lg;

public class LgPrinterDriver {

    private double level;
    private String printerName = "[LG]";
    private boolean isOn;

    public LgPrinterDriver() {
        veryComplicatedCodeThatConnectTheLgPrinter();
    }

    public void print(String text) {
        veryComplicatedCodeThatSendTextToPrinter(text);
    }

    public double level() {
        return veryComplicatedCodeThatCheckInkLevelOnLgPrinter();
    }

    public void turnOn() {
        System.out.println(printerName + " is on now.");
        isOn = true;
    }

    public void turnOff() {
        System.out.println(printerName + " is off now.");
        isOn = false;
    }

    private void veryComplicatedCodeThatConnectTheLgPrinter() {
        isOn = false;
        level = 1.0;
        System.out.println(printerName + " initialized with status \"off\" and ink level = " + level);

    }

    private void veryComplicatedCodeThatSendTextToPrinter(String text) {

        if (!isOn) {
            return;
        }

        if (level > 0) {
            System.out.println(printerName+ " print:" + text);
        } else {
            System.out.println(printerName + ": NO INK!!!");
        }

        updateInkLevel();
    }

    private void updateInkLevel() {
        level -= 0.0005;
        level = Math.max(0,level);
    }

    private double veryComplicatedCodeThatCheckInkLevelOnLgPrinter() {
        return level;
    }

}
