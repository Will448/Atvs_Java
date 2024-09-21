package Exercícios.Ex.Interface.Interface02;

public class Animais implements Ave, Repteis, Mamifero, Animal {

/* Questão 03 para questão 03
03-Crie uma classe que implementa as três interfaces, em seguida reescreva os
métodos da para que eles possuam uma função concreta
 */
    @Override
    public String getnome() {
        return ("Macaco");
    }

    @Override
    public int getidade() {
        return 6;
    }

    @Override
    public double getpeso() {
        return 27.96;
    }

    @Override
    public String getalimentacao() {
        return ("Onivoro");
    }

    @Override
    public String getsom() {
        return null;
    }

    @Override
    public String getlocomover() {
        return ("Anda e pula");
    }

    @Override
    public boolean conhecido() {
        return true;
    }

    @Override
    public String getcor_pena() {
        return null;
    }

    @Override
    public String getcativeiro_livre() {
        return ("Cativeiro");
    }

    @Override
    public String getcor_pelo() {
        return ("Marrom");
    }

    @Override
    public String getporte() {
        return ("Médio");
    }

    @Override
    public String getcor_escama() {
        return null;
    }

    @Override
    public String getmeio_vida() {
        return ("Terrestre");
    }
}

