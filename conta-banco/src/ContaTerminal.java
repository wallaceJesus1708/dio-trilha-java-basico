import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Criação do objeto Scanner para leitura do terminal

        Scanner scanner = new Scanner(System.in);

        //Solicitação e leitura dos dados
        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); //limpar o buffer do Enter

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        //Exibição da mensagem final
        System.out.println("\n Olá " + nomeCliente +
        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero + 
        " e seu saldo R$ " + saldo + " já esta disponvel para saque.");


        //Fechamento do Scanner...........
        scanner.close();
    }
}
