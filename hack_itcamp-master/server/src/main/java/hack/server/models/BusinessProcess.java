package hack.server.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BusinessProcess {
    @Id
    private String code;
    private String name;
    private String description;
    @OneToMany(fetch = FetchType.EAGER)
    private List<OperationalProcess> operationalServices = new ArrayList<>();

    public BusinessProcess() {
    }

    public BusinessProcess(String code, String name, String description, List<OperationalProcess> operationalServices) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.operationalServices = operationalServices;
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

    public List<OperationalProcess> getOperationalServices() {
        return operationalServices;
    }

    public void setOperationalServices(List<OperationalProcess> operationalServices) {
        this.operationalServices = operationalServices;
    }
}
