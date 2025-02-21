package views.administrador;

import com.mycompany.controllers.AdministradorController;
import com.mycompany.saude.*;
import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class LoginAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public LoginAdministrador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackGround = new javax.swing.JPanel();
        jPanelLeftBlue = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelSubTitle = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jButtoneEntrarAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEmailAdmin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPasswordAdmin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SELECT LOGIN");

        jPanelLeftBlue.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanelLeftBlueLayout = new javax.swing.GroupLayout(jPanelLeftBlue);
        jPanelLeftBlue.setLayout(jPanelLeftBlueLayout);
        jPanelLeftBlueLayout.setHorizontalGroup(
            jPanelLeftBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        jPanelLeftBlueLayout.setVerticalGroup(
            jPanelLeftBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabelSubTitle.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabelSubTitle.setText("INFORME SUAS CREDENCIAIS ADMINISTRADOR");

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabelTitle.setText("SAUDE PLUS");

        jButtoneEntrarAdmin.setBackground(new java.awt.Color(0, 204, 204));
        jButtoneEntrarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jButtoneEntrarAdmin.setText("ENTRAR");
        jButtoneEntrarAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtoneEntrarAdminMouseClicked(evt);
            }
        });

        jLabel1.setText("EMAIL");

        jLabel2.setText("SENHA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtoneEntrarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSubTitle)
                    .addComponent(jLabelTitle)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextFieldPasswordAdmin)
                            .addComponent(jTextFieldEmailAdmin))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(422, 422, 422))))
                .addGap(407, 407, 407))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabelSubTitle)
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldEmailAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPasswordAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButtoneEntrarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        javax.swing.GroupLayout jPanelBackGroundLayout = new javax.swing.GroupLayout(jPanelBackGround);
        jPanelBackGround.setLayout(jPanelBackGroundLayout);
        jPanelBackGroundLayout.setHorizontalGroup(
            jPanelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackGroundLayout.createSequentialGroup()
                .addComponent(jPanelLeftBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanelBackGroundLayout.setVerticalGroup(
            jPanelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLeftBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoneEntrarAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtoneEntrarAdminMouseClicked
        // TODO add your handling code here:
        AdministradorController adminController = new AdministradorController();
        String email = jTextFieldEmailAdmin.getText();
        String senha = jTextFieldPasswordAdmin.getText();
        String idEmail = adminController.buscarPeloEmail(email).getId();
        System.out.println("Dados do existeEmail: " + idEmail);
        if (adminController.isAdmin(idEmail)) {
            if (adminController.buscarPeloEmail(email).getSenha().equals(senha)) {
                
                this.dispose();

                JanelaConsultas janelaConsultas = new JanelaConsultas();
                janelaConsultas.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Senha incorreta");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Credenciais invalidas");
        }

    }//GEN-LAST:event_jButtoneEntrarAdminMouseClicked

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
            java.util.logging.Logger.getLogger(LoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoneEntrarAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelSubTitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBackGround;
    private javax.swing.JPanel jPanelLeftBlue;
    private javax.swing.JTextField jTextFieldEmailAdmin;
    private javax.swing.JTextField jTextFieldPasswordAdmin;
    // End of variables declaration//GEN-END:variables
}
