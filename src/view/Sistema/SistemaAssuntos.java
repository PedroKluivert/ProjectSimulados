/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Sistema;

import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import manipuladores.ManipuladorAssunto;
import modelo.Assunto;
import modelo.Usuario;
import view.Sistema.InternoSistema.AssuntosEditar;
import view.Sistema.InternoSistema.AssuntosExcluir;
import view.TelaEntrar;

/**
 *
 * @author pedro
 */
public class SistemaAssuntos extends javax.swing.JFrame {

    /**
     * Creates new form SistemaAssuntos
     */
    public SistemaAssuntos() {
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

        INICIO = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelID = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelQntd = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNomeAssunto = new javax.swing.JTextField();
        txtQntd = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        Listar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAssuntos = new javax.swing.JTable();
        FUNDO = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Assuntos = new javax.swing.JMenu();
        jMenuItemEditar = new javax.swing.JMenuItem();
        jMenuItemExcluir = new javax.swing.JMenuItem();
        jMenuItemVoltar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(INICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 430));

        jLabelID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelID.setText("ID");

        jLabelNome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelNome.setText("Nome");

        jLabelQntd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelQntd.setText("Quantidade");

        txtID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtNomeAssunto.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtQntd.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtQntd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQntdActionPerformed(evt);
            }
        });
        txtQntd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQntdKeyPressed(evt);
            }
        });

        Cadastrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Listar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Listar.setText("Listar");
        Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(Cadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(Listar)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQntd)
                            .addComponent(txtQntd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQntd)
                    .addComponent(jLabelID)
                    .addComponent(jLabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQntd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Listar)
                    .addComponent(Cadastrar))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 620, 120));

        TableAssuntos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Quantidade", "Data de Cadastro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableAssuntos);
        if (TableAssuntos.getColumnModel().getColumnCount() > 0) {
            TableAssuntos.getColumnModel().getColumn(0).setMinWidth(40);
            TableAssuntos.getColumnModel().getColumn(0).setPreferredWidth(40);
            TableAssuntos.getColumnModel().getColumn(0).setMaxWidth(50);
            TableAssuntos.getColumnModel().getColumn(1).setMinWidth(100);
            TableAssuntos.getColumnModel().getColumn(1).setPreferredWidth(150);
            TableAssuntos.getColumnModel().getColumn(2).setMinWidth(70);
            TableAssuntos.getColumnModel().getColumn(2).setPreferredWidth(80);
            TableAssuntos.getColumnModel().getColumn(2).setMaxWidth(80);
            TableAssuntos.getColumnModel().getColumn(3).setMinWidth(100);
            TableAssuntos.getColumnModel().getColumn(3).setPreferredWidth(110);
            TableAssuntos.getColumnModel().getColumn(3).setMaxWidth(110);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 540, 260));

        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadastroAssuntos2.png"))); // NOI18N
        getContentPane().add(FUNDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 460));

        Assuntos.setText("Assuntos");

        jMenuItemEditar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jMenuItemEditar.setText("Editar");
        jMenuItemEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarActionPerformed(evt);
            }
        });
        Assuntos.add(jMenuItemEditar);

        jMenuItemExcluir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jMenuItemExcluir.setText("Excluir");
        jMenuItemExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirActionPerformed(evt);
            }
        });
        Assuntos.add(jMenuItemExcluir);

        jMenuItemVoltar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jMenuItemVoltar.setText("Voltar");
        jMenuItemVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVoltarActionPerformed(evt);
            }
        });
        Assuntos.add(jMenuItemVoltar);

        jMenuBar1.add(Assuntos);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(666, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtQntdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQntdActionPerformed
        
    }//GEN-LAST:event_txtQntdActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        ManipuladorAssunto MpAss = new ManipuladorAssunto();
        Assunto assunto = new Assunto();
        Usuario usuario = TelaEntrar.usuario();
        int ID;
        ID = Integer.parseInt(txtID.getText());
        int Qntd;
        Qntd = Integer.parseInt(txtQntd.getText());
        assunto.setId(ID);
        assunto.setNome(txtNomeAssunto.getText());
        assunto.setQuantidade(Qntd);
        assunto.setDataCadastro(TelaEntrar.getDateTime());
        assunto.setCod_usuario(usuario.getCod());
        MpAss.cadastrar(assunto);
    }//GEN-LAST:event_CadastrarActionPerformed

    private void ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarActionPerformed
        DefaultTableModel dtmAssuntos = (DefaultTableModel) TableAssuntos.getModel();
        dtmAssuntos.setNumRows(0);
        ManipuladorAssunto MpAss = new ManipuladorAssunto();
        List<Assunto> ListaAssuntos = MpAss.Listagem(TelaEntrar.usuario());
        for (Assunto Assunto : ListaAssuntos) {
            dtmAssuntos.addRow(new Object[]{
            Assunto.getId(),
            Assunto.getNome(),
            Assunto.getQuantidade(),
            Assunto.getDataCadastro()});
        }
    }//GEN-LAST:event_ListarActionPerformed

    private void jMenuItemVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVoltarActionPerformed
        new Sistema().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemVoltarActionPerformed

    private void jMenuItemEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarActionPerformed
        AssuntosEditar Edicao = new AssuntosEditar();
        INICIO.add(Edicao);
        Edicao.setVisible(true);
    }//GEN-LAST:event_jMenuItemEditarActionPerformed

    private void jMenuItemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirActionPerformed
        AssuntosExcluir Excluir = new AssuntosExcluir();
        INICIO.add(Excluir);
        Excluir.setVisible(true);
    }//GEN-LAST:event_jMenuItemExcluirActionPerformed

    private void txtQntdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQntdKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
//          Cadastrando o assunto
            ManipuladorAssunto MpAss = new ManipuladorAssunto();
            Assunto assunto = new Assunto();
            Usuario usuario = TelaEntrar.usuario();
            int ID;
            ID = Integer.parseInt(txtID.getText());
            int Qntd;
            Qntd = Integer.parseInt(txtQntd.getText());
            assunto.setId(ID);
            assunto.setNome(txtNomeAssunto.getText());
            assunto.setQuantidade(Qntd);
            assunto.setDataCadastro(TelaEntrar.getDateTime());
            assunto.setCod_usuario(usuario.getCod());
            MpAss.cadastrar(assunto);
//          Listando os assuntos cadastrados
            DefaultTableModel dtmAssuntos = (DefaultTableModel) TableAssuntos.getModel();
            dtmAssuntos.setNumRows(0);
            for (Assunto Assunto : MpAss.Listagem(usuario)) {
            dtmAssuntos.addRow(new Object[]{
            Assunto.getId(),
            Assunto.getNome(),
            Assunto.getQuantidade(),
            Assunto.getDataCadastro()});
        }
        }
    }//GEN-LAST:event_txtQntdKeyPressed

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
            java.util.logging.Logger.getLogger(SistemaAssuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaAssuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaAssuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaAssuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaAssuntos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Assuntos;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JLabel FUNDO;
    private javax.swing.JLabel INICIO;
    private javax.swing.JButton Listar;
    private javax.swing.JTable TableAssuntos;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelQntd;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemEditar;
    private javax.swing.JMenuItem jMenuItemExcluir;
    private javax.swing.JMenuItem jMenuItemVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNomeAssunto;
    private javax.swing.JTextField txtQntd;
    // End of variables declaration//GEN-END:variables
}
