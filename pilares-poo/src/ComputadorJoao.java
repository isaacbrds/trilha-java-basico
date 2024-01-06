public class ComputadorJoao {
    public static void main(String[] args) {
        MSNMessenger msnMessenger = new MSNMessenger();
        FacebookMessenger facebookMessenger = new FacebookMessenger();
        TelegramMessenger telegramMessenger = new TelegramMessenger();

        msnMessenger.enviarMensagem();
        msnMessenger.receberMensagem();

        facebookMessenger.enviarMensagem();
        facebookMessenger.receberMensagem();

        telegramMessenger.enviarMensagem();
        telegramMessenger.receberMensagem();
    }
}
