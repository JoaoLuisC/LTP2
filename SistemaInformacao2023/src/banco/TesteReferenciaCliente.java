package banco;

public class TesteReferenciaCliente {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente();
                 
        c1.objCliente1.setNome("Paola Dias");
        System.out.println("Nome: "+c1.objCliente1.getNome());
  
        c1.deposita(50000);
    }
    
}
