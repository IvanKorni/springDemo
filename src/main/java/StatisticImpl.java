public class StatisticImpl implements Statistic{

    private final Telegram telegram;

    public StatisticImpl(Telegram telegram) {
        this.telegram = telegram;
    }

    @Override
    public void getInfo() {
        System.out.println("Сообщений получено " + telegram.getCountIn());
        System.out.println("Сообщений отправлено " + telegram.getCountOut());
    }
}
