package banco;

public class TesteDeposita {
    public static void main(String[] args) {
        
        Conta cp = new ContaPoupanca();
        
        try{
            cp.deposita(-20);
        }catch(ValorInvalidoException e){
            System.out.println("ERRO: " + e.getMessage());
        }

    }
}
/*

O QUE ACONTECE?

R: O progama para e imprime o erro e para se não houver um tratamento com o erro;

*/