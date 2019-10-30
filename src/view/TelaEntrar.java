package view;

import view.Sistema.Sistema;
import javax.swing.JOptionPane;
import manipuladores.ManipuladorUsuario;
import modelo.Usuario;

public class TelaEntrar extends javax.swing.JFrame {
    
    private static Usuario usuario;
    
    public TelaEntrar() {
        initComponents();
        this.usuario = new Usuario();
    }
    
    public static Usuario usuario() {
        return TelaEntrar.usuario;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jLabelCdg = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        FUNDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabelTitle.setText("Acessando o Sistema...");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabelCdg.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelCdg.setText("Código:");
        getContentPane().add(jLabelCdg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabelSenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 60, 30));

        txtSenha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, 30));

        jButtonEntrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 270, -1, -1));

        jButtonVoltar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 270, 70, -1));

        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone.png"))); // NOI18N
        getContentPane().add(FUNDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 360));

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        ManipuladorUsuario MpUsu = new ManipuladorUsuario();
        if(MpUsu.checkLogin(txtCodigo.getText(), new String(txtSenha.getText()))){
            JOptionPane.showMessageDialog(null, "Bem vindo(a)!");
            this.usuario.setCod(txtCodigo.getText());
            Sistema sys = new Sistema();
            sys.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Dados inválidos!");
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEntrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FUNDO;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelCdg;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
