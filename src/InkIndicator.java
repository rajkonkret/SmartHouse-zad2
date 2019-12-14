public enum InkIndicator {
    EMPTY("◯"), LOW("◔"), MEDIUM("◑"), HIGH("◕"), FULL("◉");
    private String nice;

    InkIndicator(String nice) {

        this.nice = nice;
    }

    String getNice() {

        return nice;
    }
}
