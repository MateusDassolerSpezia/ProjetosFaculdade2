/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.ArquivoBinario;
import model.EditorTexto;

/**
 *
 * @author vinoneda
 */
public class BlocoNotas extends javax.swing.JFrame {

    public EditorTexto editor;
    public ArquivoBinario arquivo;
    /**
     * Creates new form BlocoNotas
     */
    public BlocoNotas() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiAbrir = new javax.swing.JMenuItem();
        jmiSalvar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiFontePadrao = new javax.swing.JMenuItem();
        jmiNegrito = new javax.swing.JMenuItem();
        jmiItalico = new javax.swing.JMenuItem();
        jmiSublinhado = new javax.swing.JMenuItem();
        jmiCorTexto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiAlinharEsquerda = new javax.swing.JMenuItem();
        jmiAlinharCentro = new javax.swing.JMenuItem();
        jmiAlinharDireita = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor de Texto");
        setBackground(new java.awt.Color(51, 51, 51));

        jEditorPane1.setForeground(new java.awt.Color(255, 255, 255));
        jEditorPane1.setPreferredSize(new java.awt.Dimension(574, 595));
        jScrollPane1.setViewportView(jEditorPane1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Arquivo");

        jmiAbrir.setText("Abrir...");
        jmiAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAbrir);

        jmiSalvar.setText("Salvar Como...");
        jmiSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalvarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSalvar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Estilo");

        jmiFontePadrao.setText("Fonte Padrão");
        jmiFontePadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFontePadraoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiFontePadrao);

        jmiNegrito.setText("Negrito");
        jmiNegrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNegritoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiNegrito);

        jmiItalico.setText("Itálico");
        jmiItalico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiItalicoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiItalico);

        jmiSublinhado.setText("Sublinhado");
        jmiSublinhado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSublinhadoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiSublinhado);

        jmiCorTexto.setText("Cor de Texto");
        jmiCorTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCorTextoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiCorTexto);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Alinhar");

        jmiAlinharEsquerda.setText("Alinhar a Esquerda");
        jmiAlinharEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlinharEsquerdaActionPerformed(evt);
            }
        });
        jMenu3.add(jmiAlinharEsquerda);

        jmiAlinharCentro.setText("Alinhar ao Centro");
        jmiAlinharCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlinharCentroActionPerformed(evt);
            }
        });
        jMenu3.add(jmiAlinharCentro);

        jmiAlinharDireita.setText("Alinhar à Direita");
        jmiAlinharDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlinharDireitaActionPerformed(evt);
            }
        });
        jMenu3.add(jmiAlinharDireita);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sobre");

        jmiSobre.setText("Créditos");
        jmiSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSobreActionPerformed(evt);
            }
        });
        jMenu4.add(jmiSobre);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiAbrirActionPerformed

    private void jmiSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalvarActionPerformed

    }//GEN-LAST:event_jmiSalvarActionPerformed

    private void jmiFontePadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFontePadraoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiFontePadraoActionPerformed

    private void jmiNegritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNegritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiNegritoActionPerformed

    private void jmiItalicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiItalicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiItalicoActionPerformed

    private void jmiSublinhadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSublinhadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiSublinhadoActionPerformed

    private void jmiCorTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCorTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiCorTextoActionPerformed

    private void jmiAlinharEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlinharEsquerdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiAlinharEsquerdaActionPerformed

    private void jmiAlinharCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlinharCentroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiAlinharCentroActionPerformed

    private void jmiAlinharDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlinharDireitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiAlinharDireitaActionPerformed

    private void jmiSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiSobreActionPerformed

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
            java.util.logging.Logger.getLogger(BlocoNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlocoNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlocoNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlocoNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlocoNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmiAbrir;
    private javax.swing.JMenuItem jmiAlinharCentro;
    private javax.swing.JMenuItem jmiAlinharDireita;
    private javax.swing.JMenuItem jmiAlinharEsquerda;
    private javax.swing.JMenuItem jmiCorTexto;
    private javax.swing.JMenuItem jmiFontePadrao;
    private javax.swing.JMenuItem jmiItalico;
    private javax.swing.JMenuItem jmiNegrito;
    private javax.swing.JMenuItem jmiSalvar;
    private javax.swing.JMenuItem jmiSobre;
    private javax.swing.JMenuItem jmiSublinhado;
    // End of variables declaration//GEN-END:variables
}