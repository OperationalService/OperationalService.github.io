package hack.server.services;

import hack.server.models.Action;
import hack.server.models.OperationalProcess;
import hack.server.models.Threat;
import hack.server.repositories.OperationalProcessRepository;
import hack.server.repositories.ThreatRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThreatService {

    private static final Logger log = LoggerFactory.getLogger(ThreatService.class);
    private final ThreatRepository threatRepository;
    private final OperationalProcessRepository operationalProcessRepository;

    public ThreatService(ThreatRepository threatRepository, OperationalProcessRepository operationalProcessRepository) {
        this.threatRepository = threatRepository;
        this.operationalProcessRepository = operationalProcessRepository;
    }

    public void handleWebhooks(Threat threat) {
        for (Action action : threat.getActions()) {
            log.info("Webhook: " + action.getWebhook());
        }
    }

    public void initFromHardcode() {
        Action action1 = new Action("Выключите сотрудника из розетки", null);
        Threat threat1 = new Threat("1", "Сотрудник заболел",
                "Сотрудник временно потерял трудоспособность из-за болезни",
                true,
                List.of(action1));
        OperationalProcess operationalProcess = operationalProcessRepository.findById("О1").orElseThrow();
        operationalProcess.getThreats().add(threat1);
        operationalProcessRepository.save(operationalProcess);
    }


    public List<Threat> findSimilar(String description) {
        return threatRepository.findAll();
    }
}
