public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        analisarCanditato(1999.0);
        analisarCanditato(2000.0);
        analisarCanditato(2500.0);

    }

    static void analisarCanditato( double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }else if(salarioBase < salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else{
            System.out.println("AGUARDAR RESULTADOS DOS DEMAIS CANDIDATO");
        }
    }
}
