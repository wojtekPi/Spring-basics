package bank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralBankConfiguration {

    @Bean
    public TransactionService transactionService(){
        return new TransactionService("transaction");
    }


    @Bean
    public ConnfirmationService connfirmationService(){
        return new ConnfirmationService("The best configuration system.");
    }
}
