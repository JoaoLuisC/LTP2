/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author marci
 */
public class ContaCorrente extends Conta{
   //METODOS
    @Override
    void atualiza(double taxa){
        deposita(getSaldo() * taxa*2);
    }
    
    @Override
    void deposita(double valor) {
        super.deposita(valor - 1);
    }
}
