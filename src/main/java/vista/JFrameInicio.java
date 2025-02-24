/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestiondocumenta.vista;

import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class JFrameInicio extends javax.swing.JFrame {

    /**
     * Creates new form JFrameInicio
     */
    public JFrameInicio() {
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

        jPanel1 = new javax.swing.JPanel();
        jButtonInicioApp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonRegistrar_Ventana = new javax.swing.JButton();
        jButtonConsultar_Ventana = new javax.swing.JButton();
        jLabelCerrarInicio = new javax.swing.JLabel();
        jLabelMinimizarInicio = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jButtonInicioApp.setBackground(new java.awt.Color(255, 51, 51));
        jButtonInicioApp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonInicioApp.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicioApp.setText("INICIO");
        jButtonInicioApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioAppActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTION DOCUMENTAL");

        jButtonRegistrar_Ventana.setBackground(new java.awt.Color(255, 51, 51));
        jButtonRegistrar_Ventana.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRegistrar_Ventana.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar_Ventana.setText("REGISTRAR");
        jButtonRegistrar_Ventana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrar_VentanaActionPerformed(evt);
            }
        });

        jButtonConsultar_Ventana.setBackground(new java.awt.Color(255, 51, 51));
        jButtonConsultar_Ventana.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonConsultar_Ventana.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultar_Ventana.setText("CONSULTAR");
        jButtonConsultar_Ventana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultar_VentanaActionPerformed(evt);
            }
        });

        jLabelCerrarInicio.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabelCerrarInicio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCerrarInicio.setText("X");
        jLabelCerrarInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCerrarInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarInicioMouseClicked(evt);
            }
        });

        jLabelMinimizarInicio.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabelMinimizarInicio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinimizarInicio.setText("-");
        jLabelMinimizarInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimizarInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizarInicioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonInicioApp)
                        .addGap(55, 55, 55)
                        .addComponent(jButtonRegistrar_Ventana)
                        .addGap(47, 47, 47)
                        .addComponent(jButtonConsultar_Ventana))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMinimizarInicio)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCerrarInicio)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCerrarInicio)
                        .addComponent(jLabelMinimizarInicio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInicioApp)
                    .addComponent(jButtonRegistrar_Ventana)
                    .addComponent(jButtonConsultar_Ventana))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInicioAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioAppActionPerformed
        JFrameInicio rgf = new JFrameInicio();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonInicioAppActionPerformed

    private void jLabelCerrarInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarInicioMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCerrarInicioMouseClicked

    private void jLabelMinimizarInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarInicioMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarInicioMouseClicked

    private void jButtonRegistrar_VentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrar_VentanaActionPerformed
        JFrameRegistrar rgf = new JFrameRegistrar();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonRegistrar_VentanaActionPerformed

    private void jButtonConsultar_VentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultar_VentanaActionPerformed
        JFrameConsultar rgf = new JFrameConsultar();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonConsultar_VentanaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar_Ventana;
    private javax.swing.JButton jButtonInicioApp;
    private javax.swing.JButton jButtonRegistrar_Ventana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCerrarInicio;
    private javax.swing.JLabel jLabelMinimizarInicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
