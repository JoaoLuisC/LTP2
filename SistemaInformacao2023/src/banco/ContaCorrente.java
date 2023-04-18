package banco;

public class ContaCorrente extends Conta implements Tributavel{
    
   //METODOS
    @Override
    void atualiza(double taxa){
        deposita(getSaldo() * taxa*2);
    }
    
    @Override
    void deposita(double valor) {
        super.deposita(valor - 1.0);
    }
    
    @Override
    public double calculaTributos(){
        return this.getSaldo() * 0.01;
    }
}
