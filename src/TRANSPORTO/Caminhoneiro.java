package TRANSPORTO;

public class Caminhoneiro {
    
    private String nome;
    private String cpf;
    private String cnpj;
    private double salario;
    
    //CONSTRUTOR

    public Caminhoneiro(String nome, String cpf, String cnpj, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.salario = salario;
    }
        
    //GETTERS E SETTERS

    //NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //CPF
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    //CNPJ
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    //SALARIO
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
