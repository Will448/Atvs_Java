package Exercícios.Ex.Interface;

public class Lagarto implements Réptil {

    @Override
    public String cor_escama() {
        return ("Esverdeada");
    }

    @Override
    public String som_Animal() {
        return null;
    }

    @Override
    public String nome() {
        return ("Lagarto");
    }

    @Override
    public int idade() {
        return 11;
    }

    @Override
    public double peso() {
        return 5.297;
    }

    @Override
    public String alimentacao() {
        return ("Animais pequenos");
    }

    @Override
    public String locomover() {
        return ("Rastejar");
    }

    @Override
    public boolean conhecido() {
        return true;
    }
}
