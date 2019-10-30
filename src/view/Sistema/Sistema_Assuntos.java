package view.Sistema;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import manipuladores.ManipuladorAssunto;
import modelo.Assunto;
import modelo.Usuario;
import view.TelaEntrar;

/**
 *
 * @author pedro
 */
public class Sistema_Assuntos extends javax.swing.JFrame {

    private Usuario Usuario;


    /**
     * Creates new form Sistema_Assuntos
     */
    public Sistema_Assuntos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_ID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelQuantidade = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtNomeAssunto = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAssuntos = new javax.swing.JTable();
        FUNDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Assuntos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_ID.setText("ID");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabelQuantidade.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelQuantidade.setText("Quantidade");

        txtID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtQuantidade.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtNomeAssunto.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jButtonEditar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonEditar.setText("Editar");

        jButtonCadastrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonListar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonListar.setText("Listar");

        jButtonExcluir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonExcluir.setText("Excluir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_ID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQuantidade))
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonListar)
                .addGap(10, 10, 10)
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExcluir)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuantidade)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_ID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonListar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir))
                .addContainerGap())
        );

        jLabel_ID.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 640, 120));

        jButtonVoltar.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, -1, -1));

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
            TableAssuntos.getColumnModel().getColumn(0).setMinWidth(25);
            TableAssuntos.getColumnModel().getColumn(0).setPreferredWidth(35);
            TableAssuntos.getColumnModel().getColumn(0).setMaxWidth(50);
            TableAssuntos.getColumnModel().getColumn(2).setMinWidth(70);
            TableAssuntos.getColumnModel().getColumn(2).setPreferredWidth(80);
            TableAssuntos.getColumnModel().getColumn(2).setMaxWidth(80);
            TableAssuntos.getColumnModel().getColumn(3).setMinWidth(100);
            TableAssuntos.getColumnModel().getColumn(3).setPreferredWidth(110);
            TableAssuntos.getColumnModel().getColumn(3).setMaxWidth(110);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 540, 270));

        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadastroAssuntos2.png"))); // NOI18N
        getContentPane().add(FUNDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 460));

        setSize(new java.awt.Dimension(666, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        Sistema tela = new Sistema();
        tela.setVisible(true);
        this.dispose();
    }                                             

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        ManipuladorAssunto MpAss = new ManipuladorAssunto();
        Assunto assunto = new Assunto();
        Usuario usuario = TelaEntrar.usuario();
        int ID;
        ID = Integer.parseInt(txtID.getText());
        int Qntd;
        Qntd = Integer.parseInt(txtQuantidade.getText());
        assunto.setId(ID);
        assunto.setNome(txtNomeAssunto.getText());
        assunto.setQuantidade(Qntd);
        assunto.setDataCadastro(getDateTime());
        assunto.setCod_usuario(usuario.getCod());
        MpAss.cadastrar(assunto);
        
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
            java.util.logging.Logger.getLogger(Sistema_Assuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema_Assuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema_Assuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema_Assuntos.class.getNajLabel_IDog(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema_Assuntos().setVisible(true);
            }
        });
    }
    
    private String getDateTime() { 
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
	Date date = new Date(); 
	return dateFormat.format(date); 
}

    // Variables declaration - do not modify                     
    private javax.swing.JLabel FUNDO;
    private javax.swing.JTable TableAssuntos;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNomeAssunto;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration                   
}
