public class Exercicio20 {
    public static void executar(){
        double tempo = Prompt.lerDecimal("Informe o tempo da viagem: ");
        double vel = Prompt.lerDecimal("Informe a velocidade medida em km/h: ");

        double dist = tempo * vel;
        double litros = dist / 12;

        Prompt.imprimir("A quantidade de Litros gastos na viagem e " + litros);
    }
}
