package com.company.collections_framework.mais_detalhes_e_frameworks.joptionane;

import javax.swing.*;

public class ExemploJOptionPane3 {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Object[] opcoes = {"Sim","Não","Sim, com e-mail"};
        int opcao = JOptionPane.showOptionDialog(null, "você gostaria de finalizar o cadastro?",
                "confirmação", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[2] );

        System.out.println("Opção selecionada: " + opcao);
        if (opcao == 0 ) {
            //...
        }
    }
}
