/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Mateus
 */
public class Turma {
    
    private String disciplina;
    private Professor professor;
    private Turno turno;
    private ArrayList<Aluno> alunos;

    public Turma(String disciplina, Professor professor, Turno turno) {
        setDisciplina(disciplina);
        setProfessor(professor);
        setTurno(turno);
        alunos = new ArrayList();
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void incluirAluno(Aluno aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno inválido");
        }
        alunos.add(aluno);
    }
    
    public void removerAluno(Aluno aluno, int nrAluno) {
        Aluno alunoRemover = null;
        
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getMatricula() == nrAluno) {
                alunoRemover = alunos.get(i);
                break;
            }
        }
        if (alunoRemover != null) {
            alunos.remove(alunoRemover);
        }
        //return alunoRemover;
    }
    
    public Aluno obterAlunoMelhorNotaEnem() {
        double valorMaior = 0;
        Aluno notaMaior = null;
        
        for (int i = 0; i < alunos.size(); i++) {
            if (valorMaior < alunos.get(i).getNotaEnem()) {
                valorMaior = alunos.get(i).getNotaEnem();
                notaMaior = alunos.get(i);
            }
        }
        return notaMaior;
    }
}
