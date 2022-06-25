package com.company.collections_framework.mais_detalhes_e_frameworks.joptionane;

import javax.swing.*;

public class ExemploJOptionPane {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso");
    }
}
