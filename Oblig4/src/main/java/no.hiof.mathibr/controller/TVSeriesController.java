package no.hiof.mathibr.controller;

import io.javalin.http.Context;
import no.hiof.mathibr.model.TVSeries;
import no.hiof.mathibr.repository.TVSeriesRepo;

import java.util.ArrayList;

public class TVSeriesController {
    private TVSeriesRepo tvSeriesRepo;
    public void getSingleTVSeries(Context context){
        String TVSeriesTitle = context.pathParam("tvserie-id");
        context.json(tvSeriesRepo.getTVSeries(TVSeriesTitle));
    }

    public void getAllTVSeries(Context context){
        ArrayList<TVSeries> allTVSeries = tvSeriesRepo.getAllTVSeries();
        context.json(tvSeriesRepo.getAllTVSeries());
    }

    public TVSeriesController(TVSeriesRepo tvSeriesRepo) {
        this.tvSeriesRepo = tvSeriesRepo;
    }
}
