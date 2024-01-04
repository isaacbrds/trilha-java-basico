import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite dois parametros para a classe contador.");
        
        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // TODO: handle exception
            System.out.println("O parametro dois deve ser maior que o parametro um");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        
        if(parametroDois <= parametroUm) throw new ParametrosInvalidosException();
        
        int contagem = parametroDois - parametroUm;

        for(int i = 0; i<contagem; i++){
            System.out.println("Contador funcionando e a iteração tem índice: " + i);
        }
    }
}
