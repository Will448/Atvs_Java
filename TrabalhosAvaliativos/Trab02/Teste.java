package TrabalhosAvaliativos.Trab02;

import java.util.Scanner;

public class Teste {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = s.nextLine();
        String palavra1 = palavra.replace("a", "*").replace("o", "*");
        System.out.println("Palavra era:   [" + palavra + "]");
        System.out.println("Palavra ficou: [" + palavra1 + "]");

    }
}