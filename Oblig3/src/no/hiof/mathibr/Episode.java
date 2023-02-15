package no.hiof.mathibr;

import java.time.LocalDate;

public class Episode extends Production {
    private int episodeNumber;
    private int seasonNumber;


    //Constructor without playtime
    public Episode(String title, int episodeNumber, int seasonNumber) {
        super(title);
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }

    //Constructor with all variables
    public Episode(String title, int episodeNumber, int seasonNumber, int playtime, String description, LocalDate releaseDate) {
        super(title, playtime, description, releaseDate);
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;

    }

    public Episode(String s, int episodesInSeason, int seasons, int randInt) {
        super();
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

