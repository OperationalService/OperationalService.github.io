package hack.server.controllers;

import hack.server.models.Report;
import hack.server.services.ReportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/report")
@RestController()
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/incident/{incidentId}")
    public Report createReportOnIncident(@RequestParam("incidentId") Integer incidentId) {
        return reportService.createReportOnIncident(incidentId);
    }

}
