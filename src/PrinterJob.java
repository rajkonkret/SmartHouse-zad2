public interface PrinterJob {
void printDocument(String text);
InkIndicator indicator();
void switchOff();
void switchOn();
}
