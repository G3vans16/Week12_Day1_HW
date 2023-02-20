public class Printer {

    private int paper;
    private int tonerVolume;

    public Printer(int paper, int tonerVolume){
        this.paper = paper;
        this.tonerVolume = tonerVolume;
    }

    public int getRemainingPaper() {
        return this.paper;
    }

    public void print(int pages, int copies) {
        int pagesToPrint = (pages * copies);
        if (this.paper >= pagesToPrint){
            this.paper -= pagesToPrint;
            this.tonerVolume -= pagesToPrint;
        }
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }
}
