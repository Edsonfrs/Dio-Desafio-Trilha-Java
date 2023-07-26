public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 14.0;
        double saldoAtual = saldo - valorSolicitado;

        if (valorSolicitado < saldo) {
            saldoAtual = saldo - valorSolicitado;
            System.out.println("Saldo atual: " + saldo);
            System.out.println("Valor solicitado: " + valorSolicitado);
            System.out.println("Saldo atual: " + saldoAtual);
        } else {
            System.out.println("Saldo: " + saldo);
            System.out.println("Valor solicitado: " + valorSolicitado);
            System.out.println("Saldo insuficiente");

            
        }

        
        
    }
    
}
