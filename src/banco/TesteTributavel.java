package banco;

public class TesteTributavel {
    
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(200);
        
        System.out.println(cc.calculaTributos());
        
        Tributavel t = cc;
        System.out.println(t.calculaTributos());

    }
    
}
