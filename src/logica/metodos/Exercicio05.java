package logica.metodos;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        imprimirEuAmoJava(i);
        scanner.close();
    }
    static void imprimirEuAmoJava (int i) {
        System.out.println("Eu amo Java \uD83D\uDE0D");
        if (i++ <= 10) {
            imprimirEuAmoJava(i);
        }
    }
}