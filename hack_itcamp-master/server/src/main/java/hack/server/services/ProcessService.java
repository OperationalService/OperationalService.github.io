package hack.server.services;

import hack.server.models.BusinessProcess;
import hack.server.models.OperationalProcess;
import hack.server.repositories.BusinessProcessRepository;
import hack.server.repositories.OperationalProcessRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProcessService {

    private final BusinessProcessRepository businessProcessRepository;
    private final OperationalProcessRepository operationalProcessRepository;

    public ProcessService(BusinessProcessRepository businessProcessRepository, OperationalProcessRepository operationalProcessRepository) {
        this.businessProcessRepository = businessProcessRepository;
        this.operationalProcessRepository = operationalProcessRepository;
    }

    public void initFromHardcode() {
        OperationalProcess operationalProcess1 = new OperationalProcess("О1", "КОнсультация специалиста",
                "Телефонный разговор заказчика и специалиста техподдержки", Collections.emptyList());
        operationalProcessRepository.save(operationalProcess1);
        BusinessProcess businessProcess1 = new BusinessProcess("Б1", "Техподдержка",
                "Оказание технической поддержки заказчикам", List.of(operationalProcess1));
        businessProcessRepository.save(businessProcess1);
    }

    public List<BusinessProcess> getAllBusinessProcesses() {
        return businessProcessRepository.findAll();
    }
}
