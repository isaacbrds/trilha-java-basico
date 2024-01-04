import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();

    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AGUSTO", "CHAVIER", "MONICA", "SCOTT", "LOGAN"};
        int candidatosSelecionados = 0;
        int contador = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 3 && contador < candidatos.length ) {
            String candidato = candidatos[contador];
            double salario = salarioPretendido();

            if(salarioBase >= salario){
                candidatosSelecionados++;
                System.out.println("O candidato " + candidato +" foi selecionado: ");
            }
            
           contador++;
        }

    }

    static double salarioPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2500);
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
