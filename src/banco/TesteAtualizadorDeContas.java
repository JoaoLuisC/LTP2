package banco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TesteAtualizadorDeContas {
    
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        try {
            cc.deposita(1000);
        } catch (ValorInvalidoException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        try {
            cp.deposita(1000);
        } catch (ValorInvalidoException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        
        AtualizadorDeContas adc = new AtualizadorDeContas(0.10);
        adc.roda(cc);
        adc.roda(cp);
        
        System.out.println("\nSaldo Total: R$" + adc.getSaldoTotal());
        
    }
    
}
