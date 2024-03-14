public class Exercicio16 {
    public static void executar(){
        double not1 = Prompt.lerDecimal("Informe a nota 1: ");
        double not2 = Prompt.lerDecimal("Informe a nota 2: ");
        double not3 = Prompt.lerDecimal("Informe a nota 3: ");

        double media = ((not1+not2+not3)/ 3);

        Prompt.imprimir("A media das suas notas e: " + media);
    }   
}
