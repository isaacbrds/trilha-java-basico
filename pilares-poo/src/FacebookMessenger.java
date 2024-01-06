public class FacebookMessenger extends ServicoMensagemInstantanea{

    public void enviarMensagem(){
        verificarConexaoComInternet();
        System.out.println("Enviando Mensagem Facebook Messanger");
        
    }

    public void receberMensagem(){
        System.out.println("Recebendo Mensagem  Facebook Messanger");
    }
}
