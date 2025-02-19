package com.mycompany.controllers;

import com.google.gson.reflect.TypeToken;
import com.mycompany.models.PacienteModel;
import com.mycompany.persistence.JSONManager;
import com.mycompany.util.ValidadorCPF;
import java.util.List;

/**
 *
 * @author adria
 */
public class PacienteController {

    private static final String PACIENTE_FILE = "pacientes.json";
    AdministradorController adminController = new AdministradorController();

    private List<PacienteModel> pacientes;

    public PacienteController() {
        carregarDados();
    }

    private void carregarDados() {
        this.pacientes = JSONManager.carregarLista(PACIENTE_FILE, new TypeToken<List<PacienteModel>>() {
        });
    }

    public void salvarDados() {
        JSONManager.salvarLista(PACIENTE_FILE, pacientes);
    }

    public void cadastrarPaciente(PacienteModel paciente, String idUser) {
        if (adminController.isAdmin(idUser)) {
            
            if (!ValidadorCPF.isValidCPF(paciente.getCPF())) {
                System.out.println("CPF invalido.");
                return;
            }
            pacientes.add(paciente);
            salvarDados();
        } else {
            System.err.println("O usuario não tem permição para realizar esta ação! ");
        }
    }

    public void atualizarPaciente(String idUser, String CPF, int idade, String telefone, List<String> históricoMedicoBasico) {
        if (adminController.isAdmin(idUser)) {
            for (PacienteModel paciente : pacientes) {
                if (paciente.getCPF().equals(CPF)) {
                    paciente.setIdade(idade);
                    paciente.setTelefone(telefone);
                    paciente.setHistóricoMedicoBasico(históricoMedicoBasico);
                    salvarDados();

                }
            }
        } else {
            System.err.println("O usuario não tem permição para realizar esta ação! ");
        }
    }

    public void removerPaciente(String CPF, String idUser) {
        if (adminController.isAdmin(idUser)) {
            pacientes.removeIf(a -> a.getCPF().equals(CPF));
            salvarDados();
        }
    }

    public PacienteModel buscarPaciente(String cpf) {
        return pacientes.stream().filter(a -> a.getCPF().equals(cpf)).findFirst().orElse(null);
    }

    public List<PacienteModel> listarPacientes(String idUser) {
        if (adminController.isAdmin(idUser)) {
            return pacientes;
        }
        return null;
    }
}
