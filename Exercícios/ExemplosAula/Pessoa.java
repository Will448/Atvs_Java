package Exercícios.ExemplosAula;

public class Pessoa {

    /*2. Defina uma classe denominada Pessoa que possua os atributos: nome, idade, peso. Em
seguida, crie uma classe Main e instancie as pessoas: Ana, Carlos, Lílian. O construtor
deve receber todos os 3 atributos para sua instanciar de um objeto. Por fim, apresente
para o usuário os valores informados de todos os atributos.

3. Utilizando a classe Pessoa descrita no exercício 02, crie as classes Aluno e Professor.
Como são pessoas, tanto Aluno como Professor possuem os atributos nome, idade e
altura. O construtor de ambas as classes deve receber todos os 3 atributos para sua
instanciar a um objeto. E em seguida, crie uma classe main que instancia dois
professores e quatro alunos. Diga qual o relacionamento entre Aluno e Professor.*/
    String nome;
    int idade;
    double peso;

    public Pessoa(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void setNome(String Nome){
        this.nome = Nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){

        this.idade = idade;
    }
    public int getIdade(){return this.idade;}

    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){return this.peso;}

}
