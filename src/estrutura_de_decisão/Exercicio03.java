package estrutura_de_decisão;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[1] segunda ");
        System.out.println("[2] terça ");
        System.out.println("[3] quarta ");
        System.out.println("[4] quinta ");
        System.out.println("[5] sexta ");
        System.out.println("[6] sabado ");
        System.out.println("[7] domingo ");
        System.out.print("Digite um numero referente a um dia da semana: ");
        Integer diaDaSemana = scanner.nextInt();

        Double semana = 0.0;


        switch(diaDaSemana) {
            case 1:
                semana = 0.0;
                System.out.println("Segunda-feira");
                break;
            case 2:
                semana = 0.0;
                System.out.println("Terça-feira");
                break;
            case 3:
                semana = 0.0;
                System.out.println("Quarta-feira");
                break;
            case 4:
                semana = 0.0;
                System.out.println("Quinta-feira");
                break;
            case 5:
                semana = 0.0;
                System.out.println("Sexta-feira");
                break;
            case 6:
                semana = 0.0;
                System.out.println("Sabado");
                break;
            case 7:
                semana = 0.0;
                System.out.println("Domingo");
                break;
            default:
                System.err.println("ERROR!DIGITE UM DIA CORRESPONDENTE!");
                System.exit(1);
        }

    }
}
