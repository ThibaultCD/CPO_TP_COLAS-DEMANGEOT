/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetinterface_colas.demangeot;

/**
 *
 * @author 33781
 */
public class FenetrePrincipaleProjet extends javax.swing.JFrame {

    /**
     * Creates new form FenetrePrincipaleProjet
     */
    public FenetrePrincipaleProjet() {
        initComponents();
        msg1.setVisible(false);
        Bouton2.setVisible(false);
        msg2.setVisible(false);
        Bouton3.setVisible(false);
        msg3.setVisible(false);
        Bouton4.setVisible(false);
        msg3.setVisible(false);
        Bouton4.setVisible(false);
        msg4.setVisible(false);
        Bouton5.setVisible(false);
        msg5.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bouton1 = new javax.swing.JButton();
        msg1 = new javax.swing.JLabel();
        Bouton2 = new javax.swing.JButton();
        msg2 = new javax.swing.JLabel();
        Bouton3 = new javax.swing.JButton();
        msg3 = new javax.swing.JLabel();
        Bouton4 = new javax.swing.JButton();
        msg4 = new javax.swing.JLabel();
        Bouton5 = new javax.swing.JButton();
        msg5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bouton1.setText("Appuyez ici");
        Bouton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton1ActionPerformed(evt);
            }
        });

        msg1.setText("Regardez en bas à droite");

        Bouton2.setText("Appuyez ici");
        Bouton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton2ActionPerformed(evt);
            }
        });

        msg2.setText("Regardez en bas à gauche");

        Bouton3.setText("Appuyez ici");
        Bouton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton3ActionPerformed(evt);
            }
        });

        msg3.setText("Regardez en haut à droite");

        Bouton4.setText("Appuyez ici");
        Bouton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton4ActionPerformed(evt);
            }
        });

        msg4.setText("Regardez au milieu vous y êtes presque");

        Bouton5.setText("Appuyez ici");
        Bouton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton5ActionPerformed(evt);
            }
        });

        msg5.setText("Bravo !!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Bouton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bouton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(msg3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(msg2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bouton1)
                            .addComponent(msg1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bouton4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(msg4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bouton5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(msg5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bouton1)
                    .addComponent(Bouton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg1)
                    .addComponent(msg4))
                .addGap(77, 77, 77)
                .addComponent(Bouton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg2)
                    .addComponent(msg3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bouton2)
                    .addComponent(Bouton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bouton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton1ActionPerformed
        // TODO add your handling code here:
        msg1.setVisible(true);
        Bouton2.setVisible(true);
    }//GEN-LAST:event_Bouton1ActionPerformed

    private void Bouton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton2ActionPerformed
        // TODO add your handling code here:
        msg2.setVisible(true);
        Bouton3.setVisible(true);
    }//GEN-LAST:event_Bouton2ActionPerformed

    private void Bouton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton3ActionPerformed
        // TODO add your handling code here:
        msg3.setVisible(true);
        Bouton4.setVisible(true);
    }//GEN-LAST:event_Bouton3ActionPerformed

    private void Bouton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton4ActionPerformed
        // TODO add your handling code here:
        msg4.setVisible(true);
        Bouton5.setVisible(true);
    }//GEN-LAST:event_Bouton4ActionPerformed

    private void Bouton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton5ActionPerformed
        // TODO add your handling code here:
        msg5.setVisible(true);
    }//GEN-LAST:event_Bouton5ActionPerformed

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
            java.util.logging.Logger.getLogger(FenetrePrincipaleProjet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipaleProjet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipaleProjet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipaleProjet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipaleProjet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bouton1;
    private javax.swing.JButton Bouton2;
    private javax.swing.JButton Bouton3;
    private javax.swing.JButton Bouton4;
    private javax.swing.JButton Bouton5;
    private javax.swing.JLabel msg1;
    private javax.swing.JLabel msg2;
    private javax.swing.JLabel msg3;
    private javax.swing.JLabel msg4;
    private javax.swing.JLabel msg5;
    // End of variables declaration//GEN-END:variables
}
