public class FacebookMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        validarConexaoComInternet();
        System.out.println("Enviando Mensagem Facebook Messanger");
        salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        System.out.println("Recebendo Mensagem  Facebook Messanger");
    }

    private void validarConexaoComInternet(){
        System.out.println("Verificando conexao com Internet.");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem.");
    }
}
