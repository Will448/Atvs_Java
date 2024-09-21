package Exercícios.Exercícios04;

public class SerHumano {
    //System.out.println("Hello world");
    //alterações feitas para o exercício 5
    //Exercício 01 para exercício 01

    protected String cor_olhos;
    protected double altura;
    protected double peso;
    //Adicione os metodos locomover lento e rapido-EX-05-A
    protected String locomover_rapido;
    protected String locomover_lento;

    public SerHumano(String cor_olhos, double altura, double peso) {

        this.peso = peso;
        this.altura = altura;
        this.cor_olhos = cor_olhos;
    }
    public void locomover_rapido(String locomover_rapido) {
        this.locomover_rapido = locomover_rapido;
        System.out.println("Não possui");
   }

   public void locomover_lento(String locomover_lento){
        this.locomover_lento = locomover_lento;
       System.out.println("Andar a pê");
   }

    public void setCor_olhos(String cor_olhos) {
        this.cor_olhos = cor_olhos;
    }

    public String getCor_olhos() {
        return this.cor_olhos;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public String getLocomover_rapido() {
        return this.locomover_rapido;
    }

    public String getLocomover_lento() {
        return this.locomover_lento;
    }

    public void setLocomover_rapido(String locomover_rapido) {
        this.locomover_rapido = locomover_rapido;
    }

    public void setLocomover_lento(String locomover_lento) {
        this.locomover_lento = locomover_lento;
    }
}
