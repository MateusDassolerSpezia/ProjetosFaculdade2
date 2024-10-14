/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import java.text.DecimalFormat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import questao1.Cliente;
import questao1.ContaEspecial;

/**
 *
 * @author Mateus
 */
public class ContaEspecialTest {
    
    private static ContaEspecial ce;
    private static Cliente c;
    private static DecimalFormat df;
    
    @BeforeAll
    public static void setUpClass() {
        ce = new ContaEspecial(0, "1234", c, 0);
        df = new DecimalFormat("0.00");
    }
    
    @Test
    public void caso1() {
        ce.setLimiteCredito(100);
        ce.depositar(20);
        ce.sacar(50);
        assertEquals("-30,00", df.format(ce.getSaldo()));
    }
    
    @Test
    public void caso2() {
        ce.setLimiteCredito(100);
        ce.depositar(20);
        ce.sacar(120);
        assertEquals("-100,00", df.format(ce.getSaldo()));
    }
    
    @Test
    public void caso3() throws Exception {
        ce.setLimiteCredito(100);
        ce.depositar(20);
        ce.sacar(120.01);
    }
}
