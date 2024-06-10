
public class PessoaJuridica extends Cliente{
    String cnpj;
    int numFuncionarios;
    String setor;

    public  PessoaJuridica (String nome, String endereco, String cnpj, int numFuncionarios, String setor) {
        super(nome, endereco);//ele coloca as que nao estao instanciados no this e que estao e cliente
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
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