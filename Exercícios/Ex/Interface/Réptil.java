package Exercícios.Ex.Interface;
/* Questão 01 para questão 01:
  1. Crie três interfaces que possuam relação entre si, de alguma maneira
   Questão 02 para 02
  2. Crie duas assinaturas de método para cada uma das interfaces*/
public interface Réptil extends Animal{

  public String cor_escama();

  @Override
  String som_Animal();

  @Override
  String nome();

  @Override
  int idade();

  @Override
  double peso();

  @Override
  String alimentacao();

  @Override
  String locomover();

  @Override
  boolean conhecido();
}
