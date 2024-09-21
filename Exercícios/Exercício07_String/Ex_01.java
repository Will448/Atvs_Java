package Exercícios.Exercício07_String;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner s = new Scanner(System.in);

        //Questão 1 para questão 1

        //1. Faça um programa que em Java, que peça ao usuário para digitar uma string e imprima:
       // a. O número de caracteres da string.

         System.out.println("Digite uma frase: ");
          String texto = s.nextLine();
        //System.out.println("A quantidade de caracteres é " + texto.length());
        /*String texto = JOptionPane.showInputDialog(null, "Escreva alguma frase");
        JOptionPane.showMessageDialog(null, "O seu texto possui " + texto.length() + " caracteres\n"
        + "que é " + texto)*/

       // b. A string com todas suas letras em maiúsculo e depois em minúsculo.

       // System.out.println("Em maiusculo: " + texto.toUpperCase());
       // System.out.println("Em minusculo: " + texto.toLowerCase());

        //c. O número de vogais da string.
        int qtdVogais = 0;
        for (int i = 0; i < texto.length(); i++) {
            char k = texto.charAt(i);
            if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u') {
                qtdVogais++;
            }
        }
        //System.out.println("sua quantidade de vogais é: " + qtdVogais);

        // d. Se a string digitada começa com “Ins” (ignorando maiúsculas/minúsculas).

        //  System.out.println("Começa com Ins? " + texto.startsWith("Ins" ));

        //e. Se a string digitada termina com “ões” (ignorando maiúsculas/minúsculas).

        // System.out.println("Termina com ões? " + texto.endsWith("ões"));

        System.out.println("A quantidade de caracteres é " + texto.length() + ", na frase: " + texto +
        "\nonde que sua quantidade de vogais é: " + qtdVogais + "\ntoda sua frase em maiúsculo e minúsculo \n" +
           texto.toUpperCase() + "\n" + texto.toLowerCase() + "\nSua frase começa com Ins? " + texto.startsWith("Ins") +
             "\nou" + "\nSua frase termina com ões? " + texto.endsWith("ões") );
    }
}