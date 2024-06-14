public class PessoaJuridica extends Cliente{
    String cnpj;
    int numFuncionarios;
    String setor;

    public PessoaJuridica(String nome, String endereco, String cnpj, int numFuncionarios, String setor) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    @Override
    public boolean autenticar(String chave) {
        return this.cnpj.equals(chave);
    }

    @Override
    public void setLimite(double limite) {
        if (limite >= 100 && limite <= 1000) {
            this.limite = limite;
        } else {
            System.out.println("Limite inválido. O limite para ContaPoupanca deve estar entre 100 e 1000.");
        }
    }

    @Override
    public String toString() {
        return  "-------------------------" +
                "\nNome: " + this.nome +
                "\nEndereco: " + this.endereco +
                "\nCNPJ: " + this.cnpj +
                "\nNumero de Funcionarios: " + this.numFuncionarios +
                "\nSetor: " + this.setor +
                "\n-------------------------";
    }

    @Override
    public boolean equals(Object obj) {
        PessoaJuridica pessoa = (PessoaJuridica) obj;
        return  this.cnpj.equals(pessoa.cnpj);
    }
}