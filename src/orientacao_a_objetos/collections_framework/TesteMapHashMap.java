package com.company.collections_framework;

import com.company.metodos_equals_e_hash_code.Aluno;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {
    public static void main(String[] args) {
        com.company.metodos_equals_e_hash_code.Aluno a1 = new com.company.metodos_equals_e_hash_code.Aluno("Jonathan");
        com.company.metodos_equals_e_hash_code.Aluno a2 = new com.company.metodos_equals_e_hash_code.Aluno("Marcia");
        com.company.metodos_equals_e_hash_code.Aluno a3 = new com.company.metodos_equals_e_hash_code.Aluno("Jefferson");
        com.company.metodos_equals_e_hash_code.Aluno a4 = new com.company.metodos_equals_e_hash_code.Aluno("Paulo");

        Map<String, com.company.metodos_equals_e_hash_code.Aluno> alunos = new HashMap<>();
        alunos.put("1", a1);
        alunos.put("2", a2);
        alunos.put("3", a3);
        alunos.put("4", a4);
        alunos.put("5", a4);

        imprimirAlunos(alunos);
        com.company.metodos_equals_e_hash_code.Aluno alunoRecuperado = alunos.get("3");
        System.out.println("Aluno de chave 3: " + alunoRecuperado.getNome());
    }

    private static void imprimirAlunos(Map<String , com.company.metodos_equals_e_hash_code.Aluno> alunos) {
        for (Aluno a : alunos.values()) {
            System.out.println("Nome: " + a.getNome());
        }
    }
}
