public class Exercicio08 {
    public static void executar(){
        double numero = Prompt.lerDecimal("Digite o numero: ");

        if (numero >= 50) {
            Prompt.imprimir("O numero " + numero + " e maior que 50");
        }else{
            Prompt.imprimir("O numero " + numero + " e menor que 50");
        }
    }
}
