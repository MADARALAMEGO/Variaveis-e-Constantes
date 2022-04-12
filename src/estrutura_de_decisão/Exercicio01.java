package estrutura_de_decisão;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da prova de matemática: ");
        double notaDaProvaDeMatematica = scanner.nextDouble();
        System.out.print("Digite a nota da prova de português: ");
        double notaDaProvaDePortugues = scanner.nextDouble();
        double notaMaxima = notaDaProvaDeMatematica + notaDaProvaDePortugues;
        System.out.println("Nota Final: " + notaMaxima);
        Boolean minimoMatematicaParaPassar = notaDaProvaDeMatematica >= 60;
        Boolean maximoMatematicaParaPassar = notaDaProvaDeMatematica <= 100;
        Boolean minimoPortuguesParaPassar = notaDaProvaDePortugues >= 60;
        Boolean maximoPortuguesParaPassar = notaDaProvaDePortugues <= 100;
        Boolean notaDeMatematica = minimoMatematicaParaPassar && maximoMatematicaParaPassar;
        Boolean notaDePortugues = minimoPortuguesParaPassar && maximoPortuguesParaPassar;
        Boolean notaParaSerAprovado = notaDaProvaDeMatematica + notaDaProvaDePortugues >= 200;
        if (notaDeMatematica && notaDePortugues && notaParaSerAprovado) {
            System.out.println("Parabens, você foi aprovado.");
        } else {
            System.out.println("Infelizmente não foi dessa vez.");
        }
    }
}