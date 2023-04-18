package banco;

public class Gerente extends Funcionario{
    
    private int senha = 2005;
    private int numeroDeFuncionariosGerenciados;

    //GETTERS E SETTERS
     
    //SENHA
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    //NUMERO DE FUNC. GERENCIADOS
    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }
    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
     
    //METODOS
    
    @Override
    public double getBonificacao(){
        return super.getBonificacao() + 1000;
    }
    
    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido!");
            return true;
        } else{
            System.out.println("Acesso Negado!");
            return false;
        }
    }
}
