package TrabalhosAvaliativos.Trab02.Questão04;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(double limite) {
        super(limite);
    }

    @Override
    public double calculaTributos(double saldo) {
        SeguroDeVida SegurodeVida = new SeguroDeVida();
        double valor = SegurodeVida.getValor() + (saldo*1/100);
        return valor;
    }

}
