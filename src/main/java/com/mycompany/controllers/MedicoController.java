package com.mycompany.controllers;

import com.google.gson.reflect.TypeToken;
import com.mycompany.models.MedicoModel;
import com.mycompany.persistence.JSONManager;
import java.util.List;

/**
 *
 * @author adria
 */
public class MedicoController {

    private static final String MEDICO_FILE = "medicos.json";
    AdministradorController adminController = new AdministradorController();

    private List<MedicoModel> medicos;

    public MedicoController() {
        carregarDados();
    }

    private void carregarDados() {
        this.medicos = JSONManager.carregarLista(MEDICO_FILE, new TypeToken<List<MedicoModel>>() {
        });

    }

    public void salvarDados() {
        JSONManager.salvarLista(MEDICO_FILE, medicos);
    }

    public void cadastrarMedico(MedicoModel medico, String idUser) {
        if (adminController.isAdmin(idUser)) {
            for (MedicoModel medicoModel : medicos) {
                if (medicoModel.getCrm().equals(medico.getCrm())) {
                    System.err.println("Já existe um médico cadastrado com esse CRM.");
                    return;
                }
            }
            medicos.add(medico);
            salvarDados();
            return;

        } else {
            System.err.println("O usuario não tem permição para realizar esta ação! ");
        }
    }

    public void atualizarMedico(String idAdmin, String crm, String novaEspecialidade, List<String> novaDisponibilidade) {
        if (!adminController.isAdmin(idAdmin)) {
            System.out.println("❌ ERRO: Apenas administradores podem atualizar médicos!");
            return;
        }

        for (MedicoModel medico : medicos) {
            if (medico.getCrm().equals(crm)) {
                medico.setEspecialidade(novaEspecialidade);
                // Se a lista de disponibilidade não for nula, adiciona os novos valores
                if (novaDisponibilidade != null && !novaDisponibilidade.isEmpty()) {
                    medico.getDisponibilidade().addAll(novaDisponibilidade);
                }

                salvarDados();
                System.out.println("✅ Médico atualizado com sucesso!");
                return;
            }
        }

        System.out.println("❌ ERRO: Médico não encontrado!");
    }

    public void removerMedico(String crm, String idUser) {
        if (!adminController.isAdmin(idUser)) {
            System.out.println("❌ ERRO: Apenas administradores podem remover médicos!");
            return;
        }
        medicos.removeIf(a -> a.getCrm().equals(crm));
        salvarDados();
        System.out.println("Medico removido!");
    }

    public MedicoModel buscarMedico(String crm, String idUser) {
        if (adminController.isAdmin(idUser)) {
            return medicos.stream().filter(a -> a.getCrm().equals(crm)).findFirst().orElse(null);
        }
        return null;

    }

    public MedicoModel buscarMedicoPorCRM(String crm) {

        return medicos.stream().filter(a -> a.getCrm().equals(crm)).findFirst().orElse(null);

    }

    public List<MedicoModel> listarMedicos(String idUser) {
        if (adminController.isAdmin(idUser)) {
            System.out.println("Medico: " + medicos.toString());
            return medicos;
        }
        return null;
    }

}
