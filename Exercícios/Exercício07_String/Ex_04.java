package Exercícios.Exercício07_String;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        System.out.println("Hello Word");
        Scanner s = new Scanner(System.in);

       // Questão 4 para questão 4

    /*4. Construa uma classe que solicite uma frase escrita pelo usuário. Peça ao usuário para escolher uma palavra
     da frase escrita e substituí-la por outra palavra. (Utilize o método replace()). */

                String frase;
                String palavra;
                String novaPalavra;

                System.out.println("\n Insira uma frase: \n");
                frase = s.nextLine();

                System.out.println("\n Escolha uma palavra da frase: \n");
                palavra = s.nextLine();

                System.out.println("\n Escolha qual palavra que irá substituí-la: \n");
                novaPalavra = s.nextLine();

                String Frase2 = frase.replace(palavra, novaPalavra);
                System.out.println("\n A sua frase reescrita é: " + Frase2);
            }
        }
