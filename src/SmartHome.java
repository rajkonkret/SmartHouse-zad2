import java.util.ArrayList;

class SmartHome {
    private  ArrayList<PrinterJob> printers;

    public SmartHome(ArrayList<PrinterJob> printers) {
        this.printers = printers;
    }

    void printAll(String doc) {
        for (PrinterJob printer : printers) {
            printer.printDocument(doc);
        }


    }

    void print(String doc, String printerToPrint) {
//        for (PrinterJob printer : printers) {
//
//            if (printer.getName().equalsIgnoreCase(printerToPrint)) {
              //  printer.printDocument(doc);
    //        }

    }


   InkIndicator checkInkIndicator( PrinterJob printerJob) {
        return printerJob.indicator();

   }
}
