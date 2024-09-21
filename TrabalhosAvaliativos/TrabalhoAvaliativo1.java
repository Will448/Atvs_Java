package TrabalhosAvaliativos;

import java.util.Scanner;

public class TrabalhoAvaliativo1 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner s = new Scanner(System.in);
        //Alunos: Willian V. Bongiovanni e Julia Cacciatori
        //Professor: Jackson Meires Dantas Canuto

        //Questão 1 para questão 1

       /* 1. Escreva um programa em Java que receba do usuário um valor e então calcule e exiba a soma
        de todos os números ímpares entre 0 e aquele valor.

        int total = 0;
        int valor;
        System.out.println("Digite um número para o cálculo: ");
        valor = s.nextInt();
        for (int x = 0; x <= valor; x++) {

            if (x%2!=0) {
                total = total +x;
            }
        }
        System.out.println("A Soma dos números impares do valor digitado é de: " + total);*/

        //Questão 2 para questão 2

        /*2. Escreva um programa em Java que recebe seu dia, mês e ano de nascimento e em seguida
apresenta ao usuário um menu de opções numéricas onde ele pode escolher qual dessas
informações ele quer imprimir, ou se quer imprimir a data no formato Dia/Mês/Ano. Imprima a
opção selecionada, encerrando o programa.

        int dia, mes, ano, opçao;

        System.out.println("Digite seu dia de nascimento:");
        dia = s.nextInt();
        System.out.println("Digite seu mês de nascimento:");
        mes = s.nextInt();
        System.out.println("Digite seu ano de nascimento:");
        ano = s.nextInt();

        System.out.println("Escolha uma das opções:  ");
        System.out.println("Opção 1: Imprimir somente o dia do seu nascimento.");
        System.out.println("Opção 2: Imprimir somente o mes do seu nascimento.");
        System.out.println("Opção 3: Imprimir somente o ano do seu nascimento.");
        System.out.println("Opção 4: Imprimir sua data de nascimento completa.");
        opçao = s.nextInt();

        switch (opçao) {
            case 1:
                System.out.println("Você escolheu a opção 1");
                System.out.println("Seu dia de nascimento é: " + dia);
                break;
            case 2:
                System.out.println("Você escolheu a opção 2");
                System.out.println("Seu mes de nascimento é: " + mes);
                break;
            case 3:
                System.out.println("Você escolheu a opção 3");
                System.out.println("Seu ano de nascimento é: " + ano);
                break;
            case 4:
                System.out.println("Sua data de nascimento é: " + dia + "/" + mes + "/" + ano);
                break;
            default:
                System.out.println("Está é uma opção inválida");
                break;

        }*/

        //Questão 3 para questão 3

        /*3. Precisamos escrever um programa em Java que tenha na saída padrão, o texto:

        Olá ‘jogador’.
        Bem-vindo ao “Campo \\ Azul”.*/
        //Utilizamos o comando: E usamos o metodo de saída println.
        //    System.out.println("Olá 'jogador'.\n Bem-vindo ao \" Campo \\\\ Azul\"");

        //Questão 4 para questão 4

       /* 4. Escreva um programa em Java que receba da entrada padrão, um inteiro que representa um
        valor em reais e então calcula o mínimo de notas que podemos utilizar para representar aquele
        valor, imprimindo as notas utilizadas na saída padrão. Considere a nota de 1 real uma nota
        válida.

        int Valor;
        int Sobra;
        int Quantnotas100=0;
        int Quantnotas50=0;
        int Quantnotas20=0;
        int Quantnotas10=0;
        int Quantnotas5=0;
        int Quantnotas2=0;
        int Quantnotas1=0;

        System.out.println("Coloque o valor desejado para retirada: ");
        Valor = s.nextInt();

        Quantnotas100= Valor/100;
        Sobra= Valor%100;
        Quantnotas50= Sobra/50;
        Sobra= Sobra%50;
        Quantnotas20= Sobra/20;
        Sobra=Sobra%20;
        Quantnotas10= Sobra/10;
        Sobra=Sobra%10;
        Quantnotas5= Sobra/5;
        Sobra=Sobra%5;
        Quantnotas2= Sobra/2;
        Sobra=Sobra%2;
        Quantnotas1= Sobra/1;
        Sobra=Sobra%1;

        System.out.println(Quantnotas100 + " nota(s) de R$ 100.00");
        System.out.println(Quantnotas50 + " nota(s) de R$ 50.00");
        System.out.println(Quantnotas20 + " nota(s) de R$ 20.00");
        System.out.println(Quantnotas10 + " nota(s) de R$ 10.00");
        System.out.println(Quantnotas5 + " nota(s) de R$ 5.00");
        System.out.println(Quantnotas2 + " nota(s) de R$ 2.00");
        System.out.println(Quantnotas1 + " nota(s) de R$ 1.00"); */

        //Questão 5 para questão 5

       /*Escreva um programa em Java que exiba um menu ao usuário contendo três opções:

        1. Fatorial
        2. Soma dos antecessores
        3. Sair
        Em seguida, após receber uma das opções acima, o programa calcula o que for pedido,recebendo os números
        necessários do usuário para executar o cálculo. O programa deve
        exibir novamente o menu após o resultado até que a opção 3 seja escolhida.
        //Professor não consegui fazer com que o programa volte para a 1ºalternativa e tirar o loop da opção 3.

        int Fat = 1, Soma = 0, Opcao = 0, Valor, Numero;

        do {
            System.out.println("Menu de operações");
            System.out.println("fatorial ~> 1");
            System.out.println("Para a soma dos antecessores ~> 2");
            System.out.println("Para sair ~> 3");
            Opcao = s.nextInt();
            switch (Opcao) {

                case 1:
                    System.out.println("Entre com um número para realizar a soma fatorial");
                    Valor = s.nextInt();
                    for (int x = 2; x <= Valor; x++) {
                        Fat *= x;
                    }
                    System.out.println("O fatorial de " + Valor + " é igual a " + Fat);
                    break;
                case 2:
                    System.out.println("Insira um número para realizar a soma dos antecessores");
                    Numero = s.nextInt();

                    for (int x = 0; x < Numero; x++) {
                        Soma = Soma + x;
                    }
                    System.out.println("O resultado da soma dos números antecessores é: " + Soma);
                    break;
                case 3:
                    System.out.println("Você escolheu a opção de sair do programa. ");
                    break;
                default:
                    System.out.println("Está é uma opção inválida");
                    break;
            }
        } while (Opcao != 3);*/


        // Questão 6 para questão 6

        /*Faça um programa em Java que leia o código dos itens pedidos e as quantidades desejadas.
Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido.
Considere que o cliente deve informar 0 (zero) quando o pedido deve ser encerrado.

        double soma=0;
        int opcao =1;
        int quant =1;

        System.out.println("Especificação Código Preço");
        System.out.println("Refrigerante 105 R$ 3,00");
        System.out.println("Cheeseburguer 104 R$ 9,30");
        System.out.println("Cachorro Quente 100 R$ 5,20");
        System.out.println("Bauru com ovo 102 R$ 6,50");
        System.out.println("Bauru Simples 101 R$ 4,30");
        System.out.println("Hambúrguer 103 R$ 8,20");
        while(opcao!=0){
            System.out.println("Insira o código do pedido ou 0 para sair:");
            opcao = s.nextInt();
            System.out.println("Insira a quantidade desejada: (se quiser sair e finalizar o pedido digite 0) ");
            quant = s.nextInt();
            if(opcao==103){
                soma=soma+(8.2 * quant);
            }
            if(opcao==101){
                soma=soma+(4.3 * quant);
            }
            if(opcao==102){
                soma=soma+(6.5 * quant);
            }
            if(opcao==100){
                soma=soma+(5.2 * quant);
            }
            if(opcao==104){
                soma=soma+(9.3 * quant);
            }
            if(opcao==105){
                soma=soma+(3.0 * quant);
            }

        }
        System.out.println("A soma total do pedido é de: " +soma);*/

    }
}