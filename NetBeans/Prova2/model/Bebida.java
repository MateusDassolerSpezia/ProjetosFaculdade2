/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author Mateus Dassoler Spezia
 */
public class Bebida extends Item {

    public Bebida(String nome, float valor, String tipoItem) {
        super(nome, valor, tipoItem);
    }

    @Override
    public String imprimirItem() {
       return ("O valor da " + super.getNome() + " é R$ " + super.getValor()); 
    }
}
