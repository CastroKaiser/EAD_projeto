
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import lerlivros.bd.BD;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author edmun
 */
public class tela_login extends javax.swing.JFrame {

    /**
     * Creates new form tela_login
     */
    public tela_login() {
        initComponents();
    }
    public static final String TABLE = "usuario";
    
    public void verificacao() {
        
        String usuario = jtxtf_usuario.getText();
        String senha = jpwf_senha.getText();
        
        if (usuario != null && senha != null) {
            Connection conn = BD.getConnection();
            if (conn != null) {
                PreparedStatement select = null;
                try {
                    select = conn.prepareStatement(String.format("SELECT existencia FROM %s WHERE usuario = ? AND senha = ?", TABLE));
                    select.setString(1, usuario);
                    select.setString(2, senha);
                    
                    if (select != null) {
                        tela_inicial frame = new tela_inicial();
                        frame.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Credenciais de acesso inválidas.", "Login falhou", JOptionPane.ERROR_MESSAGE);
                    }

                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query de login", JOptionPane.ERROR_MESSAGE);
                } 
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha completamento os campos", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbl_usuario = new javax.swing.JLabel();
        jtxtf_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpwf_senha = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jbtt_entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_usuario.setText("Usuário:");
        getContentPane().add(jlbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jtxtf_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtxtf_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 202, -1));

        jLabel1.setText("Senha:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setText("Bem Vindo ao LerLivros");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jpwf_senha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpwf_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpwf_senhaActionPerformed(evt);
            }
        });
        getContentPane().add(jpwf_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 200, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jbtt_entrar.setText("ENTRAR");
        jbtt_entrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtt_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtt_entrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jbtt_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jbtt_entrar)
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 300, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtf_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_usuarioActionPerformed

    private void jpwf_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpwf_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpwf_senhaActionPerformed

    private void jbtt_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtt_entrarActionPerformed
        // TODO add your handling code here:
        verificacao();
    }//GEN-LAST:event_jbtt_entrarActionPerformed

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
            java.util.logging.Logger.getLogger(tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtt_entrar;
    private javax.swing.JLabel jlbl_usuario;
    private javax.swing.JPasswordField jpwf_senha;
    private javax.swing.JTextField jtxtf_usuario;
    // End of variables declaration//GEN-END:variables
}