package banco;

public class AtualizadorDeContas {
    
    private double saldoTotal = 0;
    private double selic;
    
    //CONSTRUTOR

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    
    //GETTERS E SETTERS
    
    //SALDO TOTAL
    public double getSaldoTotal() {
        return saldoTotal;
    }
    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
    //SELIC
    public double getSelic() {
        return selic;
    }
    public void setSelic(double selic) {
        this.selic = selic;
    }
    
    //METODOS
    
    void roda(Conta c){
        System.out.println("\nSaldo Anterior: R$" + c.getSaldo());
        c.atualiza(selic);
        System.out.println("Saldo Atual: R$" + c.getSaldo());
        this.saldoTotal = this.saldoTotal + c.getSaldo();
    }
    
}
