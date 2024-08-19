/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_extra;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class App {

    public App() {
        try (Scanner sc = new Scanner(System.in)) {
            int opcao;
            int conta = 0;
            ContaBancaria[] contas = new ContaBancaria[10];
            ContaBancaria c = new ContaBancaria();
            do {
                System.out.println("Escolha uma opcao:\n1- Criar conta bancaria\n2- Sacar\n3- Depositar\n4- transferir\n5- Sair");
                System.out.print("Opcao escolhida: ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1 -> {
                        System.out.print("Numero: ");
                        c.setNumero(sc.next());
                        System.out.print("Titular: ");
                        c.setTitular(sc.next());
                        contas[conta] = c;
                        conta++;
                        break;
                    }
                    case 2 -> {
                        System.out.print("Digite o numero da conta: ");
                        
                        System.out.println("Digite o valor de saque:");
                        double saque = sc.nextDouble();
                        c.sacar(saque);
                        break;
                    }
                    case 3 -> {
                        System.out.print("Digite o numero da conta: ");
                        
                        System.out.println("Digite o valor de deposito:");
                        double deposito = sc.nextDouble();
                        c.depositar(deposito);
                        break;
                    }
                    case 4 -> {
                        System.out.print("Digite o numero da conta: ");
                        
                        System.out.println("Digite o valor de transferencia:");
                        double transferencia = sc.nextDouble();
                        c.transferir(c, transferencia);
                        break;
                    }
                }
            } while (opcao != 5);
            /*
            System.out.print("Numero: ");
            String numero = sc.next();
            System.out.print("Titular: ");
            String titular = sc.next();
            
            ContaBancaria c1 = new ContaBancaria();
            c1.setNumero(numero);
            c1.setTitular(titular);
            
            
            System.out.print("Numero: ");
            numero = sc.next();
            System.out.print("Titular: ");
            titular = sc.next();
            
            ContaBancaria c2 = new ContaBancaria();
            c2.setNumero(numero);
            c2.setTitular(titular);
            
            c1.depositar(1000);
            System.out.println("C1: Saldo R$ " + c1.getSaldo());
            c1.depositar(700);
            System.out.println("C1: Saldo R$ " + c1.getSaldo());
            
            c2.depositar(5000);
            System.out.println("C2: Saldo R$ " + c2.getSaldo());
            
            c2.sacar(3000);
            System.out.println("C2: Saldo R$ " + c2.getSaldo());
            
            c2.transferir(c1, 1800);
            
            System.out.println("");
            System.out.println("C1: " + c1.getNumero());
            System.out.println("Titular: " + c1.getTitular());
            System.out.println("Saldo: R$ " + c1.getSaldo());
            System.out.println("");
            System.out.println("C2: " + c2.getNumero());
            System.out.println("Titular: " + c2.getTitular());
            System.out.println("Saldo: R$ " + c2.getSaldo());*/
        }
    }

    public static void main(String[] args) {
        new App();
    }
}
