package TrabalhosAvaliativos.Trab02.Questão04;

public class Conta {

    private double valor;
    private double obterSaldo;
    private double limite;

    public void sacar(double valor) {

        if (valor > limite) {

            System.out.println("Voce não pode ultrapassar o limite");
            System.out.println("Saldo insuficiente, não foi possível sacar");
        } else {
            this.valor -= valor;
            System.out.println("Você sacou R$ " + valor);

        }
    }
    public void depositar(double valor){
        this.valor += valor;
    }

    public double obterSaldo(){
        return this.valor;
    }

    public Conta(double limite) {
        this.limite = limite;
    }
}
/*(obterSaldo() >= valor){
            this.valor -= valor;
        } else */