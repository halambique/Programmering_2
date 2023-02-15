package no.hiof.mathibr;

import java.time.LocalDate;
import java.util.ArrayList;

public class Production{
    private String title;
    private int playtime;
    private String description;
    private LocalDate releaseDate;
    private String director;
    private ArrayList<>



    //Getter-Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPlaytime() {
        return playtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setPlaytime(int playtime) {
        this.playtime = playtime;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

//Constructor

    public Production(String title, int playtime, String description, LocalDate releaseDate, String director) {
        this.title = title;
        this.playtime = playtime;
        this.description = description;
        this.releaseDate = releaseDate;
        this.director = director;
    }


    public Production(String title) {
        this.title = title;
    }

}
