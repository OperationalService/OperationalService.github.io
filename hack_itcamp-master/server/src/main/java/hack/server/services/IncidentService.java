package hack.server.services;

import hack.server.models.Incident;
import hack.server.models.Threat;
import hack.server.repositories.IncidentRepository;
import org.springframework.stereotype.Service;

@Service
public class IncidentService {

    private final IncidentRepository incidentRepository;
    private final ThreatService threatService;

    public void commitIncident(Incident incident) {
        incidentRepository.save(incident);
        for (Threat threat : incident.getAffectedThreats()) {
            threatService.handleWebhooks(threat);
        }
    }

    public IncidentService(IncidentRepository incidentRepository, ThreatService threatService) {
        this.incidentRepository = incidentRepository;
        this.threatService = threatService;
    }
}
