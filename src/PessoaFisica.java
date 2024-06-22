import java.util.Date;

public class PessoaFisica extends Cliente {
    private String cpf;
    private int idade;
    private char sexo;

    public PessoaFisica(String nome,  String endereco, String cpf, int idade, char sexo) {
        super(nome, endereco, new Date());
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public String toString(){
        return
        "\n===== Cliente PF ====="+
        "\nNome: " + this.nome + 
        "\nIdade: " + this.idade +
        "\nSexo: " + this.sexo +
        "\nEndereco: " + this.endereco +
        "\nCPF: " + this.cpf +
        "\n====================";
    }

    @Override
    public boolean equals(Object obj) {
        ClientePessoaFisica pessoa = (ClientePessoaFisica) obj;
        return cpf.equals(pessoa.cpf);
    }
    
    @Override
    boolean autenticar(String key) {
        return key.equals(this.cpf);
    }

    //Encapsulamento
    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}
    public char getSexo() {return sexo;}
    public void setSexo(char sexo) {this.sexo = sexo;}
