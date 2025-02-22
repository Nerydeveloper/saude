package com.mycompany.models;

import java.io.Serializable;
import java.util.UUID;


public class ConsultaModel implements Serializable {

    private UUID id;
    private PacienteModel paciente;
    private MedicoModel medico;
    private String motivoConsulta;
    private String horarioConsulta;
    private boolean status = true;

    public ConsultaModel(PacienteModel paciente, MedicoModel medico, String motivoConsulta, String horarioConsulta) {
        this.id = UUID.randomUUID(); // Gera um UUID único
        this.paciente = paciente;
        this.medico = medico;
        this.motivoConsulta = motivoConsulta;
        this.horarioConsulta = horarioConsulta;
    }

    public UUID getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public PacienteModel getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteModel paciente) {
        this.paciente = paciente;
    }

    public MedicoModel getMedico() {
        return medico;
    }

    public void setMedico(MedicoModel medico) {
        this.medico = medico;
    }

    public String getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(String horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }
    

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void toggleStatus() {
        this.status = !this.status;
    }

}
