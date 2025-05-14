package org.example.model;

import java.util.Objects;

public abstract class Voluntario extends Federacao {
    private String nome;
    private int numero;
    private String curso;
    private int password;

    public Voluntario(String nome, int numero, String curso, int password) {
        this.nome = nome;
        this.numero = numero;
        this.curso = curso;
        this.password = password;
    }

    public int getNumero() {
        return numero;
    }

    public int getPassword() {
        return password;
    }

    public String getCurso() {
        return curso;
    }

    public String getNome() {
        return nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString() + nome + curso + numero + password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Voluntario voluntario = (Voluntario) o;
        return numero == voluntario.numero && password == voluntario.password && Objects.equals(nome, voluntario.nome) && Objects.equals(curso, voluntario.curso);
    }


}