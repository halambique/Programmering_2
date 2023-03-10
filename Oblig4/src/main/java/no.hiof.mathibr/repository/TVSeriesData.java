package no.hiof.mathibr.repository;

import no.hiof.mathibr.model.Episode;
import no.hiof.mathibr.model.TVSeries;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class TVSeriesData implements TVSeriesRepo {
    private ArrayList<TVSeries> tvSeries = new ArrayList<>();


    //Constructor
    public TVSeriesData() {
        this.tvSeries = tvSeries;

        TVSeries fargoTV = new TVSeries("Fargo", "A dark comedy", LocalDate.of(2014, 4, 15), "img/fargo.jpg");
        for (int seasons = 1; seasons <= 4; seasons++) {
            Random randomPlaytime = new Random();
            for (int episodesInSeason = 1; episodesInSeason <= 10; episodesInSeason++) {
                int randInt = randomPlaytime.nextInt(70 - 55) + 55;
                Episode episode = new Episode("Episode #" + episodesInSeason, episodesInSeason, seasons, randInt);
                fargoTV.addEpisode(episode);
            }
        }
        tvSeries.add(fargoTV);

        TVSeries theWire = new TVSeries("The Wire", "A gritty tale about Baltimore", LocalDate.of(2001, 5, 22), "img/thewire.jpg");
        for (int seasons = 1; seasons <= 5; seasons++) {
            Random randomPlaytime = new Random();
            for (int episodesInSeason = 1; episodesInSeason <= 10; episodesInSeason++) {
                int randInt = randomPlaytime.nextInt(70 - 55) + 55;
                Episode episode = new Episode("Episode #" + episodesInSeason, episodesInSeason, seasons, randInt);
                theWire.addEpisode(episode);
            }
        }
        tvSeries.add(theWire);
    }

    @Override
    public TVSeries getTVSeries(String specificSeries) {
        for (TVSeries series : tvSeries) {
            if (specificSeries.equals(series.getTitle())) ;
            {
                return series;
            }
        }
        return null;
    }

    @Override
    public ArrayList<TVSeries> getAllTVSeries() {
        return tvSeries;
    }

    @Override
    public ArrayList<Episode> getAllEpisodes(String title, int seasonNumber) {
        ArrayList<Episode> allEpisodes = new ArrayList<>();
        for(TVSeries series : tvSeries) {
            if (title.equals(series.getTitle())){
                for(Episode episode : series.getEpisodeList()){
                    if (seasonNumber == episode.getSesongNummer());{
                        allEpisodes.add(episode);
                    }
                }
            }

        }
        return null;
    }

    @Override
    public Episode getSpecificEpisode(String title, int seasonNumber, int episodeNumber) {;
        for(TVSeries series : tvSeries) {
            if (title.equals(series.getTitle())){
                for(Episode episode : series.getEpisodeList()){
                    if (seasonNumber == episode.getSesongNummer());{
                        for(Episode specificEpisode : series.getEpisodeList()){
                            if (episodeNumber == episode.getEpisodeNummer()){
                                return episode;
                            }
                        }
                    }
                }
            }

        }
        return null;
    }


}
