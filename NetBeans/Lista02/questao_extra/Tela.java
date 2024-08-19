/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package questao_extra;

import javax.swing.JFrame;

/**
 *
 * @author mdspezia
 */
public class Tela extends JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
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

        jLabel1 = new javax.swing.JLabel();
        jtfNumeroConta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jftTitular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfValor = new javax.swing.JTextField();
        jbtCriarConta = new javax.swing.JButton();
        jbtDepositar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conta Bancaria");
        getContentPane().setLayout(new java.awt.FlowLayout());

        jLabel1.setText("Número conta");
        getContentPane().add(jLabel1);

        jtfNumeroConta.setPreferredSize(new java.awt.Dimension(80, 22));
        getContentPane().add(jtfNumeroConta);

        jLabel2.setText("Titular");
        getContentPane().add(jLabel2);

        jftTitular.setPreferredSize(new java.awt.Dimension(80, 22));
        getContentPane().add(jftTitular);

        jLabel3.setText("Valor");
        getContentPane().add(jLabel3);

        jtfValor.setPreferredSize(new java.awt.Dimension(80, 22));
        getContentPane().add(jtfValor);

        jbtCriarConta.setText("Criar conta");
        jbtCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCriarContaActionPerformed(evt);
            }
        });
        getContentPane().add(jbtCriarConta);

        jbtDepositar.setText("Depositar");
        getContentPane().add(jbtDepositar);

        jLabel4.setText("Saldo");
        getContentPane().add(jLabel4);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCriarContaActionPerformed
        
    }//GEN-LAST:event_jbtCriarContaActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtCriarConta;
    private javax.swing.JButton jbtDepositar;
    private javax.swing.JTextField jftTitular;
    private javax.swing.JTextField jtfNumeroConta;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}
