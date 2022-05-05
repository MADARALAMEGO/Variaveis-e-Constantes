package logica.inteiracao;

import java.util.Scanner;

public class Exercicio02 {
    static final Integer DIVISOR = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numeros = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int i = 0;
        while (i < numeros.length) {
            Integer numero = numeros[i];
            i++;
            if (numero % DIVISOR == 0) {
                System.out.println(numero+": Numero divisivel por 3 \n");
            } else {
                System.out.println(numero+": Numero indivisivel por 3 \n");
            }
        }
    }
}
