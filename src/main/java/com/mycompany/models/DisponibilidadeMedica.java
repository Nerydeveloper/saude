package com.mycompany.models;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author adria
 */
public class DisponibilidadeMedica implements Serializable{
    private static final long serialVersionUID = 1L;

    private String dia;
    private List<String> hora;

    public DisponibilidadeMedica(String dia, List<String> hora) {
        this.dia = dia;
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public List<String> getHora() {
        return hora;
    }

    public void setHora(List<String> hora) {
        this.hora = hora;
    }
    
}
