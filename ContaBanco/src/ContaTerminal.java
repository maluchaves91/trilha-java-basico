import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        System.out.println();
        System.out.println(
            "Olá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " +
            agencia + 
            ", conta " +
            numero + 
            "e seu saldo R$ " + 
            saldo + 
            " já está disponível na conta"
        );

        scanner.close();

        
    }
}
