/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanos;

/**
 *
 * @author lis
 */
public class Principal extends javax.swing.JFrame {
Conversor c = new Conversor();
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        jLResult.setVisible(false);
        jLResult1.setVisible(false);
        jLresult2.setVisible(false);
        jLresultQuest.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLIntruccion = new javax.swing.JLabel();
        jTPlaceHolder = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLResult1 = new javax.swing.JLabel();
        jLresultQuest = new javax.swing.JLabel();
        jLresult2 = new javax.swing.JLabel();
        jLResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor");
        setMinimumSize(new java.awt.Dimension(537, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jLIntruccion.setText("Ingrese el numero arabico  que desea convertir a numero romano");
        getContentPane().add(jLIntruccion);
        jLIntruccion.setBounds(10, 10, 450, 17);

        jTPlaceHolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPlaceHolderActionPerformed(evt);
            }
        });
        getContentPane().add(jTPlaceHolder);
        jTPlaceHolder.setBounds(10, 40, 370, 27);

        jButton1.setText("Convertir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 40, 100, 29);

        jLResult1.setText("El numero: ");
        getContentPane().add(jLResult1);
        jLResult1.setBounds(10, 80, 90, 17);

        jLresultQuest.setText("jLabel3");
        getContentPane().add(jLresultQuest);
        jLresultQuest.setBounds(100, 80, 49, 17);

        jLresult2.setText("en numeros romanos es:");
        getContentPane().add(jLresult2);
        jLresult2.setBounds(190, 80, 180, 17);

        jLResult.setText("jLabel5");
        getContentPane().add(jLResult);
        jLResult.setBounds(10, 110, 350, 17);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTPlaceHolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPlaceHolderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPlaceHolderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String numero = jTPlaceHolder.getText();        
        jLresultQuest.setText(numero);
        String resultado = c.romanoDe(numero);
        c.probar();
         jLResult.setVisible(true);
         jLResult.setText(resultado);
        jLResult1.setVisible(true);
        jLresult2.setVisible(true);
        jLresultQuest.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLIntruccion;
    private javax.swing.JLabel jLResult;
    private javax.swing.JLabel jLResult1;
    private javax.swing.JLabel jLresult2;
    private javax.swing.JLabel jLresultQuest;
    private javax.swing.JTextField jTPlaceHolder;
    // End of variables declaration//GEN-END:variables
}