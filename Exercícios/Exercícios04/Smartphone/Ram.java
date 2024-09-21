package Exercícios.Exercícios04.Smartphone;

public class Ram {

    protected String tipo;
    protected double quantidade;

    public Ram(String tipo, double quantidade) {
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return this.quantidade;
    }
}
