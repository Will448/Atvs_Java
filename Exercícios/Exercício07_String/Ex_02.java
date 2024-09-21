package Exercícios.Exercício07_String;

public class Ex_02 {
    public static void main(String[] args) {
        System.out.println("Hello world\n");

        //Questão 2 para questão 2

        /*2. Faça um programa em Java que mostre a seguinte saída: (Utilize o método substring()).
 a. C
 b. Ca
 c. Cas
 d. Casa
 e. Cas
 f. Ca
 g. C*/
        String palavra = new String("Casa");

        for(int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.substring(0, i+1));

        }
        for(int i = palavra.length()-1; i >= 0; i--) {
            System.out.println(palavra.substring(0, i));
        }
    }
}
