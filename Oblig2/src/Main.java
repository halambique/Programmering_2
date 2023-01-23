import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TvSeries theWire = new TvSeries("The Wire", "A crime drama set in Baltimore", LocalDate.of(2002, 06, 02), (byte) 60);
        TvSeries blindpassasjer = new TvSeries("Blindpassasjer", "En norsk science-fictionroman i tre deler", LocalDate.of(1978, 10, 27), (byte) 3);

        Episode theTaget = new Episode("The Target", 01, 01,  62);
        Episode hvemAvOssErDenDrepte = new Episode("Hvem av oss er den drepte?", 03, 01, 38);

    }
}
