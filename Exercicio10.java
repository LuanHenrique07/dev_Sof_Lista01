public class Exercicio10 {
    public static void executar(){
       int A =  Prompt.lerInteiro("Escreva um numero de 1 a 5: ");

        if (A == 1) {
            Prompt.imprimir("Os numero por extenso e UM");
        }else if (A == 2 ) {
            Prompt.imprimir("Os numero por extenso e DOIS");
        }else if (A == 3 ) {
            Prompt.imprimir("Os numero por extenso e TRES");
        }else if (A == 4) {
            Prompt.imprimir("Os numero por extenso e QUATRO");
        }else if (A == 5 ) {
            Prompt.imprimir("Os numero por extenso e CINCO");
        }else{
            Prompt.imprimir("Número inválido!");
        }
    }
}