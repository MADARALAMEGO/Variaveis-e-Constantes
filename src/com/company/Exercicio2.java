package com.company;

import java.util.Scanner;

public class Exercicio2 {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
    String sobrenome = scanner.nextLine();

        System.out.println("Olá " + nome + " " + sobrenome + "!");

        scanner.close();
}
