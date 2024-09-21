package Exercícios;

import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args){
    //Aluno: Willian Bongiovanni

        /*Q01- Exercício 01 para o exercício 1 - (Ler dois números inteiros e imprimir a soma)*/
        int num1, num2, soma;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o 1º número: ");
        num1 = s.nextInt();
        System.out.print("Informe o 2º número: ");
        num2 = s.nextInt();
        soma = num1 + num2;

        System.out.println("A soma é: " + soma);

        /*Q02- Exercício 02 para o exercício 2 - (Entrar com dois números inteiros e imprimir a média aritmética)
        int num1, num2, media;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o 1º número: ");
        num1 = s.nextInt();
        System.out.print("Informe o 2º número:");
        num2 = s.nextInt();
        media = num1 / num2;

        System.out.println("A media é: " + media);

        /*Q03- Exercício 03 para o exercício 3 - (Escreva um algoritmo que calcule o diâmetro, a área e a
        circunferência de um círculo, sabendo que o único dado disponível é o seu raio
        double area, raio, diametro, circunferencia;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o raio do círculo: ");
        raio = s.nextDouble();
        area = Math.PI * Math.pow(raio, 2);
        System.out.println("Área do círculo é= " + area);
        diametro = 2 * raio;
        System.out.println("O diametro é: " + diametro);
        circunferencia = 2 * Math.PI * raio;
        System.out.println("A circunferencia é: " + circunferencia);

        /*Q04- Exercício 04 para o exercício 4 - (Crie um algoritmo que solicite e imprima os valores da diagonal maior,
        diagonal menor e calcule a área de um losango)
        double diag_maior, diag_menor, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe a diagonal maior do seu losango: ");
        diag_maior = s.nextDouble();
        System.out.print("Informe a diagonal menor do seu losango: ");
        diag_menor = s.nextDouble();
        area = (diag_maior * diag_menor) / 2;
        System.out.print("A área do seu losango é: " + area);

        /*Q05- Exercício 05 para o exercício 05- (Elaborar um algoritmo para calcular e apresentar o volume de uma lata
        de óleo, utilizando a fórmula, utilize uma variável PI como constante)

        double raio, altura, volume;
        Scanner s = new Scanner(System.in);
        System.out.println("Informe a altura(h) do sua lata de óleo (cilindro): ");
        altura = s.nextDouble();
        System.out.println("Informe o raio do sua lata de óleo (cilindro): ");
        raio = s.nextDouble();
        volume = Math.PI * (raio * raio) * altura;
        System.out.print("Este é o volume do sua lata de óleo(cilindro): " + volume);*/


        /*6. Escreva um algoritmo que pergunte o nome, a altura (em metros) e a massa (em Kg) do usuário.
                Em seguida, o programa deverá exibir uma mensagem dizendo o nome do usuário e a sua densidade corporal.

        double massa, altura, densidade;
        String nome = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = s.next();
        System.out.println("Digite sua altura(em metros): ");
        altura = s.nextDouble();
        System.out.println("Digite seu peso(massa): ");
        massa = s.nextDouble();
        densidade = massa / (altura * altura);
        System.out.println("Seu nome é: "  + nome + " e o seu IMC (índice de massa corporal) é: " + densidade) ;


        //Simulação de aposentadoria:
        int idade, meses_trabalho;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        idade = s.nextInt();
        System.out.print("Informe seu tempo de serviço: ");
        meses_trabalho = s.nextInt();
        if (idade >= 65) {
            System.out.println("Pode se aposentar: " + idade);
        } else if (meses_trabalho >= 30) {
            System.out.println("Pode se aposentar e sua idade é: " + idade + "Seu tempo de trabalho é de: ");
        } else if (idade >= 60 && meses_trabalho >= 25) {
            System.out.println("Pode se aposentar sua idade é de: " + idade + "Seu tempo de trabalho é: ");
        }*/
    }

}