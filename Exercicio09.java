public class Exercicio09 {
    public static void executar(){
        double A = Prompt.lerDecimal("Digite o primeiro numero: ");
        double B= Prompt.lerDecimal("Digite o segundo numero: "); 

        if (A == B) {
            Prompt.imprimir("Os numeros sao identicos");
        }else{
            Prompt.imprimir("Os numeros sao diferentes");
        }
    }
}
