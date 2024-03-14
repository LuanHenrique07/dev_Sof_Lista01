public class Exercicio17 {
    public static void executar(){
        double nota1 = Prompt.lerDecimal("Informe a nota 1: ");
        int peso1 = Prompt.lerInteiro("Informe peso nota 1: ");
        double nota2 = Prompt.lerDecimal("Informe a nota 2: ");
        int peso2 = Prompt.lerInteiro("Informe peso nota 2: ");
        double nota3 = Prompt.lerDecimal("Informe a nota 3: ");
        int peso3 = Prompt.lerInteiro("Informe peso nota 3: ");

        double mediapond = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1 + peso2 + peso3);

        Prompt.imprimir("A media ponderada dessas notas e: " + mediapond);
    }
}
