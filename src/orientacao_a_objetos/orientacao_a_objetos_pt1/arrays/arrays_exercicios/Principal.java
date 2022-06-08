package orientacao_a_objetos.orientacao_a_objetos_pt1.arrays.arrays_exercicios;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos produtos?");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine();
        Estoque estoque = new Estoque();
        estoque.produtos = new Produto[quantidadeProdutos];
        for (int i = 0; i < estoque.produtos.length; i++) {
            estoque.produtos[i] = new Produto();
            System.out.println("\nProduto " + i);
            System.out.println("--------------");
            System.out.println("Descricao");
            estoque.produtos[i].descricao = scanner.nextLine();
            System.out.println("Quantidade de itens:");
            estoque.produtos[i].quantidade = scanner.nextInt();
            scanner.nextLine();
        }
        estoque.listarProdutos();
    }
}