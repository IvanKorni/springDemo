public class TelegramImpl implements Telegram{
    private int countIn;
    private int countOut;

    @Override
    public void sendMessage() {
        System.out.println("Сообщение отправлено");
        countOut();
    }

    @Override
    public void getMessage() {
        System.out.println("Сообщение принято");
        countIn();
    }

    private void countIn(){
        countIn++;
    }

    private void countOut(){
        countOut++;
    }

    public int getCountIn() {
        return countIn;
    }

    public int getCountOut() {
        return countOut;
    }
}
