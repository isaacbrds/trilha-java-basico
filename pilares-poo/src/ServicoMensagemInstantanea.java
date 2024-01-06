public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void verificarConexaoComInternet(){
        System.out.println("verificando conexao com internet");
    }
}
