package TrabalhosAvaliativos.Trab02.Questão02;

import java.util.Scanner;

public class TestarVetorObjeto {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hello world");

        Produto[] p = new Produto[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Entre com um produto");
            Produto pdt = new Produto();
            pdt.setNome(s.nextLine());
            System.out.println("Entre com um valor");
            pdt.setValor(Double.parseDouble(s.nextLine()));
            p[i] = pdt;
        }
        System.out.println("QUER LISTAR OS PRODUTOS OU COMPARÁ-LOS? ");
        int opcao = s.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Listagem de produtos e valores ");
                for(int y = 0; y < p.length; y++){
                    System.out.println((y+1) + "°" + "Produto " + "é um/uma "+p[y].getNome() + "\n no valor de: R$ " +
                            p[y].getValor());
                }
                    break;
                case 2:
                    System.out.println("Entre com o produto que deseja procurar ");
                    String procurar = s.next();
                    System.out.println();
                    for (int i = 0; i < 10; i++) {
                    if (procurar.equals(p[i].getNome())) {
                        System.out.println("O " + (i + 1) + "º produto é igual ao procurado");
                    }
                    }break;
            default:
                System.out.println("Opção inválida" + opcao);
        }
        }
    }
/*
  Profe como eu compararia os produtos no código abaixo?
        *String nome = "";
        for (int i = 0; i < 3; i++) {
             nome = JOptionPane.showInputDialog(null, "Digite seus produtos");
            int v = (Integer.parseInt(JOptionPane.showInputDialog("Digite o valor")));
            JOptionPane.showMessageDialog(null, "Listagem" + nome + v);
            }
        for(int i = 0; i<3; i ++) {
            if (nome.equals(p[i]))

                JOptionPane.showMessageDialog(null, "O produto se encontra na lista" + i+1);
            else
                JOptionPane.showMessageDialog(null, "O produto não se encontra na lista");
        }*/
