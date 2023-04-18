package banco;

public class TesteReferencia02 {
    public static void main(String[] args) {
        Conta minhaConta = new ContaCorrente();
        Cliente cliPedro = new Cliente();
        minhaConta.objCliente2 = cliPedro;
        minhaConta.objCliente2.setNome("Pedro");
        System.out.println("Cliente: "+minhaConta.objCliente2.getNome());
    }
    
}
