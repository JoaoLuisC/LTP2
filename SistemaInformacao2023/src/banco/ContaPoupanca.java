package banco;

public class ContaPoupanca extends Conta{
    
    //METODOS
    @Override
    void atualiza(double taxa){
        deposita(this.getSaldo()*taxa*3);
    }
}
