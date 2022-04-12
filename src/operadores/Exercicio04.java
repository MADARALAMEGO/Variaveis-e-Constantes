package operadores;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        byte idadeInformada = scanner.nextByte();
        System.out.print("Quantos anos você contrubuiu com a previdência: ");
        byte anosContribuidos = scanner.nextByte();
        boolean idadePraAposentar = idadeInformada >= 55;
        boolean anosTrabalhados = anosContribuidos >= 25;
        boolean podeAposentar = idadePraAposentar && anosTrabalhados;
        if (podeAposentar) {
            System.out.println("OK.Você pode aposentar.");
        } else {
            System.out.println("Desculpa, mas você é muito jovem para isso.");
        }
    }
}
