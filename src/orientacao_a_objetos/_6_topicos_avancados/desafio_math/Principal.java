package orientacao_a_objetos._6_topicos_avancados.desafio_math;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos Jogos deseja fazer?");
        byte numeroDeJogos = scanner.nextByte();
        System.out.println("------------------------------------------");
        if (numeroDeJogos == 1) {
        for(int i = 1; i <= 6; i++) {
            double numeroAleatorio = Math.random() * 60;
            double arredondamento = Math.round(numeroAleatorio);
            System.out.println(arredondamento);

            }
        } else if (numeroDeJogos == 2) {
            for (int i = 1; i <= 2; i++){
            for(int a = 1; a <= 6; a++) {
                double numeroAleatorio = Math.random() * 60;
                double arredondamento = Math.round(numeroAleatorio);
                System.out.println(i + "º Jogo");
                System.out.println("Numero "+ a + ":");
                System.out.println(arredondamento);
             }
            }
        } else if (numeroDeJogos == 3) {
            for (int i = 1; i <= 3; i++){
                for(int a = 1; a <= 6; a++) {
                    double numeroAleatorio = Math.random() * 60;
                    double arredondamento = Math.round(numeroAleatorio);
                    System.out.println(i + "º Jogo");
                    System.out.println("Numero " + a + ":");
                    System.out.println(arredondamento);
                }
            }
        }
    }
}
