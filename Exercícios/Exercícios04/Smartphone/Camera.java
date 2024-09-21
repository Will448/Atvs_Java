package Exercícios.Exercícios04.Smartphone;

public class Camera {

    protected String resolução;

    public Camera(String resolução) {

        this.resolução = resolução;
    }

    public void setResolução(String resolução) {
        this.resolução = resolução;
    }

    public String getResolução() {
        return this.resolução;
    }
}
