package ejercicio7;


import ejercicio6.Figura;

public class PolimorfismoRectangulo extends PolimorfismoFigura {
    private double lados[] = new double[2];

    public PolimorfismoRectangulo(double[]lados){
        this.lados[0]=lados[0];//horizontal
        this.lados[1]=lados[1];//vertical
    }

    public PolimorfismoRectangulo(double[]lados, String color){
        super(color);
        this.lados[0]=lados[0];
        this.lados[1]=lados[1];

    }

    public PolimorfismoRectangulo(double[]lados, String color, int[]posicion){
        super(color,posicion);
        this.lados[0]=lados[0];
        this.lados[1]=lados[1];
    }

    public double[] getLados() {
        return lados;
    }

    public void setLados(double[] lados) {
        this.lados = lados;
    }

    @Override
    public double perimetro() {

        return ((2*this.getLados()[0])+(2*this.getLados()[1]));
    }
}
