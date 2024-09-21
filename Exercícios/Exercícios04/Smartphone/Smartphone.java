package Exercícios.Exercícios04.Smartphone;


public class Smartphone {

    protected Ram ram;
    protected Processador processador;
    protected Camera camera;
    protected Bateria bateria;
    protected Tela tela;
    protected Aparelho aparelho;

    public Smartphone( Aparelho aparelho,Bateria bateria, Camera camera, Processador processador, Ram ram, Tela tela){
        this.bateria = bateria;
        this.camera = camera;
        this.processador = processador;
        this.ram = ram;
        this.tela = tela;
        this.aparelho = aparelho;
    }

    public void setAparelho(Aparelho aparelho) {
        this.aparelho = aparelho;
    }

    public Aparelho getAparelho() {
        return this.aparelho;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Processador getProcessador() {
        return this.processador;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Ram getRam() {
        return this.ram;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Camera getCamera() {
        return this.camera;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Bateria getBateria() {
        return this.bateria;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }

    public Tela getTela() {
        return this.tela;
    }

}