package no.hiof.mathibr;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.vue.VueComponent;
import no.hiof.mathibr.controller.EpisodeController;
import no.hiof.mathibr.controller.TVSeriesController;
import no.hiof.mathibr.repository.TVSeriesData;
import org.jetbrains.annotations.NotNull;

public class Application {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.staticFiles.enableWebjars();
            config.vue.vueAppName = "app";
        }).start(9002);


        TVSeriesData seriesList = new TVSeriesData();
        TVSeriesController tvSeriesController = new TVSeriesController(seriesList);
        EpisodeController episodeController = new EpisodeController(seriesList);

        //Vue-components
        app.get("/", new VueComponent("hello-world"));
        app.get("/tvserie", new VueComponent("tvserie-overview"));
        app.get("/tvserie/{tvserie-id}/season/{sesong-nr}", new VueComponent("tvserie-detail"));
        app.get("/tvserie/{tvserie-id}/season/{sesong-nr}/episode/{episode-nr}", new VueComponent("episode-detail"));

        //Handlers
        app.get("api", new Handler() {
            @Override
            public void handle( Context context) {
                context.result("Hello World");
            }
        });
        app.get("api/tvserie", new Handler() {
            @Override
            public void handle( Context context) {
                context.result("Hello World");
            }
        });
        app.get("api/tvserie/{tvserie-id}/season/{sesong-nr}", new Handler() {
            @Override
            public void handle( Context context) {
                context.result("Hello World");
            }
        });
        app.get("api/tvserie/{tvserie-id}/season/{sesong-nr}/episode/{episode-nr}", new Handler() {
            @Override
            public void handle( Context context) {
                context.result("Hello World");
            }
        });
    }
}
