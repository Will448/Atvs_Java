package TrabalhosAvaliativos.Trab02.Questão04;

import java.util.Scanner;

public class TesteTributavel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hello world");

        double saque = 0;

        ContaCorrente conta = new ContaCorrente(1000);

        System.out.println("Qual valor será depositado na conta corrente?");
        double valor = s.nextDouble();
        conta.depositar(valor);
        System.out.println("Gostaria de sacar algo? Se sim digite 1 e 2 para sair");
        int opcao = s.nextInt();
        if (opcao == 1) {
            System.out.println("Qual valor? ");
            saque = s.nextDouble();
            conta.sacar(saque);

        } else {
            opcao = 2;
            System.out.println("Você não sacou nada");
        }

        System.out.println("Seu tributo mensal na conta corrente é de: \n" + conta.calculaTributos(conta.obterSaldo()));
        System.out.println("Seu saldo na conta corrente é :\n" + conta.obterSaldo());

        ContaPoupança conta2 = new ContaPoupança(1000);
        int opcao1;

        System.out.println("Qual valor para depositar na conta poupança? ");
        double valor2 = s.nextDouble();
        conta2.depositar(valor2);
        conta2.Ver_Rendimento(conta2.obterSaldo());


        System.out.println("Deseja sacar algo? 1 para sim e 2 para não");
        opcao1 = s.nextInt();
        if (opcao1 == 1) {
            System.out.println("Qual valor para saque? ");
            double saque1 = s.nextDouble();
            conta2.sacar(saque1);
        } else {
            System.out.println("Voce não sacou nada");
        }
        System.out.println("Seu saldo na conta poupança é de:\n R$ " + conta2.obterSaldo());
    }
}