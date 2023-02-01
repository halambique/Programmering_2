package no.hiof.mathibr;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.random.RandomGenerator;


public class TvSeries {
    private String title;
    private String description;
    private LocalDate releaseDate;
    private ArrayList<Episode> episodeList = new ArrayList<>();
    private int avgPlaytime;


    public TvSeries(String title, String description, LocalDate releaseDate, int numberOfEpisodes) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.episodeList = episodeList;
    }

    public void addEpisode(Episode episode) {
        episodeList.add(episode);
        this.updateAvgPlaytime();
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nFirst aired: " + releaseDate;
    }

    public void updateAvgPlaytime(){
        int newAvgPlaytime = 0;
        for (Episode episode : this.episodeList){
            newAvgPlaytime += episode.getPlaytime();
            System.out.println(newAvgPlaytime);
            System.out.println(episode.getPlaytime());
        }
        this.avgPlaytime = newAvgPlaytime/episodeList.size();
    }


    public ArrayList<Episode> episodesInSeason(int season) {
        ArrayList<Episode> returnSeason = new ArrayList<>();
        for (int i = 0; i < episodeList.size(); i++){
            if (season == episodeList.get(i).getSeasonNumber()){
                returnSeason.add(episodeList.get(i));
            }
        }
        return returnSeason;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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
    public ArrayList<Episode> getEpisodeList() {
        return episodeList;
    }
    public void setEpisodeList(ArrayList<Episode> episodeList) {
        this.episodeList = episodeList;
    }
    public int getAvgPlaytime() {
        return avgPlaytime;
    }


}