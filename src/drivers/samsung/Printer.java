package drivers.samsung;

public class Printer {

    private String name;
    private PrinterLevel printerLevel;
    private int printCount;

    Printer(String name) {
        this.name = name;
        printerLevel = PrinterLevel.NO_WORRIES;
        printCount = 0;
    }

    public void printText(String text) {
        smartCodeThatSendTextToPrint(text);
    }

    public PrinterLevel getPrinterLevel() {
        return smartCodeThatCheckInkLevel();
    }

    private void smartCodeThatSendTextToPrint(String text) {
        if (printerLevel != PrinterLevel.WORRIES) {
            System.out.println(name + " print:" + text);
            printCount++;
            printerLevel = updatePrinterLevel();
        } else {
            System.out.println(name + " printer has empty toner.");
        }
    }

    private PrinterLevel updatePrinterLevel() {
        int lastIndex = PrinterLevel.values().length - 1;
        return PrinterLevel.values()[lastIndex/(printCount/100 + 1)];
    }

    private PrinterLevel smartCodeThatCheckInkLevel() {
        return printerLevel;
    }

}
