public class ResultadoEscolarV4
 {

    public static void main(String[] args) throws Exception {
        int nota = 3;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
            
        System.out.println(resultado);
    }
    
}
