package no.hiof.mathibr;

import java.time.LocalDate;
import java.util.ArrayList;

public class Episode extends Production {
    private int episodeNumber;
    private int seasonNumber;


    //Constructor without playtime
    public Episode(String title, int episodeNumber, int seasonNumber) {
        this.setTitle(title);
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }

    //Constructor with all variables
    public Episode(String title, int episodeNumber, int seasonNumber, int playtime) {
        this.setTitle(title);
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
        this.setPlaytime(playtime);

    }
    //Get-methods

    public int getEpisodeNumber() {
        return episodeNumber;
    }
    public int getSeasonNumber() {
        return seasonNumber;
    }


    //Set-methods
    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }
    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }


    //toString() method implementation
    @Override
    public String toString() {
        return "Episode name: " + getTitle() + "\nEpisode number: " + episodeNumber + "\nSeason number: " + seasonNumber + "\nPlaytime: " + getPlaytime()+"\n";

    }
}

