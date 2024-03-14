public class Exercicio14 {

    public static void executar(){
        Prompt.imprimir("Para fazermos a PA(an = a1 + (n – 1) * r ), informe os seguintes numeros");
        int a1 = Prompt.lerInteiro("Informe o numero correspondente a a1: ");
        int n = Prompt.lerInteiro("Informe o numero correspondente a n: ");
        int r = Prompt.lerInteiro("Informe o numero correspondente a r: ");

        int An = (a1 + (n - 1) * r);

        Prompt.imprimir("O n-esimo numero dessa PA e : " + An);
    }
}
