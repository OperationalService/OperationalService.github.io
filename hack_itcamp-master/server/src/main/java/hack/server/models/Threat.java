package hack.server.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Threat {
    @Id
    private String code;
    private String shortDescription;
    private String longDescription;
    private boolean isManaged;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Action> actions = new ArrayList<>();

    public Threat() {
    }

    public Threat(String code, String shortDescription, String longDescription, boolean isManaged, List<Action> actions) {
        this.code = code;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.isManaged = isManaged;
        this.actions = actions;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public boolean isManaged() {
        return isManaged;
    }

    public void setManaged(boolean managed) {
        isManaged = managed;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }
}

