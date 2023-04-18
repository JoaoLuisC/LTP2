package TRANSPORTO;

public class Teste {
    public static void main(String[] args) {
        Carreta carreta1 = new Carreta("mercedes-020304");
        Caminhoneiro caminhoneiro1 = new Caminhoneiro("LUCAS", "123.123.123-32", "123456", 400);
        Viagem viagem1 = new Viagem("RIO DE JANEIRO", 2.3 , 740);
        Cliente cli1 = new Cliente("JOAO", caminhoneiro1, viagem1, carreta1);
        
        cli1.visualizarViagem();
        
    }
}
