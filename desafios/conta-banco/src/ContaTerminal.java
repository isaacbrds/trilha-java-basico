import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Bem vindo ao Cadastro de Sua Conta Bancária");
        
        System.out.println("Digite o numero da conta");
        int numero = scanner.nextInt();
        
        System.out.println("Digite a agencia do seu banco");
        String agencia = scanner.next();
        
        System.out.println("Digite o nome do cliente");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite o saldo da conta");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, ");
        System.out.println("sua agência é " + agencia + ", conta " + numero);
        System.out.println("e seu saldo " + saldo + "já está disponível para saque");
        
    }
}
