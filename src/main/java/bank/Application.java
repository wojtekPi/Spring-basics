package bank;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(hello.Application.class);
        PaymentService paymentService;
        paymentService = context.getBean(PaymentService.class);
        paymentService.toString();
    }
}