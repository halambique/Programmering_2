package no.hiof.mathibr;

public class Episode {
    private String title;
    private int episodeNumber;
    private int seasonNumber;
    private int playtime;

    //Constructor without playtime
    public Episode(String title, int episodeNumber, int seasonNumber) {
        this.title = title;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }

    //Constructor with all variables
    public Episode(String title, int episodeNumber, int seasonNumber, int playtime) {
        this.title = title;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
        this.playtime = playtime;

    }

    //Get-methods
    public String getTitle() {
        return title;
    }
    public int getEpisodeNumber() {
        return episodeNumber;
    }
    public int getSeasonNumber() {
        return seasonNumber;
    }
    public int getPlaytime() {
        return playtime;
    }

    //Set-methods
    public void setTitle(String title) {
        this.title = title;
    }
    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }
    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }
    public void setPlaytime(int playtime) {
        this.playtime = playtime;
    }

    //toString() method implementation
    @Override
    public String toString() {
        return "Episode name: " + title + "\nEpisode number: " + episodeNumber + "\nSeason number: " + seasonNumber + "\nPlaytime: " + playtime;

    }
}

