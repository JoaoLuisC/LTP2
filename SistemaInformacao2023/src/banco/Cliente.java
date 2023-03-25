package banco;

public class Cliente {

    private String nome; // nome do cliente
    private String sobrenome; // sobrenome do cliente
    private String cpf; // CPF do cliente

    public String getNome() { // método getter para nome
        return nome;
    }

    public void setNome(String nome) { // método setter para nome
        this.nome = nome;
    }

    public String getSobrenome() { // método getter para sobrenome
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) { // método setter para sobrenome
        this.sobrenome = sobrenome;
    }

    public String getCpf() { // método getter para cpf
        return cpf;
    }

    public void setCpf(String cpf) { // método setter para cpf
        this.cpf = cpf;
    }
    
}