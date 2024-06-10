import java.util.Date;

public class Operacao {

    /* Data de realização da operação */
    private Date data;

    /* Tipo da operação */
    private char tipo;

    /* Valor da operação */
    private double valor;

    private static int totalOperacoes = 0;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        data = new Date();

        Operacao.totalOperacoes++;
    }

    void imprimir() {
        System.out.printf("%s\t%s\t%s\n", this.data, this.tipo, this.valor);
    }

    public Date getData() {
        return data;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public static int getTotalOperacoes() {
        return Operacao.totalOperacoes;
    }

    public void setTipo(char tipo) {
        if(tipo == 'd' || tipo == 's')
            this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}