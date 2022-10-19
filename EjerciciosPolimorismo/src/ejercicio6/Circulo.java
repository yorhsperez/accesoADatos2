package ejercicio6;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    public Circulo(double radio, String color, int[] posicion) {
        super(color, posicion);
        this.radio = radio;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
