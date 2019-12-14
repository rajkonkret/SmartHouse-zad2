import drivers.lg.LgPrinterDriver;

public class LgPrinter implements PrinterJob {
    LgPrinterDriver printer;

    public LgPrinter(LgPrinterDriver lgPrinterDriver) {
        this.printer = lgPrinterDriver;
    }

    @Override
    public void printDocument(String text) {
        printer.print(text);
    }

    @Override
    public InkIndicator indicator() {

        if (printer.level() < 0.25) {
            return InkIndicator.LOW;
        }
        return InkIndicator.FULL;
    }

    @Override
    public void switchOff() {
        printer.turnOff();
    }

    @Override
    public void switchOn() {
        printer.turnOn();
    }
}
