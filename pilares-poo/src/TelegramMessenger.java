public class TelegramMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        verificarConexaoComInternet();
        System.out.println("Enviando Mensagem pelo telegram");
    }

    public void receberMensagem(){
        System.out.println("Recebendo Mensagem pelo telegram");
    }

}
