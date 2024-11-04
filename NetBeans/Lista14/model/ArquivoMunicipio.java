/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mdspezia
 */
public class ArquivoMunicipio {
    
    //private String nomeArquivo;
    
    public ArquivoMunicipio() throws FileNotFoundException {
    /*Scanner arqTexto = new Scanner(new File("Este Computador\\Downloads\\municipios (Lista14)"));
    while (arqTexto.hasNext()) {
    System.out.println(arqTexto.nextLine());
}*/
    //setNomeArquivo(nomeArquivo);
    
    File arquivo = new File("L14_municipios.csv");
    Scanner sc = new Scanner(arquivo, "UTF-8");
    
    while (sc.hasNext ()) {
    System.out.println(sc.nextLine());
    }
    
}

    
    public static void main(String[] args) throws FileNotFoundException {
        new ArquivoMunicipio();
    }
}
