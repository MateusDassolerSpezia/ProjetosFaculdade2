/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Professor;
import model.Turma;

/**
 *
 * @author lpa
 */
public class TelaRelatorio extends javax.swing.JFrame {

    private TelaPrincipal tela;
    /**
     * Creates new form Relatorio
     */
    public TelaRelatorio(TelaPrincipal tela) {
        this.tela = tela;
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
        jtaTexto = new javax.swing.JTextArea();
        jbtFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jtaTexto.setColumns(20);
        jtaTexto.setRows(5);
        jtaTexto.setPreferredSize(new java.awt.Dimension(232, 250));
        jScrollPane1.setViewportView(jtaTexto);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jbtFechar.setText("Fechar");
        jbtFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jbtFechar, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFecharActionPerformed
        //Para o texto não acumular, usar dessa forma:
        this.dispose();
        
        //Para acumular o texto, usar dessa forma:
        //this.setVisible(false);
    }//GEN-LAST:event_jbtFecharActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Turma turmaLocal = tela.turma;
        
        jtaTexto.append("Disciplina: " + turmaLocal.getDisciplina() + "\n");
        jtaTexto.append("Turno: " + turmaLocal.getTurno().toString() + "\n");
        jtaTexto.append("-------------------------\n");
        
        Professor p = turmaLocal.getProfessorTurma();        
        jtaTexto.append("Professor: " + p.getNome() + "\n");
        jtaTexto.append("Titulação: " + p.getTitulacao().toString() + "\n");
        
        jtaTexto.append("-------------------------\n");
        
        ArrayList<Aluno> alunos = turmaLocal.getAlunos();
        jtaTexto.append("Total de alunos: " + alunos.size() + "\n");
        for (Aluno a: alunos) {
            jtaTexto.append(a.getNome() + " " + a.getMatricula() + 
                    " - Nota ENEM: " + a.getNotaEnem() + "\n");
        }
        
        Aluno melhorAluno = turmaLocal.obterAlunoMelhorNotaEnem();
        jtaTexto.append("Aluno(a) com a melhor nota: " + 
                melhorAluno.getNome() + " - (" + melhorAluno.getNotaEnem() + ")");
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //formWindowOpened(evt);
    }//GEN-LAST:event_formWindowActivated

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtFechar;
    private javax.swing.JTextArea jtaTexto;
    // End of variables declaration//GEN-END:variables
}