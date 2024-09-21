package Exercícios.ExemplosAula;

public class ComputadorPrincipal {
        public static void main(String[] args) {

            System.out.println("Hello world");
            Computador comp1 = new Computador();
            Computador comp2 = new Computador();

            comp1.setModelo("Acer");
            comp1.setProcessador("Intel i7 2.6");
            comp1.setQtd_memoria(8);
            comp1.setDisco(500);

            comp2.setModelo("Lenovo");
            comp2.setProcessador("Intel Inside 2.6");
            comp2.setQtd_memoria(8);
            comp2.setDisco(500);

            System.out.println("As configurações são: ");
            System.out.println("Modelo: " + comp1.getModelo());
            System.out.println("Processador: " + comp1.getProcessador());
            System.out.println("Memoria: " + comp1.getQtd_memoria() + "Gb");
            System.out.println("Armazenamento: " + comp1.getDisco());

            System.out.println("");

            System.out.println("As configurações são: ");
            System.out.println("Modelo: " + comp2.getModelo());
            System.out.println("Processador: " + comp2.getProcessador());
            System.out.println("Memoria: " + comp2.getQtd_memoria() + " Gb");
            System.out.println("Armazenamento: " + comp2.getDisco());

        }
}
