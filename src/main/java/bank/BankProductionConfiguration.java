package bank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class BankProductionConfiguration {


    @Bean
    public ReportingService reportingService(){
        return new ReportingService("Production reporting service");
    }
}
