package TRANSPORTO;

public class Carreta {
    
    private String cor;
    private String modelo;
    
    //CONSTRUTOR

    public Carreta(String modelo) {
        this.modelo = modelo;
    }
    
    //GETTERS E SETTERS

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
