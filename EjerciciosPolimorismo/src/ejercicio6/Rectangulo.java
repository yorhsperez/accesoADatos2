package ejercicio6;



public class Rectangulo extends Figura {
    private double lados[] = new double[2];

    public Rectangulo(double[]lados){
        this.lados[0]=lados[0];
        this.lados[1]=lados[1];
    }

    public Rectangulo(double[]lados,String color){
        super(color);
        this.lados[0]=lados[0];
        this.lados[1]=lados[1];

    }

    public Rectangulo(double[]lados,String color,int[]posicion){
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
}
