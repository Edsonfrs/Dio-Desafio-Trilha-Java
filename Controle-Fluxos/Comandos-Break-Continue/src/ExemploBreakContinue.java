public class ExemploBreakContinue {
    public static void main(String[] args) throws Exception {
        
        for (int numero = 1; numero <= 10; numero++) {
            if (numero == 5) {
                break;
            }
            System.out.println(numero);
            
        }
    }
}
