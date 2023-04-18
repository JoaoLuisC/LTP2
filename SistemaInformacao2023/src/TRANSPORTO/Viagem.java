package TRANSPORTO;

public class Viagem {
    
    private String destino;
    private double valorViagem;
    private double valorKM;
    private double distancia;
    
    //CONSTRUTOR

    public Viagem(String destino, double valorKM, double distancia) {
        this.destino = destino;
        this.valorKM = valorKM;
        this.distancia = distancia;
        calcularViagem();
    }
    
    //GETTERS E SETTERS
    
    //DESTINO
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    //VALOR VIAGEM
    public double getValorViagem() {
        return valorViagem;
    }
    public void setValorViagem(double valorViagem) {
        this.valorViagem = valorViagem;
    }
    //VALOR KM
    public double getValorKM() {
        return valorKM;
    }
    public void setValorKM(double valorKM) {
        this.valorKM = valorKM;
    }
    // DISTANCIA
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    //METODOS
    
    void calcularViagem(){
        
        this.valorViagem = this.valorKM * this.distancia;
        
    }
    
}
