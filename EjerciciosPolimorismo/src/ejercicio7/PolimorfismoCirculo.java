package ejercicio7;

import ejercicio6.Figura;

public class PolimorfismoCirculo extends PolimorfismoFigura {
    private double radio;

    public PolimorfismoCirculo(double radio) {
        this.radio = radio;
    }

    public PolimorfismoCirculo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    public PolimorfismoCirculo(double radio, String color, int[] posicion) {
        super(color, posicion);
        this.radio = radio;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        return 0;
    }
}
