/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Fraccionario;
import javax.swing.JOptionPane;

/**
 *
 * @author DanielDeJesus
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    Fraccionario f3;
    public Principal() {
        initComponents();
        cmdCalcular.setEnabled(true);
        cmdConvertirAMixto.setEnabled(false);
        cmdBorrar.setEnabled(true);
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
        txtDenominador4 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cmbOperacion = new javax.swing.JComboBox<String>();
        txtNumerador1 = new javax.swing.JTextField();
        txtDenominador1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtNumerador2 = new javax.swing.JTextField();
        txtDenominador2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtNumerador3 = new javax.swing.JTextField();
        txtNumerador4 = new javax.swing.JTextField();
        txtNumeroEntero = new javax.swing.JTextField();
        txtDenominador3 = new javax.swing.JTextField();
        cmdConvertirAMixto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel1.setText("Taller Objetos 1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        txtDenominador4.setEditable(false);
        jPanel1.add(txtDenominador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 60, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 80, 20));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Suma", "Resta", "Multiplicación", "División" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        txtNumerador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 60, -1));

        txtDenominador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 20));

        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 10, 40));

        txtNumerador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumerador2ActionPerformed(evt);
            }
        });
        txtNumerador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador2KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 60, -1));

        txtDenominador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador2KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 60, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 80, 20));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jLabel3.setText("Conversión a mixto:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 80, 20));

        txtNumerador3.setEditable(false);
        jPanel1.add(txtNumerador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 60, -1));

        txtNumerador4.setEditable(false);
        jPanel1.add(txtNumerador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 60, -1));

        txtNumeroEntero.setEditable(false);
        jPanel1.add(txtNumeroEntero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 60, -1));

        txtDenominador3.setEditable(false);
        jPanel1.add(txtDenominador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 60, -1));

        cmdConvertirAMixto.setText("Convertir A Mixto");
        cmdConvertirAMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConvertirAMixtoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdConvertirAMixto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(462, 321));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumerador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumerador2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumerador2ActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        int op, op2, n1, n2, d1, d2, n3, d3, n_Entero;
        Fraccionario f1, f2;
        
        if(txtNumerador1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el numerado 1", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumerador1.requestFocusInWindow();
        }
        else if(txtDenominador1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el denominador 1", "Error", JOptionPane.ERROR_MESSAGE);
            txtDenominador1.requestFocusInWindow();
        }    
        else if(txtNumerador2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el numerador 2", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumerador2.requestFocusInWindow();
        }
        else if(txtDenominador2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el denominador 2", "Error", JOptionPane.ERROR_MESSAGE);
            txtDenominador2.requestFocusInWindow();
        }
        else if(Integer.parseInt(txtDenominador1.getText().trim())==0){
            JOptionPane.showMessageDialog(this, "El denominador 1 no puede ser 0", "Error", JOptionPane.ERROR_MESSAGE);
            txtDenominador1.requestFocusInWindow();
            txtDenominador1.selectAll();
        }
        else if(Integer.parseInt(txtDenominador2.getText().trim())==0){
            JOptionPane.showMessageDialog(this, "El denominador 2 no puede ser 0", "Error", JOptionPane.ERROR_MESSAGE);
            txtDenominador2.requestFocusInWindow();
            txtDenominador2.selectAll();
        }
        else{
        try{
        op = cmbOperacion.getSelectedIndex();
        n1 = Integer.parseInt(txtNumerador1.getText());
        n2 = Integer.parseInt(txtNumerador2.getText());
        d1 = Integer.parseInt(txtDenominador1.getText());
        d2 = Integer.parseInt(txtDenominador2.getText());
        
        f1 = new Fraccionario(n1,d1);
        f2 = new Fraccionario(n2,d2);
        f3 = f1.operacion(f2, op);
        
        txtNumerador3.setText(""+f3.getNumerador());
        txtDenominador3.setText(""+f3.getDenominador());
        
        cmdCalcular.setEnabled(true);
        cmdConvertirAMixto.setEnabled(true);
        cmdBorrar.setEnabled(true);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
        }
        } 
        
        
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtDenominador1.setText("");
        txtDenominador2.setText("");
        txtDenominador3.setText("");
        txtDenominador4.setText("");
        txtNumerador1.setText("");
        txtNumerador2.setText("");
        txtNumerador3.setText("");
        txtNumerador4.setText("");
        txtNumeroEntero.setText("");
        txtNumerador1.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);
        cmdCalcular.setEnabled(true);
        cmdConvertirAMixto.setEnabled(false);
        cmdBorrar.setEnabled(true);
        
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdConvertirAMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConvertirAMixtoActionPerformed
        int numero_Entero;
        numero_Entero=f3.convertirMixto(f3);
        txtNumeroEntero.setText(""+numero_Entero);
        txtNumerador4.setText(""+f3.getNumerador());
        txtDenominador4.setText(""+f3.getDenominador());
        
        cmdCalcular.setEnabled(true);
        cmdConvertirAMixto.setEnabled(true);
        cmdBorrar.setEnabled(true);
        
        
    }//GEN-LAST:event_cmdConvertirAMixtoActionPerformed

    private void txtNumerador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador1KeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumerador1KeyTyped

    private void txtNumerador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador2KeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumerador2KeyTyped

    private void txtDenominador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador1KeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDenominador1KeyTyped

    private void txtDenominador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador2KeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDenominador2KeyTyped

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdConvertirAMixto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtDenominador1;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextField txtDenominador3;
    private javax.swing.JTextField txtDenominador4;
    private javax.swing.JTextField txtNumerador1;
    private javax.swing.JTextField txtNumerador2;
    private javax.swing.JTextField txtNumerador3;
    private javax.swing.JTextField txtNumerador4;
    private javax.swing.JTextField txtNumeroEntero;
    // End of variables declaration//GEN-END:variables
}
