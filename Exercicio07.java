public class Exercicio07 {
    public static void executar(){
        double numero = Prompt.lerDecimal("Digite o numero: ");

        if ( numero >= 100 && numero < 200) {
            Prompt.imprimir("O numero " + numero + " esta entre 100 e 200");
        }else{
            Prompt.imprimir("O numero " + numero + " nao esta entre 100 e 200");
        }
    }
}
