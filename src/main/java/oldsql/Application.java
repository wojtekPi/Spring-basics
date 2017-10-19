package oldsql;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("oldsql/oldStyleSpringConfig.xml");
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}