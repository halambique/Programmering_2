package no.hiof.mathibr.controller;

import io.javalin.http.Context;
import no.hiof.mathibr.repository.TVSeriesRepo;

public class TVSeriesController {
    private TVSeriesRepo tvSeriesRepo;
    public void getTVSeries(Context context){
        String TVSeriesTitle = context.pathParam("tvserie-id");
        context.json(TVSeriesRepo.getTVSeries(TVSeriesTitle));
    }


    public TVSeriesController(TVSeriesRepo tvSeriesRepo) {
        this.tvSeriesRepo = tvSeriesRepo;
    }
}
