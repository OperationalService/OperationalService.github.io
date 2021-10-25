package hack.server.services;

import hack.server.models.Incident;
import hack.server.models.Report;
import hack.server.models.Threat;
import hack.server.repositories.IncidentRepository;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    private final IncidentRepository incidentRepository;

    public ReportService(IncidentRepository incidentRepository) {
        this.incidentRepository = incidentRepository;
    }

    public Report createReportOnIncident(Incident incident) {
        StringBuilder sb = new StringBuilder();
        sb.append("Инцидент реализовал следующие риски: [");
        for (int i = 0; i < incident.getAffectedThreats().size(); i++) {
            Threat threat = incident.getAffectedThreats().get(i);
            sb.append(threat.getCode());
            sb.append(", ");
        }
        sb.append(incident.getAffectedThreats().get(incident.getAffectedThreats().size()-1));
        sb.append("].");
        return new Report(sb.toString());
    }

    public Report createReportOnIncident(int incidentId) {
        Incident incident = incidentRepository.findById(incidentId).orElseThrow();
        return createReportOnIncident(incident);
    }

}
