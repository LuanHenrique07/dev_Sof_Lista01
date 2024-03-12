public class Exercicio03 {
    public static void executar(){

        int A = Prompt.lerInteiro("Digite o primeiro número: ");
        int B = Prompt.lerInteiro("Digite o segundo número: ");

        if (A > B) {
            Prompt.imprimir("O numero " + A + " e maior que o numero " + B);
        }else if (B > A) {
            Prompt.imprimir("O numero " + B + " e maior que o numero " + A);
        }else{
            Prompt.imprimir("A sequencia de numeros e invalida");
        }
         
    } 
}
