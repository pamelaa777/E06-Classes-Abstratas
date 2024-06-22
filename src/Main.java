import Cliente.*;
import Contas.*;
import Operacao.*;
public class Main {
    public static void main(String[] args) {

        PessoaFisica joao= new PessoaFisica("João",
                "Av. Antonio Carlos. 6627",
                "324.310.130-15",
                36,
                'm');
        PessoaFisica junia = new PessoaFisica("Junia",
                "Av. Antonio Carlos. 7777",
                "324.310.130-16",
                36,
                'f');

        PessoaJuridica loja1 = new PessoaJuridica("Brecho",
                "Rua Dos Palmares 111, Planalto",
                "123.124.124.0001.23",
                16,
                "financeiro");
        PessoaJuridica loja2 = new PessoaJuridica( "Casinha",
                "Rua Dos Palmares 222, Planalto",
                "123.124.124.0001.23",
                16,
                "financeiro");

        Conta conta1 = new ContaUniversitaria(1234, joao, 565, 5888, 0);
        Conta conta2 = new ContaCorrente(1234, junia, 0, 1500, 0);

        System.out.println(conta1);

        conta1.depositar(2000);
        conta1.sacar(500);

        conta2.transferir(conta1, 666);
        conta2.depositar(234);

        System.out.println(conta1);
        conta1.imprimirExtrato();

        System.out.println(junia);
        System.out.println(loja1);

        int media = Operacao.getTotalOperacoes() / Conta.getTotalContas();
        System.out.println("Média de operações por conta aberta: " + media);

        System.out.println("conta1 == conta2 ? " + conta1.equals(conta2));
        System.out.println("junia == joao ? " + junia.equals(joao));
        System.out.println("junia == loja1 ? " + loja1.equals(junia));

        System.out.println("authenticator: " + loja1.autenticar("555669813"));

    }
}
