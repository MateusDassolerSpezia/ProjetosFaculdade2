/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class AppQuestao2Ui {

    public AppQuestao2Ui() {
        //Retangulo ret = new Retangulo2();

        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Comprimento (em cm): "));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Altura (em cm): "));
        Retangulo2 ret = new Retangulo2();

        JOptionPane.showMessageDialog(null, "Perímetro: " + ret.calcularPerimetro() + " cm" + "\nÁrea: " + ret.calcularArea() + " cm²");
    }

    public static void main(String[] args) {
        new AppQuestao2Ui();
    }
}
