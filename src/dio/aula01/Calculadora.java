package dio.aula01;

public class Calculadora {

    public static void soma(double n1, double n2) {
        double resultado = n1 + n2;
        System.out.println("O resultado da soma de " + n1 + " + " + n2 + " é igual a: " + resultado);
    }

    public static void subtracao(double n1, double n2){
        double resultado = n1 - n2;
        System.out.println("O resultado da subtração de " + n1 + " - " + n2 + " é igual a: " + resultado);
    }

    public static void multiplicacao(double n1, double n2){
        double resultado = n1 * n2;
        System.out.println("O resultado da multiplicação de " + n1 + " * " + n2 + " é igual a: " + resultado);
    }

    public static void divisao(double n1, double n2){
        double resultado = n1 / n2;
        System.out.println("O resultado da divisão de " + n1 + " / " + n2 + " é igual a: " + resultado);
    }
}
