public class Exercicio13 {

    public static void executar(){

        double num1 = Prompt.lerDecimal("Informe o primeiro numero: ");
        double num2 = Prompt.lerDecimal("Informe o segundo numero: ");
        String carac = Prompt.lerLinha("Informe o operador: ");

        if (num2 == 0 && carac.equals("/")) {
            Prompt.imprimir("A divisao por 0 nao sera realizada");
            return;
        }

        switch (carac) {
            case "/":
                    Prompt.imprimir("A divisao de " + num1 + " por " + num2 + " e igual a " + (num1/num2));
                break;
            case "*":
                    Prompt.imprimir("A multiplicacao de " + num1 + " por " + num2 + " e igual a " + (num1*num2));
                break;
            case "+":
                    Prompt.imprimir("A soma de " + num1 + " por " + num2 + " e igual a " + (num1+num2));
                break;
            case "-":
                    Prompt.imprimir("A subtracao de " + num1 + " por " + num2 + " e igual a " + (num1-num2));
                break;
            default:
                    Prompt.imprimir("O operador e invalido");
                break;
        }
    }
}
