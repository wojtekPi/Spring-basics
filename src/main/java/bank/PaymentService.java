package bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    ReportingService internalReportingService;
    ReportingService regulatoryReportingService;
    TransactionService transactionService;
    ConnfirmationService connfirmationService;

    @Autowired
    public PaymentService(ReportingService internalReportingService, ReportingService regulatoryReportingService, TransactionService transactionService) {
        this.internalReportingService = internalReportingService;
        this.regulatoryReportingService = regulatoryReportingService;
        this.transactionService = transactionService;
    }

    @Autowired
    public void setConnfirmationService(ConnfirmationService connfirmationService) {
        this.connfirmationService = connfirmationService;
    }

    @Override
    public String toString() {
        return "PaymentService{" +
                "internalReportingService=" + internalReportingService.getName() +
                ", regulatoryReportingService=" + regulatoryReportingService.getName() +
                ", transactionService=" + transactionService.getName() +
                ", connfirmationService=" + connfirmationService.getName() +
                '}';
    }
}
