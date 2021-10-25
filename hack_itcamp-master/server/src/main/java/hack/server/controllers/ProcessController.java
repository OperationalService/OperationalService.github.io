package hack.server.controllers;

import hack.server.models.BusinessProcess;
import hack.server.services.ProcessService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/structure")
@RestController()
public class ProcessController {
    private final ProcessService processService;

    public ProcessController(ProcessService processService) {
        this.processService = processService;
    }

    @GetMapping("/bp")
    public List<BusinessProcess> getBusinessProcesses() {
        return processService.getAllBusinessProcesses();
    }

    /**
     * ДОбавляет информацию о бизнесс-процессах путём чтения Excel-файла
     */
    @PostMapping("/upload/excel")
    public void initExcel() {
        // TODO not implemented
    }

    /**
     * Добавляет информацию о бизнесс-процессаз из захардкоженных данных
     */
    @PostMapping("/upload/hard_code")
    public void initHardcode() {
        processService.initFromHardcode();
    }
}
