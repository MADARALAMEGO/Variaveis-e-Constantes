package com.company.metodos_equals_e_hash_code;

import java.util.Objects;

public class Aluno {
    private String nome;
    private int Idade;


    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno that = (Aluno) o;
        return Idade == that.Idade && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, Idade);
    }
}

