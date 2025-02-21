package views.administrador;

import com.mycompany.controllers.AdministradorController;
import com.mycompany.controllers.ConsultaController;
import com.mycompany.controllers.MedicoController;
import com.mycompany.controllers.PacienteController;
import com.mycompany.models.ConsultaModel;
import com.mycompany.models.MedicoModel;
import com.mycompany.models.PacienteModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.UUID;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class JanelaConsultas extends javax.swing.JFrame {

    private UUID idConsulta;

    /**
     * Creates new form DashboardAdministrador
     */
    public JanelaConsultas() {
        initComponents();
        Display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButtonMedico = new javax.swing.JButton();
        jButtonPacientes = new javax.swing.JButton();
        jButtonRelatorios = new javax.swing.JButton();
        jPanelExibirConteudos = new javax.swing.JPanel();
        jButtonCadastrarConsulta = new javax.swing.JButton();
        jButtonExcluirConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxMedico = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxPaciente = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMotivoConsulta = new javax.swing.JTextArea();
        jComboBoxDataHora = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButtonAtualizarConsulta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setForeground(new java.awt.Color(0, 51, 51));
        jButton4.setText("CONSULTAS");

        jButtonMedico.setBackground(new java.awt.Color(204, 255, 255));
        jButtonMedico.setForeground(new java.awt.Color(0, 51, 51));
        jButtonMedico.setText("MEDICOS");
        jButtonMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMedicoMouseClicked(evt);
            }
        });

        jButtonPacientes.setBackground(new java.awt.Color(204, 255, 255));
        jButtonPacientes.setForeground(new java.awt.Color(0, 51, 51));
        jButtonPacientes.setText("PACIENTES");
        jButtonPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPacientesMouseClicked(evt);
            }
        });

        jButtonRelatorios.setBackground(new java.awt.Color(204, 255, 255));
        jButtonRelatorios.setForeground(new java.awt.Color(0, 51, 51));
        jButtonRelatorios.setText("RELATORIOS");

        jButtonCadastrarConsulta.setText("CADASTRAR");
        jButtonCadastrarConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCadastrarConsultaMouseClicked(evt);
            }
        });

        jButtonExcluirConsulta.setText("EXCLUIR");
        jButtonExcluirConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonExcluirConsultaMouseClicked(evt);
            }
        });

        jTableConsultas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = jTableConsultas.rowAtPoint(e.getPoint());
                if (row >= 0) {
                    // Supondo que a coluna que contém o ID é a primeira (índice 0)
                    Object value = jTableConsultas.getValueAt(row, 0); // Ajuste o índice se necessário
                    if (value instanceof UUID) {
                        idConsulta = (UUID) value; // Captura como UUID
                        System.out.println("ID da consulta capturado: " + idConsulta); // Verificação do ID capturado
                    } else {
                        System.err.println("O valor não é um UUID: " + value);
                    }
                }
            }
        });
        jTableConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MOTIVO", "PACIENTE", "MEDICO", "HORARIO DE ATENDIMENTO", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableConsultas);

        jLabel1.setText("MOTIVO DA CONSULTA");

        jLabel2.setText("MEDICO");

        jComboBoxMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        jLabel3.setText("PACIENTE");

        jComboBoxPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        jTextAreaMotivoConsulta.setColumns(20);
        jTextAreaMotivoConsulta.setRows(5);
        jScrollPane2.setViewportView(jTextAreaMotivoConsulta);

        jComboBoxDataHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        jLabel4.setText("DATA E HORA");

        jButtonAtualizarConsulta.setText("ATUALIZAR");
        jButtonAtualizarConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAtualizarConsultaMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("CONSULTAS CADASTRADAS NO SISTEMA");

        javax.swing.GroupLayout jPanelExibirConteudosLayout = new javax.swing.GroupLayout(jPanelExibirConteudos);
        jPanelExibirConteudos.setLayout(jPanelExibirConteudosLayout);
        jPanelExibirConteudosLayout.setHorizontalGroup(
            jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExibirConteudosLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelExibirConteudosLayout.createSequentialGroup()
                            .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jComboBoxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jComboBoxDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonAtualizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelExibirConteudosLayout.createSequentialGroup()
                                    .addComponent(jButtonCadastrarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonExcluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanelExibirConteudosLayout.setVerticalGroup(
            jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExibirConteudosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelExibirConteudosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelExibirConteudosLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelExibirConteudosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelExibirConteudosLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCadastrarConsulta)
                        .addComponent(jButtonExcluirConsulta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAtualizarConsulta)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelExibirConteudos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(422, Short.MAX_VALUE))
            .addComponent(jPanelExibirConteudos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMedicoMouseClicked
        // TODO add your handling code here:
        JanelaMedicos janelaMedicos = new JanelaMedicos();
        janelaMedicos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonMedicoMouseClicked

    private void jButtonPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPacientesMouseClicked
        // TODO add your handling code here:
        JanelaPacientes janelaPacientes = new JanelaPacientes();
        janelaPacientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonPacientesMouseClicked

    private void jButtonCadastrarConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarConsultaMouseClicked
        // TODO add your handling code here:

        ConsultaController consultaController = new ConsultaController();
        AdministradorController administradorController = new AdministradorController();
        // Obtendo o paciente selecionado
        PacienteModel pacienteSelecionado = (PacienteModel) jComboBoxPaciente.getSelectedItem();

        // Obtendo o médico selecionado
        MedicoModel medicoSelecionado = (MedicoModel) jComboBoxMedico.getSelectedItem();

        // Obtendo o motivo da consulta
        String motivoConsulta = jTextAreaMotivoConsulta.getText();

        // Obtendo a data e hora selecionada
        String dataHoraSelecionada = (String) jComboBoxDataHora.getSelectedItem();

        // Criando a consulta com os objetos selecionados
        ConsultaModel consulta = new ConsultaModel(pacienteSelecionado, medicoSelecionado, motivoConsulta, dataHoraSelecionada);

        consultaController.cadastrarConsulta(administradorController.buscarPeloEmail("JoedsonAdmin@gmail.com").getId(), consulta);

    }//GEN-LAST:event_jButtonCadastrarConsultaMouseClicked


    private void jButtonAtualizarConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAtualizarConsultaMouseClicked

        // Obtendo o motivo da consulta
        String motivoConsulta = jTextAreaMotivoConsulta.getText().trim();
        // Obtendo a data e hora selecionada
        String dataHoraSelecionada = (String) jComboBoxDataHora.getSelectedItem();

        // Verificando se os campos estão preenchidos e se uma linha foi selecionada
        if (motivoConsulta.isEmpty() || dataHoraSelecionada == null || idConsulta == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione uma consulta e preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ConsultaController controllerConsulta = new ConsultaController();
        AdministradorController controllerAdmin = new AdministradorController();
        System.out.println("Id da consulta selecionada: " + idConsulta);

        try {
            // Obtendo o ID do administrador
            String adminId = controllerAdmin.buscarPeloEmail("JoedsonAdmin@gmail.com").getId();

            // Atualizando a consulta
            controllerConsulta.atualizarConsulta(adminId, idConsulta, motivoConsulta, dataHoraSelecionada, rootPaneCheckingEnabled);

            // Feedback de sucesso
            JOptionPane.showMessageDialog(this, "Consulta atualizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            // Tratando possíveis exceções
            JOptionPane.showMessageDialog(this, "Erro ao atualizar consulta: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonAtualizarConsultaMouseClicked

    private void jButtonExcluirConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExcluirConsultaMouseClicked
        // TODO add your handling code here:
 
        if (idConsulta != null) {
            ConsultaController consultaController = new ConsultaController();
            AdministradorController adminController = new AdministradorController();
            String idAdmin = adminController.buscarPeloEmail("JoedsonAdmin@gmail.com").getId();

            System.out.println("Id da consulta: " + idConsulta.toString());
            consultaController.removerConsulta(idAdmin, idConsulta);

            // Aqui você pode adicionar lógica para atualizar a interface, como reloading a tabela
            System.out.println("Consulta excluída com sucesso!");
        } else {
            System.out.println("❌ ERRO: Nenhum ID de consulta selecionado!" + idConsulta);
        }

    }//GEN-LAST:event_jButtonExcluirConsultaMouseClicked

    private void Display() {
        AdministradorController administradorController = new AdministradorController();
        ConsultaController consultaController = new ConsultaController();
        PacienteController pacienteControler = new PacienteController();
        MedicoController medicoController = new MedicoController();

        List<ConsultaModel> consultas = consultaController.listarConsultas(); // Carrega a lista de consultas
        List<PacienteModel> pacientes = pacienteControler.listarPacientes(administradorController.buscarPeloEmail("JoedsonAdmin@gmail.com").getId()); // Carrega a lista de pacientes
        List<MedicoModel> medicos = medicoController.listarMedicos(administradorController.buscarPeloEmail("JoedsonAdmin@gmail.com").getId()); // Carrega a lista de medicos
        // Limpa a tabela antes de adicionar novos dados
        DefaultTableModel model = (DefaultTableModel) jTableConsultas.getModel();
        model.setRowCount(0);

        // Adiciona os dados na tabela
        for (ConsultaModel consulta : consultas) {
            model.addRow(new Object[]{
                consulta.getId(),
                consulta.getMotivoConsulta(),
                consulta.getPaciente().getNome(),
                consulta.getMedico().getNome(),
                consulta.getHorarioConsulta(),
                consulta.getStatus()

            });
        }

        DefaultComboBoxModel<PacienteModel> optionsPaciente = (DefaultComboBoxModel) jComboBoxPaciente.getModel();
        for (PacienteModel paciente : pacientes) {
            optionsPaciente.addElement(paciente);

        }
        DefaultComboBoxModel<MedicoModel> optionsMedico = (DefaultComboBoxModel) jComboBoxMedico.getModel();
        for (MedicoModel medico : medicos) {
            optionsMedico.addElement(medico);
        }

// Adicionando um listener ao jComboBoxMedico
        jComboBoxMedico.addActionListener(e -> {
            MedicoModel medicoSelecionado = (MedicoModel) jComboBoxMedico.getSelectedItem();

            // Atualizando o JComboBox de disponibilidades
            DefaultComboBoxModel<String> optionsDisponibilidadeMedica = new DefaultComboBoxModel<>();
            if (medicoSelecionado != null) { // Verifica se um médico foi selecionado
                for (String disponibilidade : medicoSelecionado.getDisponibilidade()) {
                    optionsDisponibilidadeMedica.addElement(disponibilidade);
                }
            }
            jComboBoxDataHora.setModel(optionsDisponibilidadeMedica);
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAtualizarConsulta;
    private javax.swing.JButton jButtonCadastrarConsulta;
    private javax.swing.JButton jButtonExcluirConsulta;
    private javax.swing.JButton jButtonMedico;
    private javax.swing.JButton jButtonPacientes;
    private javax.swing.JButton jButtonRelatorios;
    private javax.swing.JComboBox<String> jComboBoxDataHora;
    private javax.swing.JComboBox<String> jComboBoxMedico;
    private javax.swing.JComboBox<String> jComboBoxPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelExibirConteudos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableConsultas;
    private javax.swing.JTextArea jTextAreaMotivoConsulta;
    // End of variables declaration//GEN-END:variables
}
