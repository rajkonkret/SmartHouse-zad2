import drivers.samsung.Printer;
import drivers.samsung.PrinterLevel;
import drivers.samsung.SmartDriver;

public class SamsungPrinter implements PrinterJob {
    Printer samsungPrinter;

    public SamsungPrinter(SmartDriver samsungPrinter) {
        samsungPrinter.connectPrinter();
        this.samsungPrinter = samsungPrinter.getPrinter();

    }


    @Override
    public void printDocument(String text) {
        samsungPrinter.printText(text);
    }

    @Override
    public InkIndicator indicator() {
        if (samsungPrinter.getPrinterLevel() == PrinterLevel.NO_WORRIES) {
            return InkIndicator.FULL;
        }
        return InkIndicator.LOW;
    }
    @Override
    public void switchOff() {

    }

    @Override
    public void switchOn() {

    }
}
