package no.hiof.mathibr;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TvSeries taDenRing = new TvSeries("Streiftog i Grenseland", "Programserie om det overnaturlige. Andr� Bjerke og Harald Tusberg inviterer til Klubben for de uløste gåter.", LocalDate.of(1971, 9, 13), (byte) 7);
        TvSeries blindpassasjer = new TvSeries("Blindpassasjer", "En norsk science-fictionroman i tre deler", LocalDate.of(1978, 10, 27), (byte) 3);

        Episode sjoormenILochNess = new Episode("Sjøormen i Loch Ness", 01, 01, 76);
        Episode skjulteKrefter = new Episode("Skjulte krefter?", 02, 01, 73);
        Episode flygendeTallerkener = new Episode("Flygende tallerkener?", 01, 02, 73);
        Episode erFolketroOvertro = new Episode("Er folketro overtro?", 03, 02, 75);

        Episode stjerneskipetMarcoPolo = new Episode("Stjerneskipet Marco Polo", 01, 01, 37);
        Episode detFremmedeRomskipet = new Episode("Det fremmede romskipet", 02, 01, 36);
        Episode hvemAvOssErDenDrepte = new Episode("Hvem av oss er den drepte?", 03, 01, 38);

    System.out.println("\n");
    System.out.println(blindpassasjer.toString());
    System.out.println("\n");
    System.out.println(stjerneskipetMarcoPolo.toString());

}
}


