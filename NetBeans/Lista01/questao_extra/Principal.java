/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_extra;

/**
 *
 * @author mdspezia
 */
public class Principal {
    public Principal() {
        Calculadora c1 = new Calculadora();
        
        c1.setNum1(5);
        c1.setNum2(10);
        System.out.println("Soma = " + c1.somar());
        c1.subtrair();
        System.out.println("Subtrair = " + c1.getResultado());
        c1.dividir();
        System.out.println("Dividir = " + c1.getResultado());
        System.out.println("Multiplicar = " + c1.multiplicar(5, 2));
    }
    public static void main(String[] args) {
        new Principal();
    }
}
