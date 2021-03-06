
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcervant23
 */
public class Ejercicio9 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio9
     */
    public Ejercicio9() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMonIni = new javax.swing.JTextField();
        txtMonFin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingrese Saldo Inicial");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 140, 20));

        jLabel2.setText("Ingrese Saldo Final");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, 20));
        jPanel1.add(txtMonIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 110, -1));
        jPanel1.add(txtMonFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 110, -1));

        jLabel3.setText("Costo Total");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 110, 20));

        txtCosto.setEditable(false);
        jPanel1.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 110, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        // TODO add your handling code here:
        String res;
        double mon1, mon2, monto, costo, rec;
        
        if (txtMonIni.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite por favor el monto inicial", "Error", JOptionPane.ERROR_MESSAGE);
            txtMonIni.requestFocusInWindow();
        } else if (txtMonFin.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite por favor el monto final", "Error", JOptionPane.ERROR_MESSAGE);
            txtMonFin.requestFocusInWindow();
        } else {
        
        mon1 = Double.parseDouble(txtMonIni.getText());
        mon2 = Double.parseDouble(txtMonFin.getText());
        
        monto = mon1  - mon2;
        rec   = monto * 0.2;
        costo = monto + rec;
        
        res = String.valueOf(costo);
        txtCosto.setText(res);
        }      
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        // TODO add your handling code here:
        txtMonFin.setText("");
        txtMonIni.setText("");
        txtCosto.setText("");
        txtMonIni.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtMonFin;
    private javax.swing.JTextField txtMonIni;
    // End of variables declaration//GEN-END:variables
}
