package banco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ContaPoupanca extends Conta{
    
    //METODOS
    @Override
    void atualiza(double taxa){
        try {
            deposita(this.getSaldo()*taxa*3);
        } catch (ValorInvalidoException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}
