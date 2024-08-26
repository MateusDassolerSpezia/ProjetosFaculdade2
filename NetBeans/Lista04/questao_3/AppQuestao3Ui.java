/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class AppQuestao3Ui {

    public AppQuestao3Ui() {
        //Retangulo ret = new Retangulo3();

        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Comprimento: "));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Altura: "));
        Retangulo3 ret = new Retangulo3(comprimento, altura);

        JOptionPane.showMessageDialog(null, "Perímetro: " + ret.calcularPerimetro() + " cm" + "\nÁrea: " + ret.calcularArea() + " cm²");
    }

    public static void main(String[] args) {
        new AppQuestao3Ui();
    }
}
