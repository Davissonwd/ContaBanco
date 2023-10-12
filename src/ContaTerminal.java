import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Declaração dos atributos da conta
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        // Criação de um objeto Scanner para receber dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação dos dados da conta
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o saldo da Conta: ");
        saldo = scanner.nextDouble();

        // Exibição dos dados da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }

}