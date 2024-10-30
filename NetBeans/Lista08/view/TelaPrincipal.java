/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.Professor;
import model.Titulacao;
import model.Turma;
import model.Turno;

/**
 *
 * @author lpa
 */
public class TelaPrincipal extends javax.swing.JFrame {

    protected Turma turma;

    /**
     * Creates new form Tela
     */
    public TelaPrincipal() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jrbGraduacao = new javax.swing.JRadioButton();
        jrbMestrado = new javax.swing.JRadioButton();
        jrbDoutorado = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfDisciplina = new javax.swing.JTextField();
        jrbMatutino = new javax.swing.JRadioButton();
        jrbVespertino = new javax.swing.JRadioButton();
        jrbNoturno = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbtIncluir = new javax.swing.JButton();
        jbtListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Professor"));
        jPanel1.setPreferredSize(new java.awt.Dimension(502, 300));

        jLabel3.setText("Nome:");

        jLabel4.setText("E-mail:");

        jLabel5.setText("Titulação:");

        buttonGroup2.add(jrbGraduacao);
        jrbGraduacao.setText("Graduação");

        buttonGroup2.add(jrbMestrado);
        jrbMestrado.setText("Mestrado");

        buttonGroup2.add(jrbDoutorado);
        jrbDoutorado.setText("Doutorado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jrbGraduacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbMestrado)
                        .addGap(18, 18, 18)
                        .addComponent(jrbDoutorado))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtfEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                        .addComponent(jtfNome, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jrbGraduacao)
                    .addComponent(jrbMestrado)
                    .addComponent(jrbDoutorado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Turma"));

        jLabel1.setText("Disciplina:");

        jLabel2.setText("Turno:");

        buttonGroup1.add(jrbMatutino);
        jrbMatutino.setText("Matutino");

        buttonGroup1.add(jrbVespertino);
        jrbVespertino.setText("Vespertino");

        buttonGroup1.add(jrbNoturno);
        jrbNoturno.setText("Noturno");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrbMatutino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbVespertino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbNoturno))
                    .addComponent(jtfDisciplina))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jrbMatutino)
                    .addComponent(jrbVespertino)
                    .addComponent(jrbNoturno))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setPreferredSize(new java.awt.Dimension(502, 50));

        jbtIncluir.setText("Incluir Aluno");
        jbtIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtIncluirActionPerformed(evt);
            }
        });

        jbtListar.setText("Listar dados da turma");
        jbtListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtListar)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtIncluir)
                    .addComponent(jbtListar))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Turno getTurno() {
        Turno turno = null;
        if (jrbMatutino.isSelected()) {
            turno = Turno.MATUTINO;
        } else if (jrbVespertino.isSelected()) {
            turno = Turno.VESPERTINO;
        } else if (jrbNoturno.isSelected()) {
            turno = Turno.NOTURNO;
        }
        return turno;
    }

    private Titulacao getTitulacao() {
        if (jrbGraduacao.isSelected()) {
            return Titulacao.GRADUACAO;
        }
        if (jrbMestrado.isSelected()) {
            return Titulacao.MESTRADO;
        }
        return Titulacao.DOUTORADO;
    }
    private void jbtIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtIncluirActionPerformed
        if (turma == null) {
            turma = new Turma(jtfDisciplina.getText(), new Professor(jtfNome.getText(), jtfEmail.getText(), getTitulacao()), getTurno());
        }

        TelaAluno telaAluno = new TelaAluno(this);
        telaAluno.setVisible(true);
    }//GEN-LAST:event_jbtIncluirActionPerformed

    //private Relatorio telaRelatorio;
    
    private void jbtListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtListarActionPerformed
        //if (telaRelatorio == null) {
        TelaRelatorio telaRelatorio = new TelaRelatorio(this);
        //}
        telaRelatorio.setVisible(true);
    }//GEN-LAST:event_jbtListarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LocalDate data = LocalDate.now();
        int dia = data.getDayOfMonth();
        int mes = data.getMonthValue();
        int ano = data.getYear();
        
        String dataCompleta = dia + "/" + mes + "/" + ano;
        JOptionPane.showMessageDialog(this, dataCompleta );
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtIncluir;
    private javax.swing.JButton jbtListar;
    private javax.swing.JRadioButton jrbDoutorado;
    private javax.swing.JRadioButton jrbGraduacao;
    private javax.swing.JRadioButton jrbMatutino;
    private javax.swing.JRadioButton jrbMestrado;
    private javax.swing.JRadioButton jrbNoturno;
    private javax.swing.JRadioButton jrbVespertino;
    private javax.swing.JTextField jtfDisciplina;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}