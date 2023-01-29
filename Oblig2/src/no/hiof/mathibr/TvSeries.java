package no.hiof.mathibr;

import java.time.LocalDate;
import java.util.ArrayList;


public class TvSeries {
    private String title;
    private String description;
    private LocalDate releaseDate;
    private byte numberOfEpisodes;
    private ArrayList<Episode> episodes = new ArrayList<Episode>();


    public TvSeries(String title, String description, LocalDate releaseDate, byte numberOfEpisodes) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nFirst aired: " + releaseDate + "\nNumber of episodes: " + numberOfEpisodes;
    }

    public ArrayList<Episode> getEpisodesInSeason(int season){
        ArrayList<Episode> episodes = new ArrayList<Episode>();
        int episodeCount = 0;
        while (season <= 5) {
            season++;

            while (episodeCount <= 20 ) {
                episodes.add(new Season(season, episodeCount));
            }
        }

        return season, episodeCount;
    }


}

