/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1;

import javax.swing.JOptionPane;

/**
 *
 * @author mdspezia
 */
public class App {
    public App() {
        Cliente c = new Cliente("Mateus", "Aqui");
        ContaBancaria b = new ContaBancaria("1234", c, 0);
        ContaEspecial e = new ContaEspecial(100, "1234", c, 0);
        
        b.depositar(20);
        e.sacar(50);
        
        JOptionPane.showMessageDialog(null, e.getSaldo());
    }
    public static void main(String[] args) {
        new App();
    }
}
