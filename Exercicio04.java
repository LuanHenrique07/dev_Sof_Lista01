public class Exercicio04 {
    public static void executar(){
        double A = Prompt.lerDecimal("Digite o primeiro número: ");
        double B = Prompt.lerDecimal("Digite o segundo número: ");

        double soma = A + B;
        double sub =  A - B;
        double mult = A * B;
        double div =  A / B;

        Prompt.imprimir("A soma dos numeros e: " + soma);
        Prompt.imprimir("A subtracao dos numeros e: " + sub);
        Prompt.imprimir("A multiplicacao dos numeros e: " + mult);
        Prompt.imprimir("A divisao dos numeros e: " + div);
        
    } 
}
