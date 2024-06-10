public class PessoaFisica extends Cliente {
    String cpf;
    int idade;
    char sexo;

    public  PessoaFisica (String nome, String endereco, String cpf, int idade, char sexo) {
        super(nome, endereco);//ele coloca as que nao estao instanciados no this e que estao e cliente
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }



    @Override
    public String toString() {
        return "-------------------------" +
                "\nNome: " + this.nome +
                "\nCPF: " + this.cpf +
                "\nEndereco: " + this.endereco +
                "\nIdade: " + this.idade +
                "\nSexo: " + this.sexo +
                "\n-------------------------";
    }
    @Override
    public boolean equals(Object obj) {
        return this.cpf.equals(((PessoaFisica) obj).cpf);
    }
}