package TrabalhosAvaliativos.Trab02.Questão01;

import java.util.Scanner;

public class Questão01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        String texto;

        System.out.println("Escreva seu texto: ");
        texto = s.nextLine();

        String palavras[] = texto.split(" ");
        for (int i = 0; i < palavras.length; i++) {

            if (palavras[i].length() > 2) {
                count++;
            }
        }
        String caracteres[] = texto.split(" ");

        System.out.println("A quantidade de palavras digitadas é de: " + count);
        System.out.println("O número de caracteres foi de: " + texto.length());
    }

}