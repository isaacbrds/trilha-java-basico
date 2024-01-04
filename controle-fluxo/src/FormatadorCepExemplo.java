public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String meuCepFormatado = formatarCep("6311306");
            System.out.println(meuCepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O Cep informado não atende os requisitos.");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }

        return "63.113-096";
    }
}
