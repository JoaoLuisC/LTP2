package banco;

class TestaConta {
    public static void main(String[] args) {
        
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        c.atualiza(0.10);
        cc.atualiza(0.10);
        cp.atualiza(0.10);
        System.out.println(c.getSaldo());
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