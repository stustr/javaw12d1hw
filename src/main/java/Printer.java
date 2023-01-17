public class Printer {
    private int sheetsLeft;
    private int toner;

    public Printer(int sheetsLeft, int toner) {
        this.sheetsLeft = sheetsLeft;
        this.toner = toner;
    }

    public int print(int copies) {
        if (this.sheetsLeft > copies) {
            this.sheetsLeft -= copies;
            this.toner -= copies;
        }
        return (this.sheetsLeft + this.toner);
    }
}
