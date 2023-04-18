package banco;

import java.util.logging.Level;
import java.util.logging.Logger;

abstract public class Conta {
    
    // atributos ou variáveis de instância
    
    Cliente objCliente1 = new Cliente(); // criei um objeto
    Cliente objCliente2; // criei uma referência
    double saldo;
    private double  limite;
    private int numero;
    private static int totalDeContas; // variável static pertence a classe

    //CONSTRUTORES
    
    Conta(){ // construtor padrão modificado para aumentar o total de contas
        System.out.println("Construindo uma conta");
        Conta.totalDeContas = Conta.totalDeContas+1;
    }    
    Conta(double saldo){
        this(); // invoca o construtor padrão
        this.saldo = saldo;
    }
    Conta(double saldo, int numero){
        this(saldo); //invoca o construtor anterior
        this.numero = numero;
        
    }
    
    // GETTERS E SETTERS
  
    //NUMERO
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    //SALDO
    public double getSaldo(){
        return this.saldo;
    }
    //TOTAL DE CONTAS
    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }
    
    
    //METODOS
    
    public void deposita(double saldo) throws ValorInvalidoException { // método
        if(saldo < 0){
            throw new ValorInvalidoException(saldo);            
        }else{
            this.saldo = this.saldo + saldo;
            System.out.println("Depósito realizado para: "+objCliente1.getNome());  
        }
        
    }

    boolean saca(double saldo) { // método
        if (this.saldo >= saldo) {
            this.saldo = this.saldo - saldo;
            System.out.println("Saque realizado com sucesso");
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
        
    boolean transfere(Conta destino, double saldo) {
        if (this.saca(saldo) == true) {
            try {
                destino.deposita(saldo);
            } catch (ValorInvalidoException e) {
                System.out.println(e.getMessage());
            }
            return true;
        } else {
            return false;
        }
    }
    
    abstract void atualiza(double taxa);
}