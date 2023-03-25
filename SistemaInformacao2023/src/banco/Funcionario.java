package banco;

public class Funcionario {

    // Declaração das variáveis de instância
    private String nomeFuncionario, departamento, dataEntrada, RG;
    private double salario;
    private boolean statusEmpresa;

    // Métodos getters e setters para cada variável de instância
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // Método para aumentar o salário do funcionário em um valor especificado
    public void bonifica(double aumento){
        this.salario = this.salario + aumento;
        // Equivalente a: this.salario += aumento;
    }
    
    // Método para demitir o funcionário, alterando seu status para inativo
    public void demite(){
        this.statusEmpresa = false;
    }
    
    // Método para imprimir informações do funcionário na saída padrão
    public void mostra(){
        System.out.println("Nome: " + nomeFuncionario);
        System.out.println("Departamento: " + departamento);
        System.out.println("Data entrada: " + dataEntrada);
        System.out.println("RG: " + RG);
        System.out.println("Salário: " + salario);
        System.out.println("Status: " + (statusEmpresa == true ? "Ativo" : "Inativo"));
        // Operador ternário usado para imprimir "Ativo" ou "Inativo" dependendo do valor de statusEmpresa
   }
}