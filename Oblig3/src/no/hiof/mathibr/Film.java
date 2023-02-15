package no.hiof.mathibr;

public class Film extends Production{

    //toString
    @Override
    public String toString() {
        return getTitle();
    }

    //Constructor
    public Film(String title, int playtime) {
        super(title, playtime);
    }

    public Film(String title) {
        super(title);
    }
}
