/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Mateus
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario) throws IllegalArgumentException {
        setNome(nome);
        setSalario(salario);
    }

    public void setNome(String nome) throws IllegalArgumentException{
        if (nome == null || nome.trim().equals("")) {
            throw new IllegalArgumentException("Nome do funcionario não pode ser vazio");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) throws IllegalArgumentException{
        if (salario <= 0) {
            throw new IllegalArgumentException("Salario nao pode ser igual ou menor que 0");
        }
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularIrpf() {
        if (salario <= 1903.98) {
            salario -= salario;
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            salario = (salario - 1903.98) * 0.075;
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            salario = (salario - 2826.65) * 0.15 + 69.20;
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            salario = (salario - 3751.05) * 0.225 + 138.65 + 69.20;
        } else if (salario >= 4664.69) {
            salario = (salario - 4664.68) * 0.275 + 205.56 + 138.65 + 69.20;
        }
        return salario;
    }
    
    public FaixaIrpf identificarFaixaIrpf() {
        if (salario <= 1903.98) {
            return FaixaIrpf.PRIMEIRA;
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            return FaixaIrpf.SEGUNDA;
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            return FaixaIrpf.TERCEIRA;
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            return FaixaIrpf.QUARTA;
        } else if (salario >= 4664.69) {
            return FaixaIrpf.QUINTA;
        }
        return null;
    }
}