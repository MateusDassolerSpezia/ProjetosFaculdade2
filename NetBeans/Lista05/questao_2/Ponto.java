/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_2;


/**
 *
 * @author Mateus
 */
public class Ponto {
    private int x;
    private int y;
    
    public Ponto() {
        x = 0;
        y = 0;
    }
    public Ponto(int x, int y) {
        setX(x);
        setY(y);
    }
    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    public Quadrante identificarQuadrante() {
        if (x == 0 || y == 0) {
            return Quadrante.NENHUM;
        } else if (x > 0 && y > 0) {
            return Quadrante.PRIMEIRO;
        } else if (x < 0 && y > 0) {
            return Quadrante.SEGUNDO;
        } else if (x < 0 && y < 0) {
            return Quadrante.TERCEIRO;
        } else if (x > 0 && y < 0) {
            return Quadrante.QUARTO;
        }
        return null;
    }
    
    public boolean estaIncidindoSobreX() {
        if (x == 0) {
            return true;
        }
        return false;
    }
    
    public boolean estaIncidindoSobreY() {
        if (y == 0) {
            return true;
        }
        return false;
    }
    
    public double calcularDistancia(Ponto outroPonto) {
        return Math.sqrt((Math.pow(outroPonto.x, 2) - Math.pow(this.x, 2)) + (Math.pow(outroPonto.y, 2) - Math.pow(this.y, 2)));
    }
    
    /*public double calcularDistancia(Ponto p1, Ponto p2) {
        
    }*/
}
