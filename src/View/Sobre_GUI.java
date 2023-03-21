
package View;


public class Sobre_GUI extends javax.swing.JFrame {

    
    public Sobre_GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        voltar_BTN = new org.edisoncor.gui.button.ButtonColoredAction();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        labelRound1 = new org.edisoncor.gui.label.LabelRound();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        panel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.setColorPrimario(new java.awt.Color(204, 204, 204));
        panel1.setLayout(null);

        voltar_BTN.setBackground(new java.awt.Color(204, 204, 255));
        voltar_BTN.setText("Voltar");
        voltar_BTN.setToolTipText("Voltar");
        voltar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_BTNActionPerformed(evt);
            }
        });
        panel1.add(voltar_BTN);
        voltar_BTN.setBounds(110, 210, 116, 35);

        labelMetric1.setText("Pedro Almeida");
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        panel1.add(labelMetric1);
        labelMetric1.setBounds(100, 160, 140, 22);

        labelMetric2.setText("Gustavo Neves");
        labelMetric2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        panel1.add(labelMetric2);
        labelMetric2.setBounds(100, 100, 140, 22);

        labelRound1.setText("Desenvolvido por:");
        labelRound1.setColorDeBorde(new java.awt.Color(51, 51, 51));
        labelRound1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        panel1.add(labelRound1);
        labelRound1.setBounds(30, 10, 270, 60);

        labelMetric3.setText("João Pedro");
        labelMetric3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        panel1.add(labelMetric3);
        labelMetric3.setBounds(110, 130, 100, 22);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 350, 270);

        setSize(new java.awt.Dimension(346, 270));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_BTNActionPerformed
        this.dispose();

    }//GEN-LAST:event_voltar_BTNActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Sobre_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sobre_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sobre_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sobre_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sobre_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelRound labelRound1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.button.ButtonColoredAction voltar_BTN;
    // End of variables declaration//GEN-END:variables
}
