public class MSNMessenger {
    
    public void enviarMensagem(){
        validarConexaoComInternet();
        System.out.println("Enviando Mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        System.out.println("Recebendo Mensagem");
    }

    private void validarConexaoComInternet(){
        System.out.println("Verificando conexao com Internet.");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem.");
    }
}
