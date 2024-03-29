/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Sistema.InternoSistema;

import java.awt.event.KeyEvent;
import manipuladores.ManipuladorAssunto;
import modelo.Assunto;
import view.TelaEntrar;

/**
 *
 * @author pedro
 */
public class AssuntosExcluir extends javax.swing.JInternalFrame {

    /**
     * Creates new form AssuntosExcluir
     */
    public AssuntosExcluir() {
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

        jPanel1 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonOK = new javax.swing.JButton();
        FUNDO = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Excluindo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("ID do Assunto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 90, 80));

        jButtonOK.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconExcluir.png"))); // NOI18N
        getContentPane().add(FUNDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 240));

        setBounds(0, 0, 250, 270);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        Assunto assunto = new Assunto();
        ManipuladorAssunto MpAss = new ManipuladorAssunto();
        int id_assunto;
        id_assunto = Integer.parseInt(txtID.getText());
        assunto.setId(id_assunto);
        assunto.setCod_usuario(TelaEntrar.usuario().getCod());
        MpAss.Excluir(assunto);
        this.dispose();
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Assunto assunto = new Assunto();
            ManipuladorAssunto MpAss = new ManipuladorAssunto();
            int id_assunto;
            id_assunto = Integer.parseInt(txtID.getText());
            assunto.setId(id_assunto);
            assunto.setCod_usuario(TelaEntrar.usuario().getCod());
            MpAss.Excluir(assunto);
            this.dispose();
        }
    }//GEN-LAST:event_txtIDKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FUNDO;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
