
import Entities.ContaCorrente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jurandir Lima Junior
 */
public class ContaTerminal {

    public static void main(String[] args) {
        
        
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = System.console().readLine();
        System.out.println("Por favor, digite o número da Conta !");
        int numero = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = System.console().readLine();
        System.out.println("Por favor, digite o saldo da Conta !");
        Double saldo = Double.parseDouble(System.console().readLine());

        ContaCorrente conta = new ContaCorrente(numero, agencia, nomeCliente, saldo);

        System.out.println("Olá " + conta.getNomeCliente() + ", obirgago por abrir sua conta em nosso banco, sua Agência é: " + conta.getAgencia() + " e o número da sua conta é: " + conta.getNumero() + " e seu saldo é: " + conta.getSaldo());       

    }

}
