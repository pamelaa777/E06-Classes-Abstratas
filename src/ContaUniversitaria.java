public class ContaUniversitaria extends Conta {

    public ContaUniversitaria(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public void setLimite(double limite) {
        if (limite >= 0 && limite <= 500) {
            this.limite = limite;
        } else {
            System.out.println("Limite inválido. O limite para ContaUniversitaria deve estar entre 0 e 500.");
        }
    }
}