package hack.server.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OperationalProcess {
    @Id
    private String code;
    private String name;
    private String description;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Threat> threats = new ArrayList<>();

    public OperationalProcess() {
    }

    public OperationalProcess(String code, String name, String description, List<Threat> threats) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.threats = threats;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Threat> getThreats() {
        return threats;
    }

    public void setThreats(List<Threat> threats) {
        this.threats = threats;
    }
}
