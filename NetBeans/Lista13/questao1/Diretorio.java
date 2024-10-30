/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1;

import java.io.File;

/**
 *
 * @author mdspezia
 */
public class Diretorio {

    private String nomeDiretorio;
    private int tamanho;

    public Diretorio(String nomeDiretorio) throws Exception {
        setNomeDiretorio(nomeDiretorio);
        File diretorio = new File(nomeDiretorio);
        if (!diretorio.isDirectory()) {
            throw new Exception("Diretório inexistente");
        }
        
    }

    public void setNomeDiretorio(String nomeDiretorio) throws Exception {
        if (nomeDiretorio.isBlank()) {
            throw new Exception("Nome deve ser informado");
        }
        this.nomeDiretorio = nomeDiretorio;
    }

    public int informacoes(File diretorio) throws Exception {
        
        
        //String info = "";
        //File diretorio = new File(nomeDiretorio);
        
        //if (!diretorio.isDirectory()) {
        //    throw new Exception("Diretório inexistente");
        //}
        //return info;

        File[] conteudoDiretorio = diretorio.listFiles();
        for (File item : conteudoDiretorio) {
            if (item.isDirectory()) {
                /*diretorio = item;
                conteudoDiretorio = diretorio.listFiles();
                for (File item2 : conteudoDiretorio) {
                    if (item2.isDirectory()) {

                    } else {
                        tamanho += item2.length();
                    }
                }*/
                System.out.println(item.getName());
                informacoes(item);
            } else {
                System.out.println(item.getName());
                tamanho += item.length();
            }
        }
        return tamanho;
    }

}
