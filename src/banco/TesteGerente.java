package banco;

public class TesteGerente {
    public static void main(String[] args) {
        
        Gerente objGerente = new Gerente();
        Funcionario objFuncionario = new Funcionario();
        
        objFuncionario.setSalario(5000);
        objGerente.setSalario(5000);
        
        objGerente.setNomeFuncionario("Marcos");
        System.out.println("Nome Gerente: " + objGerente.getNomeFuncionario());
        System.out.println("Bonificacao Gerente: R$" + objGerente.getBonificacao());
        objGerente.autentica(2005);
        
        objFuncionario.setNomeFuncionario("Lucas");
        System.out.println("\nNome Funcionario: " + objFuncionario.getNomeFuncionario());
        System.out.println("Bonificacao Funcionario: R$" + objFuncionario.getBonificacao());
        objGerente.autentica(2003);
    }
}
