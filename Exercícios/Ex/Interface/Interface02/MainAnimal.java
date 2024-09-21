package Exercícios.Ex.Interface.Interface02;

import Exercícios.Ex.Interface.Interface02.Animais;
/* Questão 04 para questão 04
4. Crie uma classe Main, instancie o objeto da classe que implementa as
interfaces criadas e Imprima os resultados
 */
public class MainAnimal {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Animais ani = new Animais();

        System.out.println("Alimentação: " + ani.getalimentacao());
        System.out.println("Idade: " + ani.getidade());
        System.out.println("Nome: " + ani.getnome());
        System.out.println("Conhecido: " + ani.conhecido());
        System.out.println("Locomoção: " + ani.getlocomover());
        System.out.println("Peso: " + ani.getpeso());
        System.out.println("Som: " + ani.getsom());
        System.out.println("Cor do pelo: " + ani.getcor_pelo());
        System.out.println("Meio de vida: " + ani.getmeio_vida());
        System.out.println("É livre ou vive em cativeiro? " + ani.getcativeiro_livre());
        System.out.println("Porte: " +ani.getporte());
    }
}
