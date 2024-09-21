package Exercícios.Ex.Interface;
/* Questão 01 para questão 01:
  1. Crie três interfaces que possuam relação entre si, de alguma maneira
   Questão 02 para 02
  2. Crie duas assinaturas de método para cada uma das interfaces*/
public interface Ave extends Animal {

    public abstract String Cor_Pena();

    @Override
    String som_Animal();

    @Override
    boolean conhecido();

    @Override
    String locomover();

    @Override
    String alimentacao();

    @Override
    double peso();

    @Override
    int idade();

    @Override
    String nome();
}
