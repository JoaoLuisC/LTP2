package banco;

import java.util.logging.Level;
import java.util.logging.Logger;

class TesteContas {
    public static void main(String[] args) {
        
        //CONTAS
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        //DEPOSITA
        cc.deposita(1000);
        try {
            cp.deposita(1000);
        } catch (ValorInvalidoException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        
        //ATUALIZA
        cc.atualiza(0.10);
        cp.atualiza(0.10);
        
        //SOUT
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

    }
}
/*

***APÓS IMPRIMIR O SALDO (GETSALDO()) DE CADA UMA DAS CONTAS, O QUE ACONTECE?***

RESPOSTA:

Após imprimir os saldos, é possível notar que cada saldo possui um valor 
diferente, pois as classes filhas de saldo são distintas. Isso ocorre porque 
cada classe filha pode ter sua própria implementação de como calcular o saldo, 
resultando em valores diferentes para cada uma delas.

*/