package Exercícios.Ex.Interface;

public class Canario implements Ave {

    @Override
    public String Cor_Pena() {
        return ("Amarelo");
    }

    @Override
    public String som_Animal() {
        return ("Cantar");
    }

    @Override
    public boolean conhecido() {
        return false;
    }

    @Override
    public String locomover() {
        return ("Voar");
    }

    @Override
    public String alimentacao() {
        return ("Alpiste e alface");
    }

    @Override
    public double peso() {
        return 0.369;
    }

    @Override
    public int idade() {
        return 4;
    }

    @Override
    public String nome() {
        return ("Canário Belga");
    }
}
