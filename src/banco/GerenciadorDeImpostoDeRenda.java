package banco;

public class GerenciadorDeImpostoDeRenda {
    
    private double total;
    
    //GETTERS E SETTERS
    
    //TOTAL
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
      
    //METODOS
    void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);
        this.total += t.calculaTributos();
    }
    
}
