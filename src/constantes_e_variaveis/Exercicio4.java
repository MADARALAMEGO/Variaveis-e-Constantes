package constantes_e_variaveis;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma idade: ");
        byte idade = scanner.nextByte();

        Boolean podeTirarCarteira = idade >= 18;

        System.out.println(" Pode tirar a cateira? ");

        if (podeTirarCarteira) {
            System.out.println("Sim! Ele(a) pode tirar a carteira.");
        } else {
            System.out.println("Nao! Ele(a) não pode tirar a carteira.");
        }
    }
}
