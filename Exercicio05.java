public class Exercicio05 {
    public static void executar(){
        double A = Prompt.lerDecimal("Digite o primeiro número: ");
        double B = Prompt.lerDecimal("Digite o segundo número: ");

        double C = A;
        A = B; 
        B = C;

        Prompt.imprimir("A ordem das variaveis correta:  " + C + " e " + A);
        Prompt.imprimir("A ordem das variaveis Trocadas:  " + A + " e " + B);
    } 
}
