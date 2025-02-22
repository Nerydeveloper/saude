package com.mycompany.saude;

import com.mycompany.controllers.AdministradorController;
import com.mycompany.controllers.ConsultaController;
import com.mycompany.controllers.MedicoController;
import com.mycompany.controllers.PacienteController;
import com.mycompany.models.AdministradorModel;
import com.mycompany.models.ConsultaModel;
import com.mycompany.models.MedicoModel;
import com.mycompany.models.PacienteModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adria
 */
public class Saude {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        AdministradorController constrolador = new AdministradorController();
        MedicoController controllerMedico = new MedicoController();
        PacienteController controllerPaciente = new PacienteController();
        ConsultaController controladorConsulta = new ConsultaController();
        //String idUserAdmin = constrolador.buscarPeloEmail("Adrian@gmail.com").getId();
        //AdministradorModel admin01 = new AdministradorModel("Excluir esse", "fgrt5tryty@gmail.com", "Adrian1yhrtyrty23");
        //String idAdmin = constrolador.buscarPeloEmail("fgrt5tryty@gmail.com").getId();
        //constrolador.removerAdmin(idAdmin);
        //System.out.println("Admin " + constrolador.buscarPeloEmail("Adrian@gmail.com"));
        //System.out.println("Olha aqui: "+constrolador.buscarPeloEmail("Adrian@gmail.com").getEmail());

//        List<String> historicomedico = new ArrayList<>();
//        historicomedico.add("Sem registros");
//        PacienteModel paciente02 = new PacienteModel("David", "131.456.798-29", 24, "414578", historicomedico);
        //controllerPaciente.cadastrarPaciente(paciente02, "6d48f184-123c-454a-8fd2-2c2f529cb580");
//        ConsultaModel consulta00 = new ConsultaModel(paciente02, medico00, "To doente", "não tem historico");
//        controladorConsulta.cadastrarConsulta("6d48f184-123c-454a-8fd2-2c2f529cb580", consulta00);

        //CRUD MEDICO
//        List<String> disponibilidade = new ArrayList<>();
//        disponibilidade.add("Quinta");
        
        //MedicoModel medico = new MedicoModel("123456-pe", disponibilidade, "Fonodiologo", "Lucas", "lucasDaniel@gmail.com", "43256536hgrhb");
        
        //controllerMedico.cadastrarMedico(medico, constrolador.buscarPeloEmail("Adrian@gmail.com").getId()); // Cadastrar
        
        //controllerMedico.atualizarMedico(constrolador.buscarPeloEmail("Adrian@gmail.com").getId(), "13456-pe", "Nova especialidade", disponibilidade); // Atualizar
        //controllerMedico.removerMedico("1377868456-pe",constrolador.buscarPeloEmail("Adrian@gmail.com").getId()); // Remover
        
        //System.out.println("Medico: " +controllerMedico.buscarMedico("13456-pe",constrolador.buscarPeloEmail("Adrian@gmail.com").getId())); // Buscar
        //controllerMedico.listarMedicos(constrolador.buscarPeloEmail("Adrian@gmail.com").getId()); // Listar
        
//        List<String> históricoMedicoBasico = new ArrayList<>();
//        históricoMedicoBasico.add("Primeira consulta");
        // Paciente
        //PacienteModel pacienteModel = new PacienteModel("Joedson", "11412310469", 25, "879787489789", históricoMedicoBasico);
        //controllerPaciente.cadastrarPaciente(pacienteModel, constrolador.buscarPeloEmail("Adrian@gmail.com").getId()); // Cadastrar
        //controllerPaciente.atualizarPaciente(constrolador.buscarPeloEmail("Adrian@gmail.com").getId(), "11412310469", 24, "87999999999", históricoMedicoBasico); // Atualizar
        //System.out.println("Paciente buscado pelo CPF: " + controllerPaciente.buscarPaciente("11412310469").getNome()); // Buscar
        //System.out.println("Pacientes: " + controllerPaciente.listarPacientes(constrolador.buscarPeloEmail("Adrian@gmail.com").getId()));
        //controllerPaciente.removerPaciente("11412310469", constrolador.buscarPeloEmail("Adrian@gmail.com").getId());

        // Consulta
        
        //ConsultaModel consulta = new ConsultaModel(controllerPaciente.buscarPaciente("131.456.79-29"), controllerMedico.buscarMedico("13456-pe", idUserAdmin), "Sintomas de gripe", "horarioConsulta");
        //controladorConsulta.cadastrarConsulta(idUserAdmin, consulta); // Cadastrar
        //controladorConsulta.atualizarConsulta(idUserAdmin, "2", "dor de cabeça", "8 horas", true); // Atualizar
        //controladorConsulta.removerConsulta(idUserAdmin, "2"); // Remover
        //System.out.println("Consultas: " + controladorConsulta.listarConsultas().getFirst().getHorarioConsulta()); // Listar 
        //System.out.println("Consulta pega pelo ID: " +controladorConsulta.pegarConsultaPeloID("1").getHorarioConsulta());
        System.out.println("Consultas do medico: " + controladorConsulta.listarConsultas("34534534-pe"));

    }
}
