package banco;

public class ValorInvalidoException extends Exception{
    
    //CONSTRUTOR
    ValorInvalidoException(double valor) {
        super("Valor invalido: " + valor);
    }
  
}
/*

Atenção: nem sempre é interessante criarmos um novo tipo de exception! 
Depende do caso. Neste aqui, seria melhor ainda utilizarmos IllegalArgumentException. 
A boa prática diz que devemos preferir usar as já existentes do Java sempre que possível.

*/