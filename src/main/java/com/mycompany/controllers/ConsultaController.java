package com.mycompany.controllers;

import com.google.gson.reflect.TypeToken;
import com.mycompany.models.ConsultaModel;
import com.mycompany.models.MedicoModel;
import com.mycompany.models.PacienteModel;
import com.mycompany.persistence.JSONManager;
import java.util.List;

/**
 *
 * @author adria
 */
public class ConsultaController {

    private static final String CONSULTAS_FILE = "consultas.json";
    AdministradorController adminController = new AdministradorController();

    private List<ConsultaModel> consultas;

    public ConsultaController() {
        carregarDados();
    }

    private void carregarDados() {
        this.consultas = JSONManager.carregarLista(CONSULTAS_FILE, new TypeToken<List<ConsultaModel>>() {
        });
    }

    private void salvarDados() {
        JSONManager.salvarLista(CONSULTAS_FILE, consultas);
    }

    public void cadastrarConsulta(String idUser, ConsultaModel consulta) {
        if (adminController.isAdmin(idUser)) {
            // Verifica se já existe uma consulta nesse horário
            boolean horarioOcupado = consultas.stream()
                    .anyMatch(a -> a.getHorarioConsulta().equals(consulta.getHorarioConsulta()) && a.getStatus());

            if (horarioOcupado) {
                System.out.println("ERRO: Já existe uma consulta mascada para esse horário");
                return;
            }

            consultas.add(consulta);
            salvarDados();
            System.out.println("Consulta cadastrada com sucesso");

        } else {
            System.out.println("❌ ERRO: Apenas administradores podem cadastrar consultas!");

        }

    }

    public void atualizarConsulta(String idUser, String idConsulta, String motivoConsulta, String horarioConsulta, boolean status) {
        if (!adminController.isAdmin(idUser)) {
            System.out.println("❌ ERRO: Apenas administradores podem atualizar consultas!");
            return;
        }
        for (ConsultaModel consulta : consultas) {
            if (consulta.getId().equals(idConsulta)) {
                // Verifica se já existe uma consulta nesse horário
                boolean horarioOcupado = consultas.stream()
                        .anyMatch(a -> a.getHorarioConsulta().equals(horarioConsulta));
                if (horarioOcupado) {
                    System.out.println("ERRO: Já existe uma consulta mascada para esse horário");
                    return;
                }
                consulta.setHorarioConsulta(horarioConsulta);
                consulta.setStatus(status);
                consulta.setMotivoConsulta(motivoConsulta);
                salvarDados();
                System.out.println("Consulta atualizada com sucesso!");
                return;
            }

        }
        // Caso a consulta não seja encontrada
        System.out.println("ERRO: Consulta não encontrada");

    }

    public void removerConsulta(String idUser, String idConsulta) {
        if (!adminController.isAdmin(idUser)) {
            System.out.println("❌ ERRO: Apenas administradores podem remover consultas!");
            return;
        }
        consultas.removeIf(a -> a.getId().equals(idConsulta));
        salvarDados();
    }

    public ConsultaModel pegarConsultaPeloID(String id) {
        return consultas.stream().filter(a -> a.getId().equals(id)).findFirst().orElse(null);
    }

    public List<ConsultaModel> listarConsultas() {
        return consultas;
    }

}
