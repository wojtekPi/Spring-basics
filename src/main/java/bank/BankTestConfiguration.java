package bank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class BankTestConfiguration {

    @Bean
    public ReportingService reportingService() {
        return new ReportingService("Testing reporting service");
    }
}