package com.mycompany.models;

import java.util.List;

/**
 *
 * @author adria
 */
public class MedicoModel extends UsuarioModel {

    private String crm;
    private List<String> disponibilidade;
    private String especialidade;

    public MedicoModel(String crm, List<String> disponibilidade, String especialidade, String nome, String email, String senha) {
        super(nome, email, senha, TipoUsuario.MEDICO);
        this.crm = crm;
        this.disponibilidade = disponibilidade;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public List<String> getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(List<String> disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Médico{"
                + "CRM='" + crm + '\''
                + ", Nome='" + super.getNome() + '\''
                + ", Especialidade='" + especialidade + '\''
                + ", Disponibilidade=" + disponibilidade
                + '}';
    }

}
