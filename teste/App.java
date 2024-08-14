/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class App {
    public App() {
        ContaBancaria c = new ContaBancaria();
        Scanner sc = new Scanner(System.in);
        ContaBancaria[] contas = new ContaBancaria[2];
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o número da conta:");
            c.setNumero(sc.next());
            System.out.println("Digite o nome do titular da conta:");
            c.setTitular(sc.next());
            contas[i] = c;
        }
        for (int i = 1; i > 0;) {
            
            contas[i].depositar(i);
        }
    }
    
    
    public static void main(String[] args) {
        new App();
    }
}
