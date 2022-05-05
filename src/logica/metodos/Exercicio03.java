package logica.metodos;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        imprimir("Digite um numero: ");
        double primeiroValor = scanner.nextDouble();
        imprimir("Digite outro numero: ");
        double segundoValor = scanner.nextDouble();
        imprimirTraco();
        System.out.println(" ");
        System.out.println(" [1] Soma \n [2] Subtração");
        imprimir("Escolha a operação: ");
        byte operacaoEscolida = scanner.nextByte();
        imprimirTraco();
        System.out.println("  ");
        if (operacaoEscolida == 1 ) {
            double soma = primeiroValor + segundoValor;
            imprimir("O valor da soma é "+ soma);
        } else if (operacaoEscolida == 2 ) {
            double subtracao = primeiroValor - segundoValor;
            imprimir("O valor da subtração é "+ subtracao);
        } else if (operacaoEscolida != 1 && operacaoEscolida != 2) {
            imprimir("Operação Inválida!");
        }
    }
    static void imprimirTraco() {
        imprimir("----------------------------------------------");
    }
    static void imprimir(String texto) {
        System.out.print(texto);
    }
}
