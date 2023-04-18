package banco;

import java.util.Scanner;

public class TesteTransfere {
    public static void main(String[] args) {
        Conta minhaConta = new ContaCorrente();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor para despósito:");
        minhaConta.deposita(entrada.nextDouble());
        
        Conta outraConta = new ContaCorrente();
        outraConta.deposita(5000);
        
        minhaConta.transfere(outraConta, 20000);
        System.out.println("Saldo minha conta:"+minhaConta.getSaldo());
        System.out.println("Saldo outra conta:"+outraConta.getSaldo());
    }
    
}
