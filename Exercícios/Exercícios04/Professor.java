package Exercícios.Exercícios04;

public class Professor extends SerHumano {

    protected String nome;
    protected String disciplina;

    public Professor(String nome, String disciplina, String cor_olhos, double altura, double peso){
        super(cor_olhos, altura, peso);

        this.nome = nome;
        this.disciplina = disciplina;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return this.disciplina;
    }
}
