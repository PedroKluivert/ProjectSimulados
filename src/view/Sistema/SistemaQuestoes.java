/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Sistema;

import manipuladores.ManipuladorQuestao;
import modelo.Questao;
import modelo.Usuario;
import view.TelaEntrar;

/**
 *
 * @author pedro
 */
public class SistemaQuestoes extends javax.swing.JFrame {

    /**
     * Creates new form SistemaQuestoes
     */
    private Usuario usuario;
    
    public SistemaQuestoes() {
        initComponents();
        choiceTipos.add("Pergunta aberta");
        choiceTipos.add("Pergunta objetiva com única escolha");
        choiceTipos.add("Pergunta objetiva com múltipla resposta");
        choiceTipos.add("Verdadeira ou falsa");
        Usuario usuario = TelaEntrar.usuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        choiceTipos = new java.awt.Choice();
        textAreaQuestao = new java.awt.TextArea();
        textAreaResposta = new java.awt.TextArea();
        txtAssunto = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        FUNDO = new javax.swing.JLabel();
        INICIO = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuQuestao = new javax.swing.JMenu();
        jMenuItemEditar = new javax.swing.JMenuItem();
        jMenuItemExcluir = new javax.swing.JMenuItem();
        jMenuItemListar = new javax.swing.JMenuItem();
        jMenuItemVoltar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema/Questões");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IconQuestion.jpg"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 100, 124));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Pergunta");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Tipo");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Resposta");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Assunto da questão");

        txtID.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        choiceTipos.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        choiceTipos.setName("Tipos"); // NOI18N
        choiceTipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choiceTiposMouseClicked(evt);
            }
        });

        textAreaQuestao.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        textAreaQuestao.setMaximumSize(new java.awt.Dimension(250, 60));
        textAreaQuestao.setMinimumSize(new java.awt.Dimension(250, 60));
        textAreaQuestao.setPreferredSize(new java.awt.Dimension(250, 60));

        textAreaResposta.setMaximumSize(new java.awt.Dimension(200, 60));
        textAreaResposta.setMinimumSize(new java.awt.Dimension(200, 60));
        textAreaResposta.setPreferredSize(new java.awt.Dimension(200, 60));

        txtAssunto.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txtAssunto.setPreferredSize(new java.awt.Dimension(50, 30));

        jButtonCadastrar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setText("Cadastro de Questões");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choiceTipos, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonCadastrar)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(textAreaQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(38, 38, 38)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textAreaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(145, 145, 145))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textAreaResposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textAreaQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(choiceTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadastrar)
                .addGap(65, 65, 65))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 580, 480));

        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Question.jpg"))); // NOI18N
        getContentPane().add(FUNDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 600));
        getContentPane().add(INICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 580));

        jMenuQuestao.setText("Questão");

        jMenuItemEditar.setText("Editar");
        jMenuQuestao.add(jMenuItemEditar);

        jMenuItemExcluir.setText("Excluir");
        jMenuItemExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirActionPerformed(evt);
            }
        });
        jMenuQuestao.add(jMenuItemExcluir);

        jMenuItemListar.setText("Listar");
        jMenuItemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarActionPerformed(evt);
            }
        });
        jMenuQuestao.add(jMenuItemListar);

        jMenuItemVoltar.setText("Voltar");
        jMenuItemVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVoltarActionPerformed(evt);
            }
        });
        jMenuQuestao.add(jMenuItemVoltar);

        jMenuBar1.add(jMenuQuestao);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(640, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemListarActionPerformed

    private void jMenuItemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemExcluirActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void choiceTiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choiceTiposMouseClicked
        //getContentPane().add(choiceTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
    }//GEN-LAST:event_choiceTiposMouseClicked

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        Questao questao = new Questao();
        ManipuladorQuestao MpQst = new ManipuladorQuestao();
        int ID;
        ID = Integer.parseInt(txtID.getText());
        questao.setId(ID);
        questao.setResposta(textAreaResposta.getText());
        questao.setTexto(textAreaQuestao.getText());
        questao.setTipo(choiceTipos.getSelectedItem());
        questao.setId_Assunto(MpQst.busca_ID_Assunto(usuario, txtAssunto.getText()));
        MpQst.cadastrar(questao);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jMenuItemVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVoltarActionPerformed
        Sistema Sys = new Sistema();
        Sys.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaQuestoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FUNDO;
    private javax.swing.JLabel INICIO;
    private java.awt.Choice choiceTipos;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemEditar;
    private javax.swing.JMenuItem jMenuItemExcluir;
    private javax.swing.JMenuItem jMenuItemListar;
    private javax.swing.JMenuItem jMenuItemVoltar;
    private javax.swing.JMenu jMenuQuestao;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextArea textAreaQuestao;
    private java.awt.TextArea textAreaResposta;
    private javax.swing.JTextField txtAssunto;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}