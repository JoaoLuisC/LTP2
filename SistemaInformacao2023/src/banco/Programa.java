package banco;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Conta minhaConta = new ContaCorrente(); // cria uma nova conta corrente
        
        //minhaConta.saldo = 5000; // define o saldo da conta diretamente (não recomendado)
        minhaConta.deposita(5000); // deposita um valor inicial na conta
        
        System.out.println("Digite um valor para depósito:");
        minhaConta.deposita(entrada.nextDouble()); // deposita o valor digitado pelo usuário
       
        System.out.println("Digite um valor para saque:");
        if(minhaConta.saca(entrada.nextDouble())==true){ // verifica se o saque foi bem sucedido
            System.out.println("Saque realizado com sucesso");
        }
        
        System.out.println("Digite um valor para saque:");
        minhaConta.saca(entrada.nextDouble()); // realiza um saque na conta
        
        System.out.println("Saldo minha conta: "+minhaConta.getSaldo()); // exibe o saldo atual da conta
              
    }
    
}