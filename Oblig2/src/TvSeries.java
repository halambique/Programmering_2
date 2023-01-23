import java.time.LocalDate;
import java.util.ArrayList;


public class TvSeries {
    private String title;
    private String description;
    private LocalDate releaseDate;
    private byte numberOfEpisodes;
    private ArrayList<Episode> episodes = new ArrayList<Episode>();


    public TvSeries(String title, String description, LocalDate releaseDate, byte numberOfEpisodes) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }
}

