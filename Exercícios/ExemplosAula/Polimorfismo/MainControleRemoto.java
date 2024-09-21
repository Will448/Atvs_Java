package Exercícios.ExemplosAula.Polimorfismo;

import Exercícios.ExemplosAula.Polimorfismo.Aviao;
import Exercícios.ExemplosAula.Polimorfismo.Barco;
import Exercícios.ExemplosAula.Polimorfismo.Carro;
import Exercícios.ExemplosAula.Polimorfismo.ControleRemoto;

public class MainControleRemoto {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Carro carro = new Carro();
        carro.setNome("Carro BMW");

        ControleRemoto controleRemoto1 = new ControleRemoto(carro);

        controleRemoto1.mover();

        Barco barco = new Barco();
        barco.setNome("Barco Titanic");

        ControleRemoto controleRemoto2 = new ControleRemoto(barco);

        controleRemoto2.mover();

        Aviao aviao = new Aviao();
        aviao.setNome("Aviao A710");

        ControleRemoto controleRemoto3 = new ControleRemoto(aviao);

        controleRemoto3.mover();

    }

}
