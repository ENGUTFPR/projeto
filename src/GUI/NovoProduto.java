/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.ProdutoDAO;
import Entity.Produto;
import Exceptions.CamposBrancosException;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner Chaves
 */
public class NovoProduto extends javax.swing.JFrame {

    /**
     * Creates new form NovoProduto
     */
    public NovoProduto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1CadastroDeCliente = new javax.swing.JLabel();
        jLabelCadNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabelCadNome1 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        jLabelRG = new javax.swing.JLabel();
        tfPreco = new javax.swing.JFormattedTextField();
        jLabelRG1 = new javax.swing.JLabel();
        spGarantia = new javax.swing.JSpinner();
        jLabelRG2 = new javax.swing.JLabel();
        spQtd = new javax.swing.JSpinner();
        jLabelRG3 = new javax.swing.JLabel();
        jLabelRG4 = new javax.swing.JLabel();
        jLabelNomeInvld2 = new javax.swing.JLabel();
        jLabelNomeInvld3 = new javax.swing.JLabel();
        jbtnLimpar = new javax.swing.JButton();
        jbtnSalvar = new javax.swing.JButton();
        jLabelCadNome2 = new javax.swing.JLabel();
        jLabelNomeInvld4 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1CadastroDeCliente.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1CadastroDeCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1CadastroDeCliente.setText("CADASTRO DE PRODUTOS");
        jLabel1CadastroDeCliente.setToolTipText("");
        jLabel1CadastroDeCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1CadastroDeCliente.setMaximumSize(new java.awt.Dimension(740, 80));
        jLabel1CadastroDeCliente.setMinimumSize(new java.awt.Dimension(740, 80));
        jLabel1CadastroDeCliente.setPreferredSize(new java.awt.Dimension(740, 70));
        jLabel1CadastroDeCliente.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabelCadNome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCadNome.setText("Nome:");

        tfNome.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabelCadNome1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCadNome1.setText("Marca:");

        tfMarca.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabelRG.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelRG.setText("und.");

        tfPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        tfPreco.setText("0,00");
        tfPreco.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecoActionPerformed(evt);
            }
        });

        jLabelRG1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelRG1.setText("Preço:");

        spGarantia.setValue(3);

        jLabelRG2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelRG2.setText("Quantidade:");

        jLabelRG3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelRG3.setText("Garantia:");

        jLabelRG4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelRG4.setText("meses");

        jLabelNomeInvld2.setForeground(new java.awt.Color(255, 0, 0));
        jLabelNomeInvld2.setText("*");

        jLabelNomeInvld3.setForeground(new java.awt.Color(255, 0, 0));
        jLabelNomeInvld3.setText("*");

        jbtnLimpar.setText("LIMPAR");
        jbtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparActionPerformed(evt);
            }
        });

        jbtnSalvar.setText("SALVAR");
        jbtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalvarActionPerformed(evt);
            }
        });

        jLabelCadNome2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCadNome2.setText("Código:");

        jLabelNomeInvld4.setForeground(new java.awt.Color(255, 0, 0));
        jLabelNomeInvld4.setText("*");

        tfCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1CadastroDeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelCadNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabelNomeInvld4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelCadNome)
                .addGap(29, 29, 29)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabelNomeInvld3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelCadNome1)
                .addGap(28, 28, 28)
                .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabelNomeInvld2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelRG1)
                .addGap(30, 30, 30)
                .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabelRG2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(spQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabelRG, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelRG3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(spGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabelRG4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jbtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jbtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1CadastroDeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelCadNome2))
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeInvld4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeInvld3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadNome1)
                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeInvld2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRG1)
                    .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRG2)
                    .addComponent(spQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRG))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRG3)
                    .addComponent(spGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRG4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalvarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente inserir este produto", "Salvar", JOptionPane.YES_NO_OPTION) == 0) {
            Produto prod;
            try {
                prod = new Produto(tfCodigo.getText(), tfNome.getText(), tfMarca.getText(), Float.parseFloat(tfPreco.getText().replace(',', '.')), Integer.parseInt(spQtd.getValue().toString()), Integer.parseInt(spGarantia.getValue().toString()));
                ProdutoDAO prodDAO = new ProdutoDAO();
                if (prodDAO.inserir(prod)) {
                    JOptionPane.showMessageDialog(null, "Cadastro do produto " + prod.getNome() + " realizado com sucesso");
                    ClearCampos();
                    tfCodigo.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Código existente, o produto já está cadastrado. ", "Erro de cadastro", JOptionPane.ERROR_MESSAGE);
                    tfCodigo.requestFocus();
                }

            } catch (CamposBrancosException ex) {
                JOptionPane.showMessageDialog(null, ex.toString(), "Erro de cadastro", JOptionPane.ERROR_MESSAGE);
                tfNome.requestFocus();
                System.out.println(ex.getCause());
            }
            //dispose();                
        }
   
    }//GEN-LAST:event_jbtnSalvarActionPerformed

    private void jbtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparActionPerformed
        ClearCampos();
        tfCodigo.requestFocus();
    }//GEN-LAST:event_jbtnLimparActionPerformed

    private void tfPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrecoActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(NovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoProduto().setVisible(true);
            }
        });
    }
    
    private void ClearCampos() {
        tfCodigo.setText(null);
        tfNome.setText(null);
        tfMarca.setText(null);
        tfPreco.setText("0,00");
        spQtd.setValue(0);
        spGarantia.setValue(3);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1CadastroDeCliente;
    private javax.swing.JLabel jLabelCadNome;
    private javax.swing.JLabel jLabelCadNome1;
    private javax.swing.JLabel jLabelCadNome2;
    private javax.swing.JLabel jLabelNomeInvld2;
    private javax.swing.JLabel jLabelNomeInvld3;
    private javax.swing.JLabel jLabelNomeInvld4;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelRG1;
    private javax.swing.JLabel jLabelRG2;
    private javax.swing.JLabel jLabelRG3;
    private javax.swing.JLabel jLabelRG4;
    private javax.swing.JButton jbtnLimpar;
    private javax.swing.JButton jbtnSalvar;
    private javax.swing.JSpinner spGarantia;
    private javax.swing.JSpinner spQtd;
    private javax.swing.JFormattedTextField tfCodigo;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfNome;
    private javax.swing.JFormattedTextField tfPreco;
    // End of variables declaration//GEN-END:variables
}
