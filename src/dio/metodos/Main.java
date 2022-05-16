package dio.metodos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1;
        double n2;
        int hora;

        // Calculadora
        System.out.println("=== Exercício calculadora ===");
        System.out.println("Digite o primeiro valor: ");
        n1 = input.nextDouble();
        System.out.println("Digite o segundo valor: ");
        n2 = input.nextDouble();
        Calculadora.soma(n1, n2);
        Calculadora.subtracao(n1, n2);
        Calculadora.multiplicacao(n1, n2);
        Calculadora.divisao(n1, n2);
        System.out.println();


        // Mensagem
        System.out.println("=== Exercício mensagem ===");
        System.out.println("Digite a hora [entre 0 e 23]: ");
        hora = input.nextInt();
        Mensagem.obterMensagem(hora);
        System.out.println();

        // Empréstimo
        System.out.println("=== Exercício empréstimo ===");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
