package leitura_e_escrita_de_dados_em_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> linhas = new ArrayList<>();
        System.out.println("TAREFAS A FAZER: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Tarefas " + i + ": ");
            String tarefas = scanner.nextLine();
            linhas.add(tarefas);
        }
            Path arquivo = Paths.get("C:\\Users\\Administrador\\Desktop\\arquivo.txt");
            Files.write(arquivo, linhas);
            scanner.close();
            System.out.println("Tarefas Anotadas.");

        }
    }