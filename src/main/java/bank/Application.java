package bank;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
public class Application {



    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);

//        ConnfirmationService connfirmationService = context.getBean(ConnfirmationService.class);
//        System.out.println(connfirmationService.getName());

        PaymentService paymentService;
        paymentService = context.getBean(PaymentService.class);
        System.out.println(paymentService);
    }
}