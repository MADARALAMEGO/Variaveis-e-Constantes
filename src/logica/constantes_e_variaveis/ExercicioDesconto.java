package logica.constantes_e_variaveis;

import java.util.Scanner;

public class ExercicioDesconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade de produtos: ");
        int quantidadeProduto = scanner.nextInt();

        boolean temDesconto = quantidadeProduto > 10;
        double subTotal = valorProduto * quantidadeProduto;

        if (temDesconto) {
            double Desconto = (subTotal * 10) / 100;
            subTotal = subTotal - Desconto;
            System.out.println("ULTRA DESCONTO!! O valor final do produto será: " +subTotal+"R$");
        } else {
            System.out.println("Você não possui desconto, pois não atingiu a quantidade mínima de 10 produtos. valor do produto(s): " + subTotal+ "R$");
        }
        scanner.close();
    }
}
