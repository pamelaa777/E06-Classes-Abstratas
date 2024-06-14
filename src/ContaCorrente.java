public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public void setLimite(double limite) {
        if (limite >= -100) {
            this.limite = limite;
        } else {
            System.out.println("Limite inválido. O limite para ContaCorrente deve ser maior ou igual a -100.");
        }
    }
}