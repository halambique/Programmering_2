package no.hiof.mathibr.controller;

import io.javalin.http.Context;
import no.hiof.mathibr.model.Episode;
import no.hiof.mathibr.model.TVSeries;
import no.hiof.mathibr.repository.TVSeriesData;
import no.hiof.mathibr.repository.TVSeriesRepo;

import java.security.PublicKey;
import java.util.ArrayList;

public class EpisodeController {
    private TVSeriesRepo tvSeriesRepo;

    public void getEpisodesInTVSeries(Context context){
        String TVSeriesTitle = context.pathParam("tvserie-id");
        String TVSeriesSeason = context.pathParam("sesong-nr");
        int seasonNumber = Integer.parseInt(TVSeriesSeason);
        context.json(tvSeriesRepo.getAllEpisodes(TVSeriesTitle, seasonNumber));
    }

    public void getSingleEpisode(Context context){
        String series = context.pathParam("tvserie-id");
        String TVSeriesSeason = context.pathParam("sesong-nr");
        int seasonNumber = Integer.parseInt(TVSeriesSeason);
        int episodeNumber = Integer.parseInt(context.pathParam("episode-id"));
        Episode singleEpisode = tvSeriesRepo.getSpecificEpisode(series, seasonNumber, episodeNumber);

        context.json(singleEpisode);

    }


    //Constructor
    public EpisodeController(TVSeriesRepo tvSeriesRepo) {
        this.tvSeriesRepo = tvSeriesRepo;
    }
}
