package banco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ContaCorrente extends Conta implements Tributavel{
    
   //METODOS
    @Override
    void atualiza(double taxa){
        deposita(getSaldo() * taxa*2);
    }
    
    @Override
    public void deposita(double valor) {
        try {
            super.deposita(valor - 1.0);
        } catch (ValorInvalidoException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
    
    @Override
    public double calculaTributos(){
        return this.getSaldo() * 0.01;
    }
}
