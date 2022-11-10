import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public Telegram telegram() {
        return new TelegramImpl();
    }

    @Bean
    public Telegram telegramNew() {
        return new TelegramImpl2();
    }

    @Bean
    public Statistic statistic(Telegram telegramNew){
        return new StatisticImpl(telegramNew);
    }

}
