/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_1;

/**
 *
 * @author mdspezia
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public void setNome(String nome) {
        if (nome == null || nome.trim().equals("")) {
            throw new IllegalArgumentException("Nome do funcionario não pode ser vazio");
        }
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    
    public void setSalario(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("Salario não pode ser igual ou menor que 0");
        }
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    
    public double calcularIrpf() {
        if (salario >= 1903.99 && salario <= 2826.65) {
        
    }
        return salario;
    }
}
