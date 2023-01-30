package no.hiof.mathibr;

import java.time.LocalDate;
import java.util.ArrayList;


public class TvSeries {
    private String title;
    private String description;
    private LocalDate releaseDate;
    private int numberOfEpisodes;
    private static ArrayList<Episode> episodes = new ArrayList<Episode>();


    public TvSeries(String title, String description, LocalDate releaseDate, int numberOfEpisodes) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public static void addEpisode() {
        Episode Episode = null;
        episodes.add(Episode);
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nFirst aired: " + releaseDate + "\nNumber of episodes: " + numberOfEpisodes;
    }

    //Bør være en enkel metode som ser på .size av array list episoder i array list sesonger?
   // public ArrayList<Episode> getEpisodesInSeason(int season){
    //    return Episode;

    public ArrayList<Episode> episodesInSeason(int season){
        for (int i = 0; episodes.get(season).getSeasonNumber() <= season.size; )
    }



}




