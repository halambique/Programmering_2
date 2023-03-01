package no.hiof.mathibr.repository;

import no.hiof.mathibr.model.Episode;
import no.hiof.mathibr.model.TVSeries;

import java.util.ArrayList;

public interface TVSeriesRepo {
    TVSeries getTVSeries(String specificSeries);

    ArrayList<TVSeries> getAllTVSeries();
    ArrayList<Episode> getAllEpisodes(String title, int seasonNumber);
    Episode getSpecificEpisode(String title, int seasonNumber, int episodeNumber);

}
