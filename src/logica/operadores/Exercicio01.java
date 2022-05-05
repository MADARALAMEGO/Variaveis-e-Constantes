package logica.operadores;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Digite um segundo numero: ");
        double segundoNumero = scanner.nextDouble();
        System.out.println("__OPERAÇÕES__");
        System.out.println("[1] Adição ");
        System.out.println("[2] Subtração ");
        System.out.println("[3] multiplicação ");
        System.out.println("[4] divisão ");
        System.out.print("Escolha a operação desejada: ");
        byte operacaoDesejada = scanner.nextByte();
        if (operacaoDesejada == 1 ){
            double somaDosNumeros = primeiroNumero + segundoNumero;
            System.out.println("Soma: "+ somaDosNumeros);
        } else if (operacaoDesejada == 2) {
            double subtracacaoDosNumeros = primeiroNumero - segundoNumero;
            System.out.println("Subtração: "+ subtracacaoDosNumeros);
        } else if (operacaoDesejada == 3) {
            double multiplicacaoDosNumeros = primeiroNumero * segundoNumero;
            System.out.println("Multiplicação: "+ multiplicacaoDosNumeros);
        } else if (operacaoDesejada == 4) {
            double divisaoDosNumeros = primeiroNumero / segundoNumero;
            System.out.println("Divisão: "+ divisaoDosNumeros);
        }
        scanner.close();
    }
}