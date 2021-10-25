package hack.server.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Incident {
    @Id
    private int id;
    private String description;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Threat> affectedThreats = new ArrayList<>();

    public Incident() {
    }

    public Incident(String description, List<Threat> affectedThreats) {
        this.description = description;
        this.affectedThreats = affectedThreats;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Threat> getAffectedThreats() {
        return affectedThreats;
    }

    public void setAffectedThreats(List<Threat> affectedThreats) {
        this.affectedThreats = affectedThreats;
    }
}
