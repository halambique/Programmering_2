package no.hiof.mathibr.model;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Production{
    private String tittel;
    protected int playtime;
    private String description;
    private LocalDate utgivelsesdato;
    private Person regissor;
    private ArrayList<Roles> roleGallery = new ArrayList<>();
    private String bildeUrl;

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
    public String getTittel() {
        return tittel;
    }
    public void setTittel(String tittel) {
        this.tittel = tittel;
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
    public LocalDate getUtgivelsesdato() {
        return utgivelsesdato;
    }
    public void setUtgivelsesdato(LocalDate utgivelsesdato) {
        this.utgivelsesdato = utgivelsesdato;
    }
    public void setPlaytime(int playtime) {
        this.playtime = playtime;
    }
    public Person getRegissor() {
        return regissor;
    }
    public void setRegissor(Person regissor) {
        this.regissor = regissor;
    }
    public ArrayList<Roles> getRoleGallery() {
        return roleGallery;
    }
    public String getBildeUrl() {
        return bildeUrl;
    }


    //Constructor

    public Production(String tittel, int playtime, String description, LocalDate utgivelsesdato, Person regissor, ArrayList<Roles> roleGallery) {
        this.tittel = tittel;
        this.playtime = playtime;
        this.description = description;
        this.utgivelsesdato = utgivelsesdato;
        this.regissor = regissor;
        this.roleGallery = roleGallery;
    }

    public Production(String tittel, int playtime, String description, LocalDate utgivelsesdato, Person regissor, ArrayList<Roles> roleGallery, String bildeUrl) {
        this.tittel = tittel;
        this.playtime = playtime;
        this.description = description;
        this.utgivelsesdato = utgivelsesdato;
        this.regissor = regissor;
        this.roleGallery = roleGallery;
        this.bildeUrl = bildeUrl;

    }

    public Production(String tittel) {
        this.tittel = tittel;
    }

    public Production(String tittel, int playtime) {
        this.tittel = tittel;
        this.playtime = playtime;
    }

    public Production(String tittel, int playtime, String description, LocalDate utgivelsesdato) {
    }

    @Override
    public String toString() {
        return "The film: " + getTittel() ;
    }

}
