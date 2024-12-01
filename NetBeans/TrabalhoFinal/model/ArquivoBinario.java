/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Mateus
 */
import java.io.*;
//import static java.lang.System.in;
import java.nio.file.*;

public class ArquivoBinario {

    // Salvar o arquivo com extensão .poo
    public void salvar(String caminho, Serializacao s) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caminho))) {
            oos.writeObject(s);
        }
    }

    // Carregar o arquivo .poo
    public Serializacao abrir(String caminho) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminho))) {
            return (Serializacao) ois.readObject();
        }
    }

    // Verificar se o arquivo existe
    public static boolean existeArquivo(String caminho) {
        return Files.exists(Paths.get(caminho));
    }
}
