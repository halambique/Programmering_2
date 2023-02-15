package no.hiof.mathibr;

import java.time.LocalDate;

public class Roles {
    private String characterFirstName;
    private String characterLastName;
    private Person portrayedBy;

    public Roles(String characterFirstName, String characterLastName, Person portrayedBy) {
        this.characterFirstName = characterFirstName;
        this.characterLastName = characterLastName;
        this.portrayedBy = portrayedBy;
    }

    public String getCharacterFirstName() {
        return characterFirstName;
    }

    public void setCharacterFirstName(String characterFirstName) {
        this.characterFirstName = characterFirstName;
    }
    public String getCharacterLastName() {
        return characterLastName;
    }
    public void setCharacterLastName(String characterLastName) {
        this.characterLastName = characterLastName;
    }
    public Person getPortrayedBy() {
        return portrayedBy;
    }

    public void setPortrayedBy(Person portrayedBy) {
        this.portrayedBy = portrayedBy;
    }
}
