package no.hiof.mathibr;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Production{
    private String title;
    private int playtime;
    private String description;
    private LocalDate releaseDate;
    private Person director;
    private ArrayList<Roles> roleGallery = new ArrayList<>();

    public Production() {

    }


    public void addRole(Roles role){
        roleGallery.add(role);
    }

    public void addMultipleRoles(ArrayList<Roles> roles){
        for (int i = 0; i < roles.size(); i++){
            roleGallery.add(roles.get(i));
        }
    }


    //Getter-Setter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPlaytime() {
        return playtime;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
    public void setPlaytime(int playtime) {
        this.playtime = playtime;
    }
    public Person getDirector() {
        return director;
    }
    public void setDirector(Person director) {
        this.director = director;
    }
    public ArrayList<Roles> getRoleGallery() {
        return roleGallery;
    }

    //Constructor

    public Production(String title, int playtime, String description, LocalDate releaseDate, Person director, ArrayList<Roles> roleGallery) {
        this.title = title;
        this.playtime = playtime;
        this.description = description;
        this.releaseDate = releaseDate;
        this.director = director;
        this.roleGallery = roleGallery;
    }

    public Production(String title) {
        this.title = title;
    }

    public Production(String title, int playtime) {
        this.title = title;
        this.playtime = playtime;
    }

    public Production(String title, int playtime, String description, LocalDate releaseDate) {
    }

    @Override
    public String toString() {
        return "The film: " + getTitle() ;
    }


}
