public class Main {
    public static void main(String[] args) {

        // Para gerar um CPF válido, utilize o seguinte link:
        // https://www.4devs.com.br/gerador_de_cpf
        PessoaFisica joao = new PessoaFisica(
                "João",
                "Av. Antonio Carlos. 6627",
                "324.310.130-15",
                36,
                'm'
        );

        PessoaFisica junia = new PessoaFisica(
                "João",
                "Av. Antonio Carlos. 6627",
                "324.310.130-15",
                36,
                'm'
        );

        System.out.println(joao.toString());
        System.out.println(joao.equals(junia));

        PessoaJuridica loja = new PessoaJuridica(
                "Brecho",
                "Rua Dos Palmares 111, Planalto",
                "123.124.124.0001.23",
                16,
                "financeiro"
        );
        PessoaJuridica loja2 = new PessoaJuridica(
                "Casinha",
                "Rua Dos Palmares 222, Planalto",
                "123.124.124.0001.23",
                16,
                "financeiro"
        );
        System.out.println(loja.toString());
        System.out.println(loja.equals(loja2));

        if (joao != null) {
            Conta conta1 = new Conta(1234, joao, 0, 1500);
            Conta conta2 = new Conta(12121, joao, 10000, 1500);

            conta1.depositar(3000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.sacar(500);

            conta2.transferir(conta1, 666);
            conta2.depositar(234);

            conta1.imprimirExtrato();
            conta2.imprimirExtrato();

            int media = Operacao.getTotalOperacoes() / Conta.getTotalContas();
            System.out.println("Média de operações por conta aberta: " + media);
        } else {
            System.out.println("CPF Inválido!");
        }

        String x = "23";
        System.out.println(x=="23");

    }
}