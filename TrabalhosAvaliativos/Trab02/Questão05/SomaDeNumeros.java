package TrabalhosAvaliativos.Trab02.Questão05;

    import javax.swing.*;
    import java.util.Scanner;

public class SomaDeNumeros {
    Scanner s = new Scanner(System.in);
    public void SomaDeNumeros() throws ExcecaoAcimaDeCem {

        int soma = 0;
        int media = 0;
        int qtd = 0;
        while (soma <= 100){
            System.out.println("Digite o valor para ser somado :)");
         //JOptionPane.showInputDialog("Digite o valor");
            int valor = s.nextInt();
            int num = 0;

            try{
                num = Integer.parseInt(String.valueOf(valor));
            }catch (Exception ex){
                System.out.println(" A entrada é inválida, entre com um novo número: ");
            }
            if (soma + num > 100){
                throw new ExcecaoAcimaDeCem();
            }
            else{
                soma += num;
                qtd ++;
                media = soma/qtd;

                System.out.println("A soma dos números digitados é de: " + soma);
                System.out.println("A quantidade de números digitados é de: " + qtd);
                System.out.println("A média dos números digitados é de: " + media);
            }
        }
        JOptionPane.showMessageDialog(null, "A soma" + soma);
        JOptionPane.showMessageDialog(null, "A quantidade" + qtd);
        JOptionPane.showMessageDialog(null, "A média é de" + media);
    }
}