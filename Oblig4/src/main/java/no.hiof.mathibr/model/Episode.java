package no.hiof.mathibr.model;

public class Episode extends Production implements Comparable<Episode>{
    private int episodeNummer;
    private int sesongNummer;


    //Constructor without playtime
    public Episode(String title, int episodeNummer, int sesongNummer) {
        this.setTittel(title);
        this.episodeNummer = episodeNummer;
        this.sesongNummer = sesongNummer;
    }

    //Constructor with all variables
    public Episode(String title, int episodeNummer, int sesongNummer, int playtime) {
        this.setTittel(title);
        this.episodeNummer = episodeNummer;
        this.sesongNummer = sesongNummer;
        this.setPlaytime(playtime);

    }
    //Get-methods

    public int getEpisodeNummer() {
        return episodeNummer;
    }
    public int getSesongNummer() {
        return sesongNummer;
    }


    //Set-methods
    public void setEpisodeNummer(int episodeNummer) {
        this.episodeNummer = episodeNummer;
    }
    public void setSesongNummer(int sesongNummer) {
        this.sesongNummer = sesongNummer;
    }


    //toString() method implementation
    @Override
    public String toString() {
        return "Episode name: " + getTittel() + "\nEpisode number: " + episodeNummer + "\nSeason number: " + sesongNummer + "\nPlaytime: " + getPlaytime()+"\n";

    }

    @Override
    public int compareTo(Episode otherEpisode) {
        if (this.playtime > otherEpisode.getPlaytime()){
            return 1;
        } else if (this.playtime < otherEpisode.playtime) {
            return -1;
        } else {
            return 0;
        }
        }
    }

