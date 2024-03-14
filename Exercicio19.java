public class Exercicio19 {
    public static void executar(){
        Prompt.imprimir("Para calcular o volume do cilindro nos informe: ");
        double raio = Prompt.lerDecimal("Informe raio do cilindro: ");
        double altura = Prompt.lerDecimal("Informe altura do cilindro: ");  

        double volume = (3.14 * Math.pow(raio, 2) * altura);

        Prompt.imprimir("O volume do cilindro e: " + volume);
    }
}
