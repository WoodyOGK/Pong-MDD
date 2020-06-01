
import java.awt.FlowLayout;
import javax.swing.JFrame;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class MenuF extends javax.swing.JFrame {

    private javax.swing.JButton normal;
    private javax.swing.JButton twoPLayers;
    private javax.swing.JButton doublePaddle;
    private javax.swing.JButton salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    /**
     * Creates new form Menú
     */
    public MenuF() {
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
        normal = new javax.swing.JButton();
        twoPLayers = new javax.swing.JButton();
        doublePaddle = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 800));
        jPanel1.setLayout(null);

        normal.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        normal.setForeground(new java.awt.Color(0, 0, 255));
        normal.setText("NORMAL");
        normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalActionPerformed(evt);
            }
        });
        jPanel1.add(normal);
        normal.setBounds(220, 220, 220, 80);

        twoPLayers.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        twoPLayers.setForeground(new java.awt.Color(0, 51, 255));
        twoPLayers.setText("2 JUGADORES");
        twoPLayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoPLayersActionPerformed(evt);
            }
        });
        jPanel1.add(twoPLayers);
        twoPLayers.setBounds(220, 340, 220, 80);

        doublePaddle.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        doublePaddle.setForeground(new java.awt.Color(0, 51, 255));
        doublePaddle.setText("DOBLE PALETA");
        doublePaddle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doublePaddleActionPerformed(evt);
            }
        });
        jPanel1.add(doublePaddle);
        doublePaddle.setBounds(220, 470, 220, 80);

        salir.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(204, 0, 0));
        salir.setText("SALIR");
        jPanel1.add(salir);
        salir.setBounds(220, 610, 220, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo blanco.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(600, 800));
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 800));
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 400));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-4, 0, 620, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalActionPerformed
         // TODO add your handling code here:
        jPanel1.setVisible(false);
        dispose();
        new PlayPong(false, true);
    }//GEN-LAST:event_normalActionPerformed

    private void twoPLayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoPLayersActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        dispose();
        new PlayPong(false, false);
    }//GEN-LAST:event_twoPLayersActionPerformed

    private void doublePaddleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doublePaddleActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        dispose();
        //new PlayPong();
    }//GEN-LAST:event_doublePaddleActionPerformed

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
            java.util.logging.Logger.getLogger(MenuF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuF().setVisible(true);
            }
        });
    }
/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doublePaddle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton normal;
    private javax.swing.JButton salir;
    private javax.swing.JButton twoPLayers;
    // End of variables declaration//GEN-END:variables
*/}