package TrabalhosAvaliativos.Trab02.Questão04;

public class ContaPoupança extends Conta {

    public ContaPoupança(double limite) {
        super(limite);
    }

    public void Ver_Rendimento(double saldo) {

        System.out.println("Seu rendimento em 12 meses será de: " + obterSaldo() * 2.4 / 100 + "%");
        System.out.println("Seu rendimento em 6 meses será de: " + obterSaldo() * 1.2 / 100 + "%");
    }

}
