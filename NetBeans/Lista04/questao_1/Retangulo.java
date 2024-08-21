/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_1;

/**
 *
 * @author mdspezia
 */
public class Retangulo {
    
    private int altura;
    private int comprimento;
    
    public Retangulo() {
    }
    public Retangulo(int altura, int comprimento) {
        
    }
    
    public void setAltura(int altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que 0");
        }
        this.altura = altura;
    }
    public int getAltura() {
        return altura;
    }
    
    public int getComprimento() {
        return comprimento;
    }
    public void setComprimento(int comprimento) {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("Comprimento deve ser maior que 0");
        }
        this.comprimento = comprimento;
    }
    
    public int calcularPerimetro() {
    
    }
    public int calcularArea() {
        
    }
}
