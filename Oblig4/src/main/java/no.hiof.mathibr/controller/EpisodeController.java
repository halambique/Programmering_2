package no.hiof.mathibr.controller;

import io.javalin.http.Context;
import no.hiof.mathibr.repository.TVSeriesRepo;

public class EpisodeController {
    private TVSeriesRepo tvSeriesRepo;

    public void getEpisodesInTVSeries(Context context){
        String TVSeriesTitle = context.pathParam("tvserie-id");
        String TVSeriesSeason = context.pathParam("sesong-nr");
        int seasonNumber = Integer.parseInt(TVSeriesSeason);
    }


    //Constructor
    public EpisodeController(TVSeriesRepo tvSeriesRepo) {
        this.tvSeriesRepo = tvSeriesRepo;
    }
}
