public class TelegramImpl2 implements Telegram{
    @Override
    public void sendMessage() {
        System.out.println("Сообщения не отправляются сервис ремонтируется");
    }

    @Override
    public void getMessage() {
        System.out.println("Сообщения не принимаются сервис ремонтируется");
    }

    @Override
    public int getCountIn() {
        return 0;
    }

    @Override
    public int getCountOut() {
        return 0;
    }
}
