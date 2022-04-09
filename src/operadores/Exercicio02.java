package operadores;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do produto desejado: ");
        double valorDoProduto = scanner.nextDouble();
        byte valorDoFrete = 15;
        double produtoMaisFrete = valorDoProduto + valorDoFrete;
        boolean casoPreciseAcrecsentarFrete = valorDoProduto <=100;
        boolean valorSemFrete = valorDoProduto >= 100;
        boolean seONumeroForNegativo = valorDoProduto < 0;
        if (casoPreciseAcrecsentarFrete) {
            System.out.println("O valor final do produto é "+produtoMaisFrete+"R$" );
        } else if (valorSemFrete){
            System.out.println("O valor final do produto é "+valorDoProduto+"R$");
        } else if (seONumeroForNegativo) {
            System.out.println("VALOR INVÁLIDO! A loja não pode pagar o senhor(a).");
        }
    }
}
