package constantes_e_variaveis;

import java.util.Scanner;

public class Constantes {
    static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Idade: ");
        Integer idade = scanner.nextInt();

        boolean podeTirarCarteira = idade >=IDADE_MINIMA_PARA_TIRAR_CARTEIRA;

        if(podeTirarCarteira) {
            System.out.println("SIM!Ele(a) pode tirar a carteira. ");
        } else {
            System.out.println("NAO!Ele(a) não pode tirar carteira. ");
        }
        scanner.close();
    }
}
