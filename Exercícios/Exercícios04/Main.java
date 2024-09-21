package Exercícios.Exercícios04;
import Exercícios.Exercícios04.Smartphone.*;

import java.util.ArrayList;
//Exercício 1 para exercício 1
//Alunos: Willian Bongiovanni e Julia Pavan

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");


        Aluno Al1 = new Aluno("Liza", "Azuis", 1.74, 68.20);
        Professor Prof1 = new Professor("Alisson", "Banco de Dados", "Castanhos", 1.87, 87.10);
        Aparelho Ap1 = new Aparelho("SamsungS10");
        Ram R1 = new Ram("DDR3", 8);
        Processador P = new Processador("SnapDragon", "SAMSUNG Exynos 9 Octa 9820", 2.7);
        Tela T1 = new Tela("1440 x 3040 pixels", "6,4 polegadas de 157,6 x 74,1 x 7,8 mm.");
        Bateria B1 = new Bateria("2400 mAh");
        Camera C1 = new Camera("2000 x 1000 pixel");
        Al1.setLocomover_lento("Andar a pé");
        //Smartphone Sm = new Smartphone(Ap1, B1, C1, P, R1, T1);

        Aparelho Ap2 = new Aparelho("Lg K40");
        Ram R2 = new Ram("DDR3", 8);
        Processador P2 = new Processador("SnapDragon", "Lg Exynos 9 Octa 9820", 2.7);
        Tela T2 = new Tela("1440 x 3040 pixels", "6,4 polegadas de 157,6 x 74,1 x 7,8 mm.");
        Bateria B2 = new Bateria("3400 mAh");
        Camera C2 = new Camera("4000 x 3000 pixel");
        // Smartphone Sm2 = new Smartphone(Ap2, B2, C2, P2, R2, T2);

        Aluno Al2 = new Aluno("Mara", "Marrom", 1.80, 72);
        Professor Prof2 = new Professor("Pedro", "Matemática", "Azul", 1.85, 75);
        Aparelho Ap3 = new Aparelho("SamsungA10");
        Ram R3 = new Ram("DDR3", 6);
        Processador P3 = new Processador("Snapdragon", "Samsung Exynos 9825", 3.6);
        Tela T3 = new Tela("1270 x 3040 pixels", "8,4 polegadas de 165,6 x 78,1 x 7,9 mm.");
        Bateria B3 = new Bateria("3650 mAh");
        Camera C3 = new Camera("4000 x 3500 pixel");
        Al2.setLocomover_rapido("Automovel");
        //Smartphone Sm2 = new Smartphone(Ap2, B2, C2, P2, R2, T2);

        Aparelho Ap4 = new Aparelho("Iphone 12");
        Ram R4 = new Ram("DDR3", 4);
        Processador P4 = new Processador("Snapdragon", "BIOS Exynos 9825", 3.6);
        Tela T4 = new Tela("1270 x 3040 pixels", "8,4 polegadas de 165,6 x 78,1 x 7,9 mm.");
        Bateria B4 = new Bateria("3650 mAh");
        Camera C4 = new Camera("4000 x 3500 pixel");



        System.out.println("Aluno:");
        System.out.println("Nome: " + Al1.getNome());
        System.out.println("Peso:  " + Al1.getPeso());
        System.out.println("Altura: " + Al1.getAltura());
        System.out.println("Cor dos olhos: " + Al1.getCor_olhos());
        System.out.println("Locomoção: " + Al1.getLocomover_lento());

        System.out.println("Celular");
        System.out.println("\nSmartphone " + Ap1.getAparelho());
        System.out.println("\nMemória Ram:");
        System.out.println("Tipo: " + R1.getTipo());
        System.out.println("Quantidade de armazenamento: " + R1.getQuantidade() + "Gb");
        System.out.println("\nProcessador: ");
        System.out.println("Modelo do processador: " + P.getModelo());
        System.out.println("Marca do processador: " + P.getMarca());
        System.out.println("Velocidade do processador: " + P.getVelocidade());
        System.out.println("\nTela: ");
        System.out.println("Resolução: " + T1.getResolução());
        System.out.println("Tamanho: " + T1.getTamanho());
        System.out.println("\nBateria:");
        System.out.println("Capacidade de carga " + B1.getCapacidade());
        System.out.println("\nCâmera: ");
        System.out.println("\nResolução geral da camera: " + C1.getResolução());

        System.out.println("Professor: ");
        System.out.println("Nome: " + Prof1.getNome());
        System.out.println("Olhos: " + Prof1.getCor_olhos());
        System.out.println("\nDisciplina: " + Prof1.getDisciplina());

        System.out.println("Celular");
        System.out.println("\nSmartphone " + Ap2.getAparelho());
        System.out.println("\nMemória Ram:");
        System.out.println("Tipo: " + R2.getTipo());
        System.out.println("Quantidade de armazenamento: " + R2.getQuantidade() + "Gb");
        System.out.println("\nProcessador: ");
        System.out.println("Modelo do processador: " + P2.getModelo());
        System.out.println("Marca do processador: " + P2.getMarca());
        System.out.println("Velocidade do processador: " + P2.getVelocidade());
        System.out.println("\nTela: ");
        System.out.println("Resolução: " + T2.getResolução());
        System.out.println("Tamanho: " + T2.getTamanho());
        System.out.println("\nBateria:");
        System.out.println("Capacidade de carga " + B2.getCapacidade());
        System.out.println("\nCâmera: ");
        System.out.println("Resolução geral da camera: " + C2.getResolução());

        System.out.println("Aluno:");
        System.out.println("Nome: " + Al2.getNome());
        System.out.println("Peso:  " + Al2.getPeso());
        System.out.println("Altura: " + Al2.getAltura());
        System.out.println("Cor dos olhos: " + Al2.getCor_olhos());
        System.out.println("Locomoção: " + Al2.getLocomover_rapido());

        System.out.println("Celular");
        System.out.println("\nSmartphone " + Ap3.getAparelho());
        System.out.println("\nMemória Ram:");
        System.out.println("Tipo: " + R3.getTipo());
        System.out.println("Quantidade de armazenamento: " + R3.getQuantidade() + "Gb");
        System.out.println("\nProcessador: ");
        System.out.println("Modelo do processador: " + P3.getModelo());
        System.out.println("Marca do processador: " + P3.getMarca());
        System.out.println("Velocidade do processador: " + P3.getVelocidade());
        System.out.println("\nTela: ");
        System.out.println("Resolução: " + T3.getResolução());
        System.out.println("Tamanho: " + T3.getTamanho());
        System.out.println("\nBateria:");
        System.out.println("Capacidade de carga " + B3.getCapacidade());
        System.out.println("\nCâmera: ");
        System.out.println("\nResolução geral da camera: " + C3.getResolução());

        System.out.println("Professor: ");
        System.out.println("Nome: " + Prof2.getNome());
        System.out.println("Olhos: " + Prof2.getCor_olhos());
        System.out.println("Disciplina: " + Prof2.getDisciplina());

        System.out.println("Celular");
        System.out.println("\nSmartphone " + Ap4.getAparelho());
        System.out.println("\nMemória Ram:");
        System.out.println("Tipo: " + R4.getTipo());
        System.out.println("Quantidade de armazenamento: " + R4.getQuantidade() + "Gb");
        System.out.println("\nProcessador: ");
        System.out.println("Modelo do processador: " + P4.getModelo());
        System.out.println("Marca do processador: " + P4.getMarca());
        System.out.println("Velocidade do processador: " + P4.getVelocidade());
        System.out.println("\nTela: ");
        System.out.println("Resolução: " + T4.getResolução());
        System.out.println("Tamanho: " + T4.getTamanho());
        System.out.println("\nBateria:");
        System.out.println("Capacidade de carga " + B4.getCapacidade());
        System.out.println("\nCâmera: ");
        System.out.println("Resolução geral da camera: " + C4.getResolução());
    }
}
