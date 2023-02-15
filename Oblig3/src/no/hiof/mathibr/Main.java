package no.hiof.mathibr;
import javax.management.relation.Role;
import java.time.LocalDate;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Film noCountryForOldMen = new Film("No Country for Old Men", 122);
        Film fargo = new Film("Fargo", 98);
        Person ethanCoen = new Person("Ethan", "Coen",
                LocalDate.of(1957, 9, 21), 6);
        Person joelCoen = new Person("Joel", "Coen",
                LocalDate.of(1954, 11, 29), 6);
        fargo.setDirector(joelCoen);
        System.out.println(fargo.toString() + " was directed by "+ fargo.getDirector().getFullName());

        Episode theCrocodilesDilemma = new Episode("The Crocodile's Dilemma", 68, 1);
        theCrocodilesDilemma.setDirector(new Person("Adam", "Bernstein"));

        System.out.println(theCrocodilesDilemma.getTitle() + " was directed by " + theCrocodilesDilemma.getDirector().getFullName());

        Person billyBobThornton = new Person("Billy Bob", "Thornton",
                LocalDate.of(1955, 8, 4), 0);
        Person martinFreeman = new Person("Martin", "Freeman", LocalDate.of(1971, 9, 8), 0);

        TvSeries fargoTV = new TvSeries("Fargo", "A dark comedy",LocalDate.of(2014,4,15));
        for (int seasons = 1; seasons<=4; seasons++){
            for (int episodesInSeason = 1; episodesInSeason <= 10; episodesInSeason++) {
                Random randomPlaytime = new Random();
                int randInt = randomPlaytime.nextInt(70-55) + 55;
                Episode episode = new Episode("Episode #" + episodesInSeason, episodesInSeason, seasons, randInt);
                fargoTV.addEpisode(episode);
            }
        }
        System.out.println("Blablabla" + fargoTV.getEpisodeList().toString());
    }
}


