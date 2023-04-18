package banco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TesteReferenciaCliente {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente();
                 
        c1.objCliente1.setNome("Paola Dias");
        System.out.println("Nome: "+c1.objCliente1.getNome());
  
        try {
            c1.deposita(50000);
        } catch (ValorInvalidoException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
    
}
