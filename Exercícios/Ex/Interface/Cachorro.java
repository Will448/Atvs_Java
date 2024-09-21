package Exercícios.Ex.Interface;

public class Cachorro implements Mamifero {

    @Override
    public String som_Animal() {
        return ("Latido");
    }

    @Override
    public String nome() {
        return ("Pastor Alemão");
    }

    @Override
    public int idade() {
    return (8);
    }

    @Override
    public double peso() {
    return (25.36);
    }

    @Override
    public String alimentacao() {
    return ("Carnivoro");
    }

    @Override
    public String locomover() {
    return ("Andar");
    }

    @Override
    public boolean conhecido() {
    return true;
    }

    @Override
    public String porte() {
        return ("Médio");
    }

    @Override
    public String cor_pelo() {
    return ("Marrom");
    }
}
