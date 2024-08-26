/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_1;



/**
 *
 * @author Mateus
 */
public class Retangulo {
    private int altura;
    private int comprimento;
    
    public Retangulo() throws IllegalArgumentException {
        setAltura(0);
        setComprimento(0);
    }
    public Retangulo(int comprimento, int altura) throws IllegalArgumentException {
        setComprimento(comprimento);
        setAltura(altura);
    }
    
    public void setAltura(int altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor incorreto para a altura: " + getAltura());
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
            throw new IllegalArgumentException("Valor incorreto para o comprimento: " + getComprimento());
        }
        this.comprimento = comprimento;
    }
    
    public int calcularPerimetro() {
        return (2 * comprimento) + (2 * altura);
    }
    public int calcularArea() {
        return comprimento * altura;
    }
}
