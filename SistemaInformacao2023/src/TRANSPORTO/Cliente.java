package TRANSPORTO;

public class Cliente {
    
    private String nome;
    private String CPF;
    private String RG;
    
    Caminhoneiro c1;
    Viagem viagem1;
    Carreta carreta1;

    //CONSTRUTOR
    public Cliente(String nome, Caminhoneiro c1, Viagem viagem1, Carreta carreta1) {
        this.nome = nome;
        this.c1 = c1;
        this.viagem1 = viagem1;
        this.carreta1 = carreta1;
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
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    //RG
    public String getRG() {
        return RG;
    }
    public void setRG(String RG) {
        this.RG = RG;
    }
    //CAMINHONEIRO
    public Caminhoneiro getC1() {
        return c1;
    }
    public void setC1(Caminhoneiro c1) {
        this.c1 = c1;
    }
    //VIAGEM
    public Viagem getViagem1() {
        return viagem1;
    }
    public void setViagem1(Viagem viagem1) {
        this.viagem1 = viagem1;
    }
    //CARRETA
    public Carreta getCarreta1() {
        return carreta1;
    }
    public void setCarreta1(Carreta carreta1) {
        this.carreta1 = carreta1;
    }
    
    //METODOS
    
    void visualizarViagem(){
        
        System.out.println("Cliente: " + this.nome);
        System.out.println("Motorista: " + this.c1.getNome());
        System.out.println("Veiculo: " + this.carreta1.getModelo());
        System.out.println("Destino: " + this.viagem1.getDestino());
        System.out.println("Valor Km: "+ this.viagem1.getValorKM());
        System.out.println("Distancia: "+ this.viagem1.getDistancia());
        System.out.println("Valor Total da Viagem: R$" + this.viagem1.getValorViagem());        
        
    }
    
}
