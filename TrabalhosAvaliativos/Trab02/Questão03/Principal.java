package TrabalhosAvaliativos.Trab02.Questão03;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hello world :)");
        Scanner s = new Scanner(System.in);

        Pessoa bisavo = new Pessoa("Pedro");
        Pessoa bisavo2 = new Pessoa("Cláudia");
        Pessoa avo1 = new Pessoa("Rafael");
        Pessoa avo2 = new Pessoa("Tereza", bisavo, bisavo2);
        Pessoa avo3 = new Pessoa("Paula", bisavo, bisavo2);
        Pessoa avo4 = new Pessoa("Luan");
        Pessoa FilhaBis = new Pessoa("Larissa", bisavo, bisavo2);
        Pessoa Mae = new Pessoa("Rafaela");
        Pessoa Pai = new Pessoa("Eurides", avo1, avo2);
        Pessoa Mae2 = new Pessoa("Antonella", avo3, avo4);
        Pessoa Pai2 = new Pessoa("Thiago");
        Pessoa Filhavo = new Pessoa("Priscila", avo3, avo4);
        Pessoa Filho = new Pessoa("Kaike", Pai, Mae);
        Pessoa Filha = new Pessoa("Eliane", Pai, Mae);
        Pessoa Filha2 = new Pessoa("Patricia", Pai2, Mae2);
        Pessoa Filha3 = new Pessoa("Luciana", Pai2, Mae2);


        System.out.println("Para a verificar a semantica digite 1 \n Para comparar se é irmãos digite 2 \n" +
                "Para verificar seu antecessor digite 3 \n Digite 4 para listar a árvore genealógica");
       int verificar = s.nextInt();
        switch (verificar) {
            case 1:

       /* System.out.println("Qual pessoa você quer comparar");
        Pessoa p = new Pessoa("");
        p.setNome(s.nextLine());
        System.out.println("Qual pessoa você quer comparar");
        Pessoa p1 = new Pessoa("");
        p.setNome(s.nextLine());*/

                System.out.println("Algumas comparações semânticas: ");

                Filha.ComparaSemantica(Filha, Filho);
                Pai.ComparaSemantica(Pai, Filha2);
                Mae2.ComparaSemantica(Mae2,Mae );
                avo1.ComparaSemantica(avo1,bisavo2);
                bisavo.ComparaSemantica(bisavo,avo4);

            case 2:
                System.out.println("Algumas comparações de irmandade: ");
                Filha.ComparaIrmaos(Filha, Filho);
                Filha2.ComparaIrmaos(Filha2,Filha3);
                FilhaBis.ComparaIrmaos(FilhaBis, Filho);
                Filhavo.ComparaIrmaos(Filhavo,FilhaBis);
                Pai.ComparaIrmaos(Pai,Pai2);

            case 3:
                Filha.VerificaAntecessor(Pai, avo2);
                Filha2.VerificaAntecessor(Pai2, avo3);
                Pai.VerificaAntecessor(avo1,bisavo2);
                avo2.VerificaAntecessor(bisavo, bisavo2);
                Filho.VerificaAntecessor(Pai, Mae);

            case 4:
                System.out.println (avo2.getNome() + "Seu pai é o: " + avo2.getPai().getNome());
                System.out.println (avo2.getNome() + "Sua mãe é a: " + avo2.getMae().getNome());
                System.out.println (avo3.getNome() + "Seu pai é o: " + avo2.getPai().getNome());
                System.out.println (avo3.getNome() + "Sua mãe é a: " + avo2.getMae().getNome());
                System.out.println (FilhaBis.getNome() + "Seu pai é: " + FilhaBis.getPai().getNome());
                System.out.println (FilhaBis.getNome() + "Sua mãe é a: " + FilhaBis.getMae().getNome());
                System.out.println (Pai.getNome() + "Seu pai é o: " + Pai.getPai().getNome());
                System.out.println (Pai.getNome() + "Sua mãe é a: " + Pai.getMae().getNome());
                System.out.println (Mae2.getNome() + "Seu pai é o: " + Mae2.getPai().getNome());
                System.out.println (Mae2.getNome() + "Sua mãe é a: " + Mae2.getMae().getNome());
                System.out.println (Filhavo.getNome() + "Seu pai é o: " + Filhavo.getPai().getNome());
                System.out.println (Filhavo.getNome() + "Sua mãe é a: " + Filhavo.getMae().getNome());
                System.out.println (Filho.getNome() + "Seu pai é o: " + Filho.getPai().getNome());
                System.out.println (Filho.getNome() + "Sua mãe é a: " + Filho.getMae().getNome());
                System.out.println(Filha.getNome() + " Seu pai é o: " + Filha.getPai().getNome());
                System.out.println(Filha.getNome() + " Sua mãe é a: " + Filha.getMae().getNome());
                System.out.println(Filha2.getNome() + " Seu pai é o: " + Filha3.getPai().getNome());
                System.out.println(Filha2.getNome() + " Sua mãe é a: " + Filha3.getMae().getNome());
                System.out.println(Filha3.getNome() + " Seu pai é o: " + Filha3.getPai().getNome());
                System.out.println(Filha3.getNome() + " Sua mãe é a: " + Filha3.getMae().getNome());
                

               
               

            default:
                System.out.println("Opção inválida");
        }
    }
    }