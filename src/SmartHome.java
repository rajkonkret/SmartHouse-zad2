class SmartHome {
    private PrinterJob[] printers;

    public SmartHome(PrinterJob[] printers) {
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
