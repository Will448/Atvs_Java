package Exercícios.Exercício07_String;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        System.out.println("Hello world\n");
        Scanner s = new Scanner(System.in);

        //Questão 3 para questão 3

        String nome = "";
        System.out.println("Digite o seu nome: ");
        nome = s.nextLine().toUpperCase();
        List<String> conectores = Arrays.asList("do", "da", "de", "e", "dos", "das", "di", "du");
        StringBuilder iniciais = new StringBuilder();
        for (String parte: nome.split(" ")) {
            if (! conectores.contains(parte.toLowerCase())) {
                iniciais.append(Character.toUpperCase(parte.charAt(0)));
            }
        }
        System.out.println("As suas iniciais são: " + iniciais.toString());

    }
}
