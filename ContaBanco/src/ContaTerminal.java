import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         
        Scanner scan = new Scanner(System.in);

        String numeroConta;
        String numeroAgencia;
        String nomeCliente; 
        double saldo;

        System.out.println("Informe o número da agencia:");
        numeroAgencia = scan.nextLine();
        System.out.println("Informe o número da conta:");
        numeroConta = scan.nextLine();
        System.out.println("Informe o nome do Cliente:");
        nomeCliente = scan.nextLine();
        System.out.println("Informe o saldo do cliente:");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " 
                            + saldo + " já está disponível para saque. Seja bem vindo(a)." );
        

        scan.close();
    }
}
