package logica.estrutura_de_decisão;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a meta de faturamento anual: ");
        double metaDeFaturamentoAnual = scanner.nextDouble();
        System.out.print("Digite o ultimo faturamento real da empresa: ");
        double faturamentoReal = scanner.nextDouble();
        System.out.print("Digite a media salarial do funcionario: ");
        double mediaSalarial = scanner.nextDouble();
        boolean condicao01 = faturamentoReal >= metaDeFaturamentoAnual;
        boolean condicao02 = faturamentoReal < metaDeFaturamentoAnual;
        boolean condicao03 = faturamentoReal >= 0.8 * metaDeFaturamentoAnual;
        if (condicao01 || condicao02 && condicao03) {
            double bonusSalarial = mediaSalarial * 0.8;
            double novoSalario = mediaSalarial + bonusSalarial;
            System.out.println("O funcionario ganhará um bonus salarial.");
        } else {
            System.out.println("O funcionario, infelizmente, não teve bonus no salario.");
        }
    }
}
