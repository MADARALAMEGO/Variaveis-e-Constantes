package com.company.collections_framework.mais_detalhes_e_frameworks.joptionane;

import javax.swing.*;

public class ExemploJOptionPane4 {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Object[] possibilidades = {"Masculino","Feminino"};
        String sexo = (String) JOptionPane.showInputDialog(null, "selecione o sexo:", "SENAI", JOptionPane.PLAIN_MESSAGE,
                    null, possibilidades, possibilidades[0]);
        System.out.printf("Sexo selecionado: " + sexo + "\n");
        String nome = (String) JOptionPane.showInputDialog(null, "Digite seu nome", "SENAI",
                JOptionPane.PLAIN_MESSAGE, null, null, null);
        System.out.printf("Seu nome é: " + nome);
    }
}
