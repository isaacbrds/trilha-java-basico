public class ComputadorJoao {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if(appEscolhido.equalsIgnoreCase("msn")){
            smi = new MSNMessenger();
        } else if (appEscolhido.equalsIgnoreCase("tlg")){
            smi = new TelegramMessenger();
        }else{
            smi = new FacebookMessenger();
        }

        smi.enviarMensagem();
        smi.receberMensagem();

        
    }
}
