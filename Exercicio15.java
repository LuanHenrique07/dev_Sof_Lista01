public class Exercicio15 {
    public static void executar(){
        double x1 = Prompt.lerDecimal("Informe o ponto x1: ");
        double y1 = Prompt.lerInteiro("Informe o ponto y1: ");
        double x2 = Prompt.lerInteiro("Informe o ponto x2: ");
        double y2 = Prompt.lerInteiro("Informe o ponto y1: ");

        double sub1 = x2 - x1;
        double sub2 = y2 - y1;

        double dist = Math.sqrt((Math.pow(sub1,2)) + (Math.pow(sub2, 2)));

        Prompt.imprimir("A distancia desses pontos e: " + dist);
    }
}
