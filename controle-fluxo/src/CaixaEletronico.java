class CaixaEletronico{
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 29;

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;
            System.out.println(saldo);
        }else{
            System.out.println("Saldo insuficiente, deposite mais dinheiro!");
        }

        
    }
}