package banco;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Conta minhaConta = new ContaCorrente(); // cria uma nova conta corrente
        try {
            //minhaConta.saldo = 5000; // define o saldo da conta diretamente (não recomendado)
            minhaConta.deposita(5000); // deposita um valor inicial na conta
        } catch (ValorInvalidoException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        
        System.out.println("Digite um valor para depósito:");
        try {
            minhaConta.deposita(entrada.nextDouble()); // deposita o valor digitado pelo usuário
        } catch (ValorInvalidoException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
       
        System.out.println("Digite um valor para saque:");
        if(minhaConta.saca(entrada.nextDouble())==true){ // verifica se o saque foi bem sucedido
            System.out.println("Saque realizado com sucesso");
        }
        
        System.out.println("Digite um valor para saque:");
        minhaConta.saca(entrada.nextDouble()); // realiza um saque na conta
        
        System.out.println("Saldo minha conta: "+minhaConta.getSaldo()); // exibe o saldo atual da conta
              
    }
    
}