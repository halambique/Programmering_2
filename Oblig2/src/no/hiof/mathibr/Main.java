package no.hiof.mathibr;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TvSeries medicalCenter = new TvSeries("Medical Center", "Medical Center (also known as Calling Dr. Gannon) is an American medical drama series that aired on CBS from 1969 to 1976. It was produced by MGM Television.\n" +
                "\n", LocalDate.of(1969, 9, 24), 171);

        Episode theLastTenYards = new Episode("The Last Ten Yards", 1, 1, 60);
        Episode victim = new Episode("Victim", 2, 1, 60);
        Episode emergencyInWardE = new Episode("Emergency in Ward E", 3, 1, 60);

        System.out.println("\n");
        System.out.println(medicalCenter.toString());
        System.out.println("\n");
        System.out.println(theLastTenYards.toString());


        /*Lage en array list med sesonger og array lists inni med episoder???
        Bruke set-metode?? Bruke addEpisode fra TvSeries?*/
        for (int seasons = 1; seasons<=7; seasons++){
            for (int episodesInSeason = 0; episodesInSeason <= 24; episodesInSeason++)
            Episode episode = new Episode("Episode #" + episodesInSeason, episodesInSeason, Episode.getSeasonNumber);
                TvSeries.addEpisode();
        }

    }

}


