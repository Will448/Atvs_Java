package Exercícios.Exercícios04;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
//Exercício 2 para exercício 2
//Alunos: Willian Bongiovanni e Julia Pavan
public class Sala_Aula {
    private static Object Aluno;

    public static void main(String[] args) {
        System.out.println("Hello world");

    ArrayList<Aluno> lista = new ArrayList<Aluno>();
    Aluno A;

                A = new Aluno("Alice", "Verdes", 1.69, 71.23);
                lista.add(A);

                A = new Aluno("Liza", "Azuis", 1.74, 68.20);
                lista.add(A);

                A = new Aluno("Mara", "Marrom", 1.80, 72);
                 lista.add(A);

                 A = new Aluno("Kimberly", "Marrom", 1.47, 49);
                lista.add(A);

                A = new Aluno("Joelma", "Verde", 1.74, 65.2);
                 lista.add(A);
                 A = new Aluno("Julius", "Marrom", 1.97, 150);
        lista.add(A);

        A = new Aluno("Verdana", "Azul", 1.56, 72.5);
        lista.add(A);

        A = new Aluno("Moacir", "Marrom", 1.58, 78);
        lista.add(A);

        A = new Aluno("Jackson", "Preto", 1.48, 68);
        lista.add(A);

        A = new Aluno("Lurdes", "Azul", 1.65, 78.4);
        lista.add(A);

        A = new Aluno("Jheymmis", "Verde", 1.74, 85.6);
        lista.add(A);

        A = new Aluno("Valdirene", "Castanho", 1.47, 52.3);
        lista.add(A);

        A = new Aluno("Mirtes", "Azul", 1.54, 87.6);
        lista.add(A);

        A = new Aluno("Luana", "Castanho", 1.67, 59.6);
        lista.add(A);

        A = new Aluno("Jaine", "Verde", 1.45, 78.2);
        lista.add(A);

        A = new Aluno("Pluto", "Azul", 1.74, 56.9);
        lista.add(A);

        A = new Aluno("Caio", "Marrom", 1.80, 74.9);
        lista.add(A);

        A = new Aluno("Yudi", "Verde", 1.70, 72);
        lista.add(A);

        A = new Aluno("Maisa", "Marrom", 1.50, 59.6);
        lista.add(A);

        A = new Aluno("Marcos", "Verde", 1.56, 72);
        lista.add(A);

        A = new Aluno("Judite", "Marrom", 1.45, 45);
        lista.add(A);

        A = new Aluno("Maique", "Verde", 1.78, 95);
        lista.add(A);

        A = new Aluno("Elias", "Verde", 1.80, 85);
        lista.add(A);

        A = new Aluno("Miguel", "Cinza", 1.98, 120);
        lista.add(A);

        A = new Aluno("Mariana", "Verde", 1.56, 78);
        lista.add(A);

        A = new Aluno("Mario", "Marrom", 1.87, 76);
        lista.add(A);

        A = new Aluno("Marciel", "Azul", 1.78, 79);
        lista.add(A);

        A = new Aluno("Jucilde", "Marrom", 1.65, 77);
        lista.add(A);

        A = new Aluno("Salete", "Azul", 1.60, 62);
        lista.add(A);

        A = new Aluno("Meridite", "Marrom", 1.70, 62);
        lista.add(A);

        A = new Aluno("Jaime", "Azul", 1.80, 87);
        lista.add(A);

        A = new Aluno("Cátia", "Marrom", 1.50, 72);
        lista.add(A);

                String turma = "Lista da truma";

                for (int i = 0; i < lista.size(); i ++) {

                turma += "\n\nNome: " + lista.get(i).getNome() + "\n";
                turma += "Cor dos olhos: " + lista.get(i).getCor_olhos() + "\n";
                turma += "Altura: " + lista.get(i).getAltura() + "\n";
                turma += "Peso: " + lista.get(i).getPeso() +"\n";
    }

        JOptionPane.showMessageDialog(null, turma, "\nAlunos da turma\n", JOptionPane.INFORMATION_MESSAGE);
}
}

