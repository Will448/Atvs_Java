package TrabalhosAvaliativos.Trab02.Questão03;

public class Pessoa {

       private  String Nome;
       private  Pessoa Pai;
       private  Pessoa Mae;


    public String getNome() {
            return this.Nome;
        }

        public void setNome(String nome) {
            Nome = nome;
        }

        public Pessoa getPai() {
            return this.Pai;
        }

        public void setPai(Pessoa pai) {
            Pai = pai;
        }

        public Pessoa getMae() {
            return this.Mae;
        }

        public void setMae(Pessoa mae) {
            Mae = mae;
        }

    public Pessoa(String nome, Pessoa  pai, Pessoa mae) {
        Nome = nome;
        Pai = pai;
        Mae = mae;
    }
    public Pessoa(String nome) {
        Nome = nome;
        Pai = null;
        Mae = null;
    }

        public void ComparaSemantica(Pessoa h1 , Pessoa h2){
            if(h2.Nome.equals(h2.Nome)
                    &&
               h2.Mae.Nome.equals(h1.Mae.Nome)){

                System.out.println("Tem igualdade semântica entre os comparados");
            }else{
                System.out.println("Não possui igualdade semântica entre os comparados");
            }
        }

        public void ComparaIrmaos(Pessoa p1, Pessoa p2){
            if(p2.Mae.Nome.equals(p1.Mae.Nome)
                    &&
               p2.Pai.Nome.equals(p1.Pai.Nome)){

                System.out.println("São irmãos");
            }else{
                System.out.println("Não são irmãos");
            }
        }

        public void VerificaAntecessor(Pessoa antecessor, Pessoa antecessor2){
            if(antecessor.Mae.Nome.equals(antecessor2.Nome)){
                System.out.println("É a mãe do sujeito");
            }else if(antecessor.Mae.Mae.Nome.equals(antecessor2.Nome)){
                System.out.println("É mãe do pai do sujeito");
            }else if(antecessor.Pai.Pai.Nome.equals(antecessor2.Nome)) {
                System.out.println("É pai do pai do sujeito");
            } else if(antecessor.Mae.Pai.Nome.equals(antecessor2.Nome)) {
                System.out.println("É pai da mãe do sujeito");
            }else if(antecessor.Pai.Nome.equals(antecessor2.Nome)){
                System.out.println("É o pai sujeito");
            }else if(antecessor.Pai.Mae.Nome.equals(antecessor2.Nome)) {
                System.out.println("É mãe do pai do sujeito");
            }else{
                System.out.println("Não é antecessor de ninguém ");
            }
        }
    }