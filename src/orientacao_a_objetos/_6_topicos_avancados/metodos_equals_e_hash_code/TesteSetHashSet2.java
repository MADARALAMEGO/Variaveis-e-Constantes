package com.company.metodos_equals_e_hash_code;

import java.util.Set;

public class TesteSetHashSet2 {
    public static void main(String[] args) {
        Set<Aluno> alunos = SimuladorBancoDeDados.BuscarAluno();
        Aluno alunosorteado = new Aluno("Marcos");
        if (alunos.contains(alunosorteado)) {
            System.out.println("Parabéns " + alunosorteado.getNome() + " você ganhou um brinde");
        } else {
            System.out.println("Aluno nao cadastradado no banco de dados");
        }
    }
}
