import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Configuration.class);
        Telegram telegram = context.getBean("telegram", Telegram.class);
        telegram.sendMessage();
        telegram.sendMessage();
        telegram.getMessage();

        Statistic statistic = context.getBean("statistic", Statistic.class);
        statistic.getInfo();
    }
}
