package principal;


import java.util.Scanner;

public class Contador {


    public static void main(String[] args) throws ParametrosInvalidosException {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        int contagem = 0;

        try {
            contar(parametroUm, parametroDois);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if (parametroDois < parametroUm) {
            throw new IllegalArgumentException("O primeiro parâmetro é maior que o segundo.");

        } else {
            int contagem = parametroDois - parametroUm;
            for (int i = 0; i < contagem ; i++) {
                System.out.println("Imprimindo o número " + (i + 1));
            }
        }




    }
}



