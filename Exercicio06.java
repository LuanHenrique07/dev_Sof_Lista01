public class Exercicio06 {
    public static void executar(){
        double celcius = Prompt.lerDecimal("Digite a temperatura em Celcius: ");

        double F = (9 * celcius + 160) / 5;

        Prompt.imprimir("A temperatura em Fahrenheit e: " + F);
    } 
}
