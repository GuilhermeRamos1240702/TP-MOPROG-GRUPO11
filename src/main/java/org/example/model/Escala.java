package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Escala {
    private int[] diasAssociados;
    private int dia;
    private List<Voluntario> voluntariosescala;

    public Escala(int dia, List<Voluntario> voluntariosescala){
        this.dia=dia;
        this.diasAssociados=new int[7];
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

    public void adicionarVoluntarioEscala(Voluntario v){
        if (!voluntariosescala.contains(v)) {
            voluntariosescala.add(v);
        }
    }
}
