/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Outros.Util;
/**
 *
 * @author Wagner Chaves
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCadastros = new javax.swing.JMenu();
        jMenuItemCadCliente = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadApartamento = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        mnuPesquisar = new javax.swing.JMenu();
        jMenuItemPesqCliente = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        jMenuItemPesqApartamento = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        mnuRelatorios = new javax.swing.JMenu();
        jMenuItemRelCliente = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        jMenuItemRelHospedagem = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        mnuOpcao = new javax.swing.JMenu();
        jMenuItemAjudaLeiaMe = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        jMenuItemAjudaSobre = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(863, 30));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(863, 30));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(863, 30));
        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseEntered(evt);
            }
        });

        mnuCadastros.setText("Clientes");
        mnuCadastros.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mnuCadastros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnuCadastrosMouseEntered(evt);
            }
        });

        jMenuItemCadCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCadCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItemCadCliente.setText("Novo");
        jMenuItemCadCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItemCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClienteActionPerformed(evt);
            }
        });
        mnuCadastros.add(jMenuItemCadCliente);
        mnuCadastros.add(jSeparator10);

        jMenuItemCadApartamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCadApartamento.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItemCadApartamento.setText("Consultar");
        jMenuItemCadApartamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItemCadApartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadApartamentoActionPerformed(evt);
            }
        });
        mnuCadastros.add(jMenuItemCadApartamento);
        mnuCadastros.add(jSeparator11);
        mnuCadastros.add(jSeparator12);

        jMenuBar1.add(mnuCadastros);

        mnuPesquisar.setText("Produtos");
        mnuPesquisar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mnuPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnuPesquisarMouseEntered(evt);
            }
        });

        jMenuItemPesqCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPesqCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItemPesqCliente.setText("Novo");
        jMenuItemPesqCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItemPesqCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesqClienteActionPerformed(evt);
            }
        });
        mnuPesquisar.add(jMenuItemPesqCliente);
        mnuPesquisar.add(jSeparator13);

        jMenuItemPesqApartamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPesqApartamento.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItemPesqApartamento.setText("Consultar Estoque");
        jMenuItemPesqApartamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItemPesqApartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesqApartamentoActionPerformed(evt);
            }
        });
        mnuPesquisar.add(jMenuItemPesqApartamento);
        mnuPesquisar.add(jSeparator14);

        jMenuBar1.add(mnuPesquisar);

        mnuRelatorios.setText("Vendas");
        mnuRelatorios.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mnuRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnuRelatoriosMouseEntered(evt);
            }
        });

        jMenuItemRelCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemRelCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItemRelCliente.setText("Efetuar Venda");
        jMenuItemRelCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItemRelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelClienteActionPerformed(evt);
            }
        });
        mnuRelatorios.add(jMenuItemRelCliente);
        mnuRelatorios.add(jSeparator15);

        jMenuItemRelHospedagem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemRelHospedagem.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItemRelHospedagem.setText("Consultar");
        jMenuItemRelHospedagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItemRelHospedagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelHospedagemActionPerformed(evt);
            }
        });
        mnuRelatorios.add(jMenuItemRelHospedagem);
        mnuRelatorios.add(jSeparator16);

        jMenuBar1.add(mnuRelatorios);

        mnuOpcao.setText("Opções");
        mnuOpcao.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mnuOpcao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnuOpcaoMouseEntered(evt);
            }
        });

        jMenuItemAjudaLeiaMe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAjudaLeiaMe.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItemAjudaLeiaMe.setText("Ajuda?");
        jMenuItemAjudaLeiaMe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnuOpcao.add(jMenuItemAjudaLeiaMe);
        mnuOpcao.add(jSeparator17);

        jMenuItemAjudaSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAjudaSobre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItemAjudaSobre.setText("Sobre o Sistema");
        jMenuItemAjudaSobre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnuOpcao.add(jMenuItemAjudaSobre);

        mnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnuSair.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        mnuOpcao.add(mnuSair);

        jMenuBar1.add(mnuOpcao);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemPesqClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesqClienteActionPerformed
        NovoProduto nprod = new NovoProduto();
        nprod.setVisible(true);    }//GEN-LAST:event_jMenuItemPesqClienteActionPerformed

    private void jMenuItemPesqApartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesqApartamentoActionPerformed

    }//GEN-LAST:event_jMenuItemPesqApartamentoActionPerformed

    private void mnuPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuPesquisarMouseEntered
    }//GEN-LAST:event_mnuPesquisarMouseEntered

    private void jMenuItemRelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelClienteActionPerformed

    }//GEN-LAST:event_jMenuItemRelClienteActionPerformed

    private void jMenuItemRelHospedagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelHospedagemActionPerformed
    }//GEN-LAST:event_jMenuItemRelHospedagemActionPerformed

    private void mnuRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuRelatoriosMouseEntered
    }//GEN-LAST:event_mnuRelatoriosMouseEntered

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        if (Util.imprimirConfirmacao("Deseja Sair")) {
            Util.sair();
        }
    }//GEN-LAST:event_mnuSairActionPerformed

    private void mnuOpcaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuOpcaoMouseEntered
    }//GEN-LAST:event_mnuOpcaoMouseEntered

    private void jMenuBar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseEntered
    }//GEN-LAST:event_jMenuBar1MouseEntered

    private void mnuCadastrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCadastrosMouseEntered
    }//GEN-LAST:event_mnuCadastrosMouseEntered

    private void jMenuItemCadApartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadApartamentoActionPerformed

    }//GEN-LAST:event_jMenuItemCadApartamentoActionPerformed

    private void jMenuItemCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadClienteActionPerformed

        NovoCliente ncli = new NovoCliente();
        ncli.setVisible(true);

    }//GEN-LAST:event_jMenuItemCadClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAjudaLeiaMe;
    private javax.swing.JMenuItem jMenuItemAjudaSobre;
    private javax.swing.JMenuItem jMenuItemCadApartamento;
    private javax.swing.JMenuItem jMenuItemCadCliente;
    private javax.swing.JMenuItem jMenuItemPesqApartamento;
    private javax.swing.JMenuItem jMenuItemPesqCliente;
    private javax.swing.JMenuItem jMenuItemRelCliente;
    private javax.swing.JMenuItem jMenuItemRelHospedagem;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JMenu mnuCadastros;
    private javax.swing.JMenu mnuOpcao;
    private javax.swing.JMenu mnuPesquisar;
    private javax.swing.JMenu mnuRelatorios;
    private javax.swing.JMenuItem mnuSair;
    // End of variables declaration//GEN-END:variables
}
