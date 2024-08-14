/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author Mateus
 */
public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    
    
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Não é possível depositar valores negativos");
        }
        saldo = saldo + valor;
    }
    public void sacar(double valor) {
        if (valor < 0 || valor > saldo) {
            throw new IllegalArgumentException("Não é possível sacar valores negativos ou maiores do que o seu saldo");
        }
        saldo = saldo - valor;
    }
    public void transferir(double valor) {
        
    }
}
