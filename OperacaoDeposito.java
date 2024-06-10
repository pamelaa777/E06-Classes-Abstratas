public class OperacaoDeposito extends Operacao {
    public OperacaoDeposito(double valor) {
        super('d', valor);
        setTipo('d');
        setValor(valor);

    }
    @Override
    public String toString(){
        return "Deposito" + this.getValor();
    }
}