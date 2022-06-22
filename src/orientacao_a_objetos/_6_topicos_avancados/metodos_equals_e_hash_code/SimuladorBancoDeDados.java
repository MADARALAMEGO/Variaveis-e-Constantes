package com.company.metodos_equals_e_hash_code;

import java.util.HashSet;
import java.util.Set;

public class SimuladorBancoDeDados {
    public static Set<Aluno> BuscarAluno(){
        Set<Aluno> alunos = new HashSet<>();
        alunos.add(new Aluno("Roberto"));
        alunos.add(new Aluno("Giorno"));
        alunos.add(new Aluno("Marcos"));
        return alunos;
    }
}
