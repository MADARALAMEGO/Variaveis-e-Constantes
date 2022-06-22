package com.company.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor do Produto: ");
        Double numero = scanner.nextDouble();
        DecimalFormat formatador = new DecimalFormat("RS #,##0.00");
        BigDecimal bg = new BigDecimal(numero);
        bg = bg.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
        System.out.println("----------------------------------");
        System.out.println("Calculado: " + bg);
        System.out.println("Formatado: " + formatador.format(bg));
        System.out.println("---------------------------------");
    }
}
