import drivers.lg.LgPrinterDriver;
import drivers.samsung.SmartDriver;

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
        PrinterJob[] printersInHome = new PrinterJob[2];
        LgPrinterDriver lgPrinterDriver = new LgPrinterDriver();
        LgPrinter salon = new LgPrinter(lgPrinterDriver);
        printersInHome[0] = salon;
        System.out.println(printersInHome[0].indicator());
        printersInHome[0].switchOn();
        SmartDriver smartDriver = new SmartDriver();
        SamsungPrinter samsungPrinter = new SamsungPrinter(smartDriver);
        printersInHome[1] = samsungPrinter;

        SmartHome smartHome = createSmartHouse(printersInHome);

        smartHome.printAll("Star");
        //smartHome.print("STAR WARS", "kuchnia ");

        System.out.println(smartHome.checkInkIndicator(printersInHome[0]));
    }

    public static SmartHome createSmartHouse(PrinterJob[] printerJob) {

        //     Printer salon = new Printer(InkIndicator.MEDIUM, "SALON");
        Printer2 kitchen = new Printer2(InkIndicator.LOW, "KUCHNIA");

        return new SmartHome(printerJob);
    }
}
