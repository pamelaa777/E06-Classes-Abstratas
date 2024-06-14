public class PessoaFisica extends Cliente {
    String cpf;
    int idade;
    char sexo;

    public PessoaFisica(String nome, String endereco, String cpf, int idade, char sexo) {
        super(nome, endereco);
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    @Override
    public boolean autenticar(String chave) {
        return this.cpf.equals(chave);
    }

    @Override
    public void setLimite(double limite) {
        if (limite >= -100) {
            this.limite = limite;
        } else {
            System.out.println("Limite inválido. O limite mínimo para ContaCorrente é -100.");
        }
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