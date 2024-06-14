public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public void setLimite(double limite) {
        if (limite >= 100 && limite <= 1000) {
            this.limite = limite;
        } else {
            System.out.println("Limite inválido. O limite para ContaPoupanca deve estar entre 100 e 1000.");
        }
    }
}