/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.administrador;

import com.mycompany.controllers.AdministradorController;
import com.mycompany.controllers.MedicoController;
import com.mycompany.models.AdministradorModel;
import com.mycompany.models.MedicoModel;
import com.mycompany.util.SessaoUsuario;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class JanelaMedicos extends javax.swing.JFrame {
    private String crmMedico;
    AdministradorModel usuario = SessaoUsuario.getUsuario();
    /**
     * Creates new form DashboardAdministrador
     */
    public JanelaMedicos() {
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
        jButtonConsultas = new javax.swing.JButton();
        jButtonMedicos = new javax.swing.JButton();
        jButtonPacientes = new javax.swing.JButton();
        jButtonRelatorios = new javax.swing.JButton();
        jPanelExibirConteudos = new javax.swing.JPanel();
        jButtonCadastrarMedico = new javax.swing.JButton();
        jButtonExcluirMedico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedicos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxListaHorarios = new javax.swing.JComboBox<>();
        jButtonAtualizarMedico = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNomeMedico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCRMMedico = new javax.swing.JTextField();
        jTextFieldEmailMedico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldSenhaMedico = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxEspecialidades = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaVerHorariosSelecionados = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jButtonAdicionarHorario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jButtonConsultas.setBackground(new java.awt.Color(204, 255, 255));
        jButtonConsultas.setForeground(new java.awt.Color(0, 51, 51));
        jButtonConsultas.setText("CONSULTAS");
        jButtonConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConsultasMouseClicked(evt);
            }
        });

        jButtonMedicos.setBackground(new java.awt.Color(204, 255, 255));
        jButtonMedicos.setForeground(new java.awt.Color(0, 51, 51));
        jButtonMedicos.setText("MEDICOS");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButtonConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonCadastrarMedico.setText("CADASTRAR");
        jButtonCadastrarMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCadastrarMedicoMouseClicked(evt);
            }
        });

        jButtonExcluirMedico.setText("EXCLUIR");
        jButtonExcluirMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonExcluirMedicoMouseClicked(evt);
            }
        });

        jTableMedicos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = jTableMedicos.rowAtPoint(e.getPoint());
                if (row >= 0) {
                    // Supondo que a coluna que contém o ID é a primeira (índice 0)
                    Object value = jTableMedicos.getValueAt(row, 2); // Ajuste o índice se necessário
                    if (value instanceof String) {
                        crmMedico = (String) value; // Captura como String
                        System.out.println("ID do Medico capturado: " + crmMedico); // Verificação do CRM capturado
                    } else {
                        System.err.println("O valor não é um UUID: " + value);
                    }
                }
            }
        });
        jTableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CRM", "ESPECIALIDADE", "EMAIL", "HORARIOS DE TRABALHO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableMedicos);

        jLabel2.setText("HORARIOS DISPONIVEIS");

        jComboBoxListaHorarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda", "Terça", "Quarta", "Quinta","Sexta" }));

        jButtonAtualizarMedico.setText("ATUALIZAR");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("MEDICOS CADASTRADOS NO SISTEMA");

        jLabel1.setText("NOME");

        jLabel3.setText("CRM");

        jLabel4.setText("EMAIL");

        jLabel6.setText("SENHA");

        jLabel7.setText("ESPECIALIDADE");

        jComboBoxEspecialidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiologia", "Dermatologia", "Ortopedia", "Neurologia","Pediatria" }));

        jTextAreaVerHorariosSelecionados.setEditable(false);
        jTextAreaVerHorariosSelecionados.setColumns(20);
        jTextAreaVerHorariosSelecionados.setRows(5);
        jScrollPane2.setViewportView(jTextAreaVerHorariosSelecionados);

        jLabel8.setText("HORARIOS SELECIONADOS");

        jButtonAdicionarHorario.setText("ADICIONAR");
        jButtonAdicionarHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAdicionarHorarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelExibirConteudosLayout = new javax.swing.GroupLayout(jPanelExibirConteudos);
        jPanelExibirConteudos.setLayout(jPanelExibirConteudosLayout);
        jPanelExibirConteudosLayout.setHorizontalGroup(
            jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExibirConteudosLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelExibirConteudosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelExibirConteudosLayout.createSequentialGroup()
                        .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldSenhaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldCRMMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmailMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(92, 92, 92)
                        .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(jPanelExibirConteudosLayout.createSequentialGroup()
                                .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboBoxListaHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(jButtonAdicionarHorario))
                            .addComponent(jComboBoxEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2))
                        .addGap(73, 73, 73)
                        .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonExcluirMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelExibirConteudosLayout.createSequentialGroup()
                                .addComponent(jButtonCadastrarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAtualizarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(128, 128, 128))
        );
        jPanelExibirConteudosLayout.setVerticalGroup(
            jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExibirConteudosLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExibirConteudosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCRMMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmailMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSenhaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelExibirConteudosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAdicionarHorario)
                            .addComponent(jComboBoxListaHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelExibirConteudosLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelExibirConteudosLayout.createSequentialGroup()
                                .addGroup(jPanelExibirConteudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonAtualizarMedico)
                                    .addComponent(jButtonCadastrarMedico))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonExcluirMedico)))))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelExibirConteudos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelExibirConteudos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultasMouseClicked
        // TODO add your handling code here:
        JanelaConsultas janelaConsultas = new JanelaConsultas();
        janelaConsultas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonConsultasMouseClicked

    private void jButtonPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPacientesMouseClicked
        // TODO add your handling code here:
        JanelaPacientes janelaPacientes = new JanelaPacientes();
        janelaPacientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonPacientesMouseClicked

    private void jButtonAdicionarHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdicionarHorarioMouseClicked
        // TODO add your handling code here:
        // Obtém o item selecionado no JComboBox
        String horarioSelecionado = (String) jComboBoxListaHorarios.getSelectedItem();

        // Verifica se há um item selecionado antes de adicionar
        if (horarioSelecionado != null && !horarioSelecionado.isEmpty()) {
            // Adiciona o texto ao JTextArea, preservando os valores anteriores
            jTextAreaVerHorariosSelecionados.append(horarioSelecionado + "\n");
        }
    }//GEN-LAST:event_jButtonAdicionarHorarioMouseClicked

    private void jButtonCadastrarMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarMedicoMouseClicked
        // TODO add your handling code here:
        String nome = jTextFieldNomeMedico.getText();
        String crm = jTextFieldCRMMedico.getText();
        String email = jTextFieldEmailMedico.getText();
        String senha = jTextFieldSenhaMedico.getText();
        String horarios = jTextAreaVerHorariosSelecionados.getText();

