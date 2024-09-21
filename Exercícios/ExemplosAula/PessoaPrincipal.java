package Exercícios.ExemplosAula;

public class PessoaPrincipal {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Ana", 19, 69.3);

        System.out.println("Pessoa 1 ");

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Peso: " + p1.getPeso());

        System.out.println("");
        System.out.println("Pessoa 2 ");

        Pessoa p2 = new Pessoa("Carlos", 25, 62.96);

        System.out.println("Nome: " + p2.getNome());
        System.out.println("Idade: " + p2.getIdade());
        System.out.println("Peso: " + p2.getPeso());

        System.out.println("");
        System.out.println("Pessoa 3 ");

        Pessoa p3 = new Pessoa("Lilian", 29, 71.52);

        System.out.println("Nome: " + p3.getNome());
        System.out.println("Idade: " + p3.getIdade());
        System.out.println("Peso: " + p3.getPeso());

    }
}
