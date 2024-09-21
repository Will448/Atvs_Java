package Exercícios.ExemplosAula.Polimorfismo;

public class Brinquedo {

    protected double velocidade;
    protected double aceleracao;
    protected String nome;

    public Brinquedo() {
    }

    public Brinquedo(String nome) {
        this.nome = nome;
    }

    public void mover() {
        System.out.println("Mover Brinquedo: ");
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void setVelocidade(double velocidade, double aceleracao) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
