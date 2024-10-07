/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Mateus
 */
public class Imovel {
    
    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;

    public Imovel(Bairro bairro, Finalidade finalidade, String endereco, int area) {
        setEndereco(endereco);
        setArea(area);
        setBairro(bairro);
        setFinalidade(finalidade);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }
    
    public double calcularIptu() {
        return area; //
    }
}
