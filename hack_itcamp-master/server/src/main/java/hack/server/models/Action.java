package hack.server.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Action {
    @Id
    private String code;
    private String description;
    private String webhook;

    public Action() {
    }

    public Action(String description, String webhook) {
        this.description = description;
        this.webhook = webhook;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebhook() {
        return webhook;
    }

    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }
}
