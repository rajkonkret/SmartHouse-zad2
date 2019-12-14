import drivers.lg.LgPrinterDriver;
import drivers.samsung.SmartDriver;

import java.util.ArrayList;

public class Run {
    //    Napisać aplikację obsługującą drukarki w domu.
//    Każda drukarka powinna mieć możliwość wydruku* dowolnego tekstu poprzedzonego nazwą drukarki.
//    Użytkownik dostępne ma następujące funkcje w SmartHouse:
//    a)wydrukuj na drukarce o podanej nazwie
//        b)wydrukuj na wszystkich drukarkach
//        c)sprawdź poziom tuszu (empty, low, medium, high, full)
//    Rozwinięcia:Zwizualizować na konsoli ten pięciostopniowy poziom tuszu
//            (sposób wizualizacji pozostawiam uczestnikom)
    public static void main(String[] args) {
        //PrinterJob[] printersInHome = new PrinterJob[2];
        ArrayList<PrinterJob> printersInHome = new ArrayList<>();
        LgPrinterDriver lgPrinterDriver = new LgPrinterDriver();
        LgPrinter salon = new LgPrinter(lgPrinterDriver);
        printersInHome.add(salon);
        salon.switchOn();
        System.out.println(salon.indicator());
      //  printersInHome[0].switchOn();
        SmartDriver smartDriver = new SmartDriver();
        SamsungPrinter samsungPrinter = new SamsungPrinter(smartDriver);
        printersInHome.add(samsungPrinter);

        SmartHome smartHome = createSmartHouse(printersInHome);

        smartHome.printAll("Star");
        //smartHome.print("STAR WARS", "kuchnia ");


    }

    public static SmartHome createSmartHouse(ArrayList<PrinterJob> printerJob) {

        //     Printer salon = new Printer(InkIndicator.MEDIUM, "SALON");
        Printer2 kitchen = new Printer2(InkIndicator.LOW, "KUCHNIA");

        return new SmartHome(printerJob);
    }
}
