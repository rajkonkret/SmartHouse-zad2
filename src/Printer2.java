class Printer2 {
    private InkIndicator inkIndicator;
    private String name;


    Printer2(InkIndicator inkIndicator, String name) {
        this.inkIndicator = inkIndicator;
        this.name = name;
    }

    void printDocument(String doc) {

        System.out.println(name + " " + doc);
    }

    String toPrint() {

        return "Drukarka: " + name + " poziom tuszu " + inkIndicator.getNice();
    }

    private InkIndicator getInkIndicator() {
        return inkIndicator;
    }

    String getName() {
        return name;
    }
}
