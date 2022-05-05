package logica.metodos;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        Integer numero = scanner.nextInt();
        System.out.println("------------------------------");
        imprimirTabuada(numero, 0);
        scanner.close();
    }
    static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
        System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));
        if (++multiplicador <= 10) {
            imprimirTabuada(multiplicando, multiplicador);
        }
    }
}
