package vetores;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String[] tarefa = new String[5] ;
        for (int i = 0; i < tarefa.length; i++) {
            System.out.print("Tarefa " + i + ": ");
            tarefa [i] = scanner.nextLine();
        }
        System.out.println("Suas tarefas são: ");
        for (int i = 0; i < tarefa.length; i++) {
            System.out.println(i +": " + tarefa[i]);
        }
        scanner.close();
    }
}