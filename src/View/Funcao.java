/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.CFuncao;
import Modelo.MFuncao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALFREDO CACONDA
 */
public class Funcao extends javax.swing.JFrame {

    /**
     * Creates new form Funcao
     */
    public Funcao() {
        initComponents();
        pesquisar("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnapagar = new rojeru_san.RSButtonRiple();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeFuncao = new rojeru_san.RSMTextFull();
        txtDesc_funcao = new rojeru_san.RSMTextFull();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbfuncao = new javax.swing.JTable();
        txtpesquisar = new rojeru_san.RSMTextFull();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnmilitante = new rojeru_san.RSButton();
        jLabel7 = new javax.swing.JLabel();
        btnmilitante1 = new rojeru_san.RSButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnmilitante3 = new rojeru_san.RSButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnmilitante4 = new rojeru_san.RSButton();
        btnapagar1 = new rojeru_san.RSButtonRiple();
        btnsalvar = new rojeru_san.RSButtonRiple();
        btneditar = new rojeru_san.RSButtonRiple();
        btnsalvar1 = new rojeru_san.RSButtonRiple();

        btnapagar.setBackground(new java.awt.Color(246, 19, 67));
        btnapagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8_Close_20px_2.png"))); // NOI18N
        btnapagar.setText("APAGAR");
        btnapagar.setColorHover(new java.awt.Color(246, 0, 33));
        btnapagar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapagarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(87, 159, 218));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel4.setText("REGISTAR FUNÇÕES");

        txtNomeFuncao.setPlaceholder("FUNÇÃO");

        txtDesc_funcao.setPlaceholder("DESCRIÇÃO DA FUNÇÃO");

        tbfuncao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbfuncao);

        txtpesquisar.setPlaceholder("PESQUISAR");
        txtpesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpesquisarKeyReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(10, 26, 62));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("nome");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        btnmilitante.setBackground(new java.awt.Color(10, 26, 62));
        btnmilitante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Icones/IconMilitante.png"))); // NOI18N
        btnmilitante.setText("MILITANTE");
        btnmilitante.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnmilitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmilitanteActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Icones/linhaAzul.png"))); // NOI18N

        btnmilitante1.setBackground(new java.awt.Color(10, 26, 62));
        btnmilitante1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Icones/iconMembroo.png"))); // NOI18N
        btnmilitante1.setText("MEMBRO");
        btnmilitante1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnmilitante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmilitante1ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Icones/linhaAzul.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Icones/linhaAzul.png"))); // NOI18N

        btnmilitante3.setBackground(new java.awt.Color(10, 26, 62));
        btnmilitante3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Icones/iconQuota.png"))); // NOI18N
        btnmilitante3.setText("QUOTA");
        btnmilitante3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnmilitante3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmilitante3ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Icones/linhaAzul.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Icones/IconUserLogin.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Icones/linhaAzul.png"))); // NOI18N

        btnmilitante4.setBackground(new java.awt.Color(10, 26, 62));
        btnmilitante4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Icones/HOME.png"))); // NOI18N
        btnmilitante4.setText("PÁGINA INICIAL");
        btnmilitante4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnmilitante4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmilitante4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmilitante1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 20, Short.MAX_VALUE))))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnmilitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmilitante3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmilitante4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmilitante4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnmilitante, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnmilitante1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnmilitante3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnapagar1.setBackground(new java.awt.Color(246, 19, 67));
        btnapagar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8_Close_20px_2.png"))); // NOI18N
        btnapagar1.setText("APAGAR");
        btnapagar1.setColorHover(new java.awt.Color(246, 0, 33));
        btnapagar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnapagar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapagar1ActionPerformed(evt);
            }
        });

        btnsalvar.setBackground(new java.awt.Color(0, 166, 81));
        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/salvar.png"))); // NOI18N
        btnsalvar.setText("SALVAR");
        btnsalvar.setColorHover(new java.awt.Color(87, 159, 218));
        btnsalvar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btneditar.setBackground(new java.awt.Color(223, 126, 23));
        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/login.png"))); // NOI18N
        btneditar.setText("EDITAR");
        btneditar.setColorHover(new java.awt.Color(223, 215, 54));
        btneditar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnsalvar1.setBackground(new java.awt.Color(10, 26, 62));
        btnsalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8_Done_40px.png"))); // NOI18N
        btnsalvar1.setText("ACTUALIZAR");
        btnsalvar1.setColorHover(new java.awt.Color(0, 166, 81));
        btnsalvar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnsalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(460, 460, 460)
                                .addComponent(btnapagar1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtNomeFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDesc_funcao, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsalvar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesc_funcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnapagar1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(txtpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtpesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisarKeyReleased
        // TODO add your handling code here:
        pesquisar(txtpesquisar.getText());
    }//GEN-LAST:event_txtpesquisarKeyReleased

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new PRINCIPAL().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnmilitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmilitanteActionPerformed
        // TODO add your handling code here:
        new Militante().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnmilitanteActionPerformed

    private void btnmilitante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmilitante1ActionPerformed
        // TODO add your handling code here:
        new MEMBRO().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnmilitante1ActionPerformed

    private void btnmilitante3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmilitante3ActionPerformed
        // TODO add your handling code here:
        // new Quota().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btnmilitante3ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        new PRINCIPAL().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapagarActionPerformed
       
    }//GEN-LAST:event_btnapagarActionPerformed

    private void btnapagar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapagar1ActionPerformed
       if (tbfuncao.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "SELECIONA O ITEM QUE PRETENDE APAGAR");
        } else {
            apagar();
        }
    }//GEN-LAST:event_btnapagar1ActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        // TODO add your handling code here:
        salvar();
    }//GEN-LAST:event_btnsalvarActionPerformed
    int id;
    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        if (tbfuncao.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "SELECIONA O ITEM QUE PRETENDE EDITAR");
        } else {
            id = (int) tbfuncao.getValueAt(tbfuncao.getSelectedRow(), 0);
            txtNomeFuncao.setText((String) tbfuncao.getValueAt(tbfuncao.getSelectedRow(), 1));
            txtDesc_funcao.setText((String) tbfuncao.getValueAt(tbfuncao.getSelectedRow(), 2));
            btnsalvar.setVisible(!true);

        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void btnsalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvar1ActionPerformed
        // TODO add your handling code here:
        actualizar();
    }//GEN-LAST:event_btnsalvar1ActionPerformed

    private void btnmilitante4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmilitante4ActionPerformed
        // TODO add your handling code here:
        new PRINCIPAL().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnmilitante4ActionPerformed

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
            java.util.logging.Logger.getLogger(Funcao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funcao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funcao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funcao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Funcao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnapagar;
    private rojeru_san.RSButtonRiple btnapagar1;
    private rojeru_san.RSButtonRiple btneditar;
    private rojeru_san.RSButton btnmilitante;
    private rojeru_san.RSButton btnmilitante1;
    private rojeru_san.RSButton btnmilitante3;
    private rojeru_san.RSButton btnmilitante4;
    private rojeru_san.RSButtonRiple btnsalvar;
    private rojeru_san.RSButtonRiple btnsalvar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbfuncao;
    private rojeru_san.RSMTextFull txtDesc_funcao;
    private rojeru_san.RSMTextFull txtNomeFuncao;
    private rojeru_san.RSMTextFull txtpesquisar;
    // End of variables declaration//GEN-END:variables

    private void salvar() {
        MFuncao f = new MFuncao();
        CFuncao m = new CFuncao();
        String nome = txtNomeFuncao.getText();
        String descricao = txtDesc_funcao.getText();
        if (txtDesc_funcao.getText().equals("") || txtNomeFuncao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "PREENCHA OS CAMPOS VAZIOS");
        } else {
            f.setNome_funcao(nome);
            f.setDescricao_funcao(descricao);
            m.guardar(f);
        }
        pesquisar("");
    }

    private void actualizar() {
        MFuncao f = new MFuncao();
        CFuncao m = new CFuncao();
        String nome = txtNomeFuncao.getText();
        String descricao = txtDesc_funcao.getText();
        if (txtDesc_funcao.getText().equals("") || txtNomeFuncao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "PREENCHA OS CAMPOS VAZIOS");
        } else {
            f.setNome_funcao(nome);
            f.setDescricao_funcao(descricao);
            f.setId_funcao(id);
            m.actualizar(f);
        }
        pesquisar("");
    }

    public void pesquisar(String pesquisar) {
        CFuncao f = new CFuncao();
        DefaultTableModel dt = (DefaultTableModel) tbfuncao.getModel();
        Object[] recebe = {"CODIGO", "FUNÇÃO", "DESCRIÇÃO"};
        dt.setColumnIdentifiers(recebe);
        dt.setNumRows(0);
        for (MFuncao m : f.listar(pesquisar)) {
            Object[] dado = {m.getId_funcao(), m.getNome_funcao(), m.getDescricao_funcao()};
            dt.addRow(dado);

        }
    }
    public void apagar() {
        CFuncao f = new CFuncao();
        MFuncao m= new MFuncao();
        int codigo=(int) tbfuncao.getValueAt(tbfuncao.getSelectedRow(), 0);
        m.setId_funcao(codigo);
        f.apagar(m);
        pesquisar("");
    }
}
