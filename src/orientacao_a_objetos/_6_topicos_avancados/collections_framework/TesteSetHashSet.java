package com.company.collections_framework;

import com.company.metodos_equals_e_hash_code.Aluno;

import java.util.HashSet;
import java.util.Set;

public class TesteSetHashSet {
    public static void main(String[] args) {
        com.company.metodos_equals_e_hash_code.Aluno a1 = new com.company.metodos_equals_e_hash_code.Aluno("Jonathan");
        com.company.metodos_equals_e_hash_code.Aluno a2 = new com.company.metodos_equals_e_hash_code.Aluno("Marcia");
        com.company.metodos_equals_e_hash_code.Aluno a3 = new com.company.metodos_equals_e_hash_code.Aluno("Jefferson");
        com.company.metodos_equals_e_hash_code.Aluno a4 = new com.company.metodos_equals_e_hash_code.Aluno("Paulo");

        Set<com.company.metodos_equals_e_hash_code.Aluno> alunos = new HashSet<>();
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);

        imprimirAlunos(alunos);
    }
    private static void imprimirAlunos (Set<com.company.metodos_equals_e_hash_code.Aluno> alunos) {
        for (Aluno a : alunos) {
            System.out.println("Nome: " + a.getNome());
        }
    }
}
