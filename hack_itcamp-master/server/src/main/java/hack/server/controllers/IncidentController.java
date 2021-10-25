package hack.server.controllers;

import hack.server.models.Incident;
import hack.server.services.IncidentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/incident")
@RestController()
public class IncidentController {

    private final IncidentService incidentService;

    public IncidentController(IncidentService incidentService) {
        this.incidentService = incidentService;
    }

    @PostMapping("/upload/json/single")
    public void commitIncident(@RequestBody Incident incident) {
        incidentService.commitIncident(incident);
    }
}
