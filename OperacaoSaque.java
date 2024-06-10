public class OperacaoSaque extends Operacao {
    public OperacaoSaque(double valor) {
        super('s', valor);
        setTipo('s');
        setValor(valor);
    }
    @Override
    public String toString(){
        return "Saque" + this.getValor();
    }
}