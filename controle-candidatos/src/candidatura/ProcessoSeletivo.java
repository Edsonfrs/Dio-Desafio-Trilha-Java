package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        //analisarCandidato(1900.0);
        //analisarCandidato(2200.0);
        //analisarCandidato(2000.0);
        //selecaoCandidatos();
        //imprimirSelecionados();

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }




    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("Candidato: " + candidato);
            System.out.println("Status: Contato realizado com sucesso");
            System.out.println("Número de tentativas: " + tentativasRealizadas);
            System.out.println("-------------------------------------------------------");
        } else {
            System.out.println("Candidato: " + candidato);
            System.out.println("Status: Contato não realizado");
            System.out.println("Número de tentativas: " + tentativasRealizadas);
            System.out.println("-------------------------------------------------------");
        }


    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("CANDIDATOS SELECIONADOS");
        System.out.println("Forma 1");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato: " + candidatos[i] + "    Código: " + (i + 1));
        }

        System.out.println("CANDIDATOS SELECIONADOS");
        System.out.println("Forma 2");

        for (String candidato: candidatos) {
            System.out.println("Candidato: " + candidato);
        }





    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELLA", "DANIELA", "JOANA"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            double salarioBase = 2000.0;

            System.out.println("Candidato(a): " + candidato);
            System.out.println("Salário Pretendido: " + salarioPretendido);


            if (salarioBase > salarioPretendido) {
                System.out.println("Canditado(a) Selecionado(a): " + candidato);
                System.out.println("-------------------------------------------------------");
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2000.0);
    }


    static void analisarCandidato(double salarioPretendido) {
        
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
        System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDAR RESULTADO DOS OUTROS CANDIDATOS");
        }
    }

}
