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

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Voluntario)) return false;
        Voluntario other = (Voluntario) obj;
        return this.numero == other.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

}