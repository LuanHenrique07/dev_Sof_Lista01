import java.util.Arrays;

public class Exercicio11 {

    public static void executar(){

        int numeros[] = new int[3];

        for (int i = 0; i < 3; i++) {
            numeros[i] = Prompt.lerInteiro("Escreva um numero inteiro: ");
        }

        Arrays.sort(numeros);


        Prompt.imprimir("Os números em ordem crescente são:");
        for (int numero : numeros) {
            Prompt.imprimir(numero + " ");
        }
    
    }
}