// Divide a String em um array, usando a quebra de linha como delimitador
        String[] horariosArray = horarios.split("\n"); // ou outro delimitador se necessário
        // Converte o array para uma List<String>
        List<String> horariosList = new ArrayList<>(Arrays.asList(horariosArray));
        String especialidadeSelecionada = (String) jComboBoxEspecialidades.getSelectedItem();

        AdministradorController adminController = new AdministradorController();
        MedicoController medicoController = new MedicoController();
        MedicoModel medico = new MedicoModel(nome, email, senha, crm, horariosList, especialidadeSelecionada);

        medicoController.cadastrarMedico(medico,usuario.getId());

    }//GEN-LAST:event_jButtonCadastrarMedicoMouseClicked

    private void jButtonExcluirMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExcluirMedicoMouseClicked
        // TODO add your handling code here:
        if (crmMedico != null) {
            MedicoController medicoController = new MedicoController();
            AdministradorController adminController = new AdministradorController();
            String idAdmin = adminController.buscarPeloEmail("JoedsonAdmin@gmail.com").getId();

            System.out.println("Id da consulta: " + crmMedico.toString());
            medicoController.removerMedico(crmMedico,idAdmin);

            // Aqui você pode adicionar lógica para atualizar a interface, como reloading a tabela
            System.out.println("Consulta excluída com sucesso!");
        } else {
            System.out.println("❌ ERRO: Nenhum ID de consulta selecionado!" + crmMedico);
        }

    }//GEN-LAST:event_jButtonExcluirMedicoMouseClicked

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
            java.util.logging.Logger.getLogger(JanelaMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaMedicos().setVisible(true);
            }
        });
    }

    private void Display() {
        AdministradorController adminController = new AdministradorController();
        MedicoController medicoController = new MedicoController();
        List<MedicoModel> medicos = medicoController.listarMedicos(usuario.getId());

        // Limpa a tabela antes de adicionar novos dados
        DefaultTableModel model = (DefaultTableModel) jTableMedicos.getModel();
        model.setRowCount(0);

        for (MedicoModel medico : medicos) {
            model.addRow(new Object[]{
                medico.getId(),
                medico.getNome(),
                medico.getCrm(),
                medico.getEspecialidade(),
                medico.getEmail(),
                medico.getDisponibilidade()
            });
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarHorario;
    private javax.swing.JButton jButtonAtualizarMedico;
    private javax.swing.JButton jButtonCadastrarMedico;
    private javax.swing.JButton jButtonConsultas;
    private javax.swing.JButton jButtonExcluirMedico;
    private javax.swing.JButton jButtonMedicos;
    private javax.swing.JButton jButtonPacientes;
    private javax.swing.JButton jButtonRelatorios;
    private javax.swing.JComboBox<String> jComboBoxEspecialidades;
    private javax.swing.JComboBox<String> jComboBoxListaHorarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelExibirConteudos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMedicos;
    private javax.swing.JTextArea jTextAreaVerHorariosSelecionados;
    private javax.swing.JTextField jTextFieldCRMMedico;
    private javax.swing.JTextField jTextFieldEmailMedico;
    private javax.swing.JTextField jTextFieldNomeMedico;
    private javax.swing.JTextField jTextFieldSenhaMedico;
    // End of variables declaration//GEN-END:variables
}
