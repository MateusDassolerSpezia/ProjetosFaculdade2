/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;

/**
 *
 * @author mdspezia
 */
public class NomeVazioException extends Exception {

    public NomeVazioException(String nome) {
        super(nome + "deve ser informado");
    }
}
