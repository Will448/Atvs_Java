package Exercícios.Ex.Interface;
/* Questão 04 para questão 04
4. Crie uma classe Main, instancie o objeto da classe que implementa as
interfaces criadas e Imprima os resultados
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Cachorro c1 = new Cachorro();
        Canario p1 = new Canario();
        Lagarto l1 = new Lagarto();

        System.out.println("Alimentação: " + c1.alimentacao());
        System.out.println("Idade: " + c1.idade());
        System.out.println("Nome: " + c1.nome());
        System.out.println("Conhecido: " + c1.conhecido());
        System.out.println("Locomoção: " + c1.locomover());
        System.out.println("Peso: " + c1.peso());
        System.out.println("Som: " + c1.som_Animal());

        System.out.println("");

        System.out.println("Alimentação: " + p1.alimentacao());
        System.out.println("Idade: " + p1.idade());
        System.out.println("Nome: " + p1.nome());
        System.out.println("Conhecido: " + p1.conhecido());
        System.out.println("Locomoção: " + p1.locomover());
        System.out.println("Peso: " + p1.peso());
        System.out.println("Som: " + p1.som_Animal());

        System.out.println("");

        System.out.println("Alimentação: " + l1.alimentacao());
        System.out.println("Idade: " + l1.idade());
        System.out.println("Nome: " + l1.nome());
        System.out.println("Conhecido: " + l1.conhecido());
        System.out.println("Locomoção: " + l1.locomover());
        System.out.println("Peso: " + l1.peso());
        System.out.println("Som: " + l1.som_Animal());

    }
}
