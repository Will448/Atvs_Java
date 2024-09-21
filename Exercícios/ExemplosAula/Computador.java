package Exercícios.ExemplosAula;

public class Computador {
        /*1- crie uma classe denominada computador que deve ter os seguintes atributos:
        modelo
        quantidade de memória
        capacidade de disco
        processador
        adicione métodos set e get para cada um deles*/

    String modelo;
    int qtd_memoria;
    int disco;
    String processador;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }

    public void setQtd_memoria(int qtd_memoria) {
        this.qtd_memoria = qtd_memoria;
    }
    public int getQtd_memoria(){
        return this.qtd_memoria;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }
    public int getDisco(){
        return this.disco;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
    public String getProcessador(){
        return this.processador;
    }
}