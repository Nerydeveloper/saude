package com.mycompany.models;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author adria
 */
public class PacienteModel implements Serializable{
    private String nome;
    private String CPF; // (com validação)
    private int idade;
    private String telefone;
    private List<String> históricoMedicoBasico;

    public PacienteModel(String nome, String CPF, int idade, String telefone, List<String> históricoMedicoBasico) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.telefone = telefone;
        this.históricoMedicoBasico = históricoMedicoBasico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<String> getHistóricoMedicoBasico() {
        return históricoMedicoBasico;
    }

    public void setHistóricoMedicoBasico(List<String> históricoMedicoBasico) {
        this.históricoMedicoBasico = históricoMedicoBasico;
    }
      
    
}
