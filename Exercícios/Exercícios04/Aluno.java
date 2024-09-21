package Exercícios.Exercícios04;

public class Aluno extends SerHumano {

    //Exercício 02 para exercício 02 - EX05-B

    protected String nome;

    public Aluno(String nome, String cor_olhos, double altura, double peso){
        super(cor_olhos, altura, peso);

        this.nome = nome;
    }

    @Override
    public void locomover_lento(String locomover_lento) {
        super.locomover_lento(locomover_lento);
    }
    @Override
public void locomover_rapido(String locomover_rapido){
        super.locomover_rapido(locomover_rapido);
}
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

}
