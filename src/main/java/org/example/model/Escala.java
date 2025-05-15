package org.example.model;

import org.example.model.Voluntario;

import java.util.ArrayList;
import java.util.List;

public class Escala {
    private int dia;
    private List<Voluntario> voluntariosescala;

    public Escala(int dia, List<Voluntario> voluntariosescala){
        this.dia=dia;
        this.voluntariosescala=new ArrayList<>();
    }

    public int getDia() {
        return dia;
    }

    public List<Voluntario> getVoluntariosescala() {
        return voluntariosescala;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setVoluntariosescala(List<Voluntario> voluntariosescala) {
        this.voluntariosescala = voluntariosescala;
    }

    public boolean adicionarVoluntario(Voluntario v) {
        if (voluntariosescala.contains(v)) {
            System.out.println("Voluntário já está nesta escala.");
            return false;
        }
        voluntariosescala.add(v);
        return true;
    }



}
