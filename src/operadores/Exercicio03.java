package operadores;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor da conta de luz: ");
        double gastoDaContaDeLuz = scanner.nextDouble();
        System.out.print("Informe o valor da conta de água: ");
        double gastoDaContaDeAgua = scanner.nextDouble();
        System.out.print("Informe o valor da conta de telefone: ");
        double gastoDaContaDeTelefone = scanner.nextDouble();
        System.out.print("Informe o valor gasto com a escola do filho: ");
        double gastoDaEscolaDoFilho = scanner.nextDouble();
        System.out.print("Informe o valor da fartura do cartão: ");
        double gastoDaFarturaDoCartao = scanner.nextDouble();
        System.out.print("Informe o valor gasto com supermercado: ");
        double gastoComSupermercado = scanner.nextDouble();
        double valorGastoTotalNoMes = gastoDaContaDeLuz += gastoDaContaDeAgua + gastoDaContaDeTelefone + gastoDaEscolaDoFilho + gastoDaFarturaDoCartao +gastoComSupermercado ;
        System.out.println("O gasto total foi de "+valorGastoTotalNoMes+"R$");
        scanner.close();
    }
}
