public class Exercicio18 {
    public static void executar(){
        Prompt.imprimir("Para retornarmos sua media harmonica informe: ");
        double nota1 = Prompt.lerDecimal("Informe nota 1: ");
        double nota2 = Prompt.lerDecimal("Informe nota 2: ");
        double nota3 = Prompt.lerDecimal("Informe nota 3: ");

        double media = 3/ ((1/nota1)+(1/nota2)+(1/nota3));

        Prompt.imprimir("A media harmonica de suas notas e: " + media);
    }
}
