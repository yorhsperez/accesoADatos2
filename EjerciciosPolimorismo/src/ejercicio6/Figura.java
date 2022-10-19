package ejercicio6;

public class Figura {
    private String colorFigura;
    private int posicion[] = new int[2];


    public Figura() {
        this.posicion[0] = 0;
        this.posicion[1] = 0;
        this.colorFigura = "black";
    }

    public Figura(String colorFigura) {
        this.colorFigura = colorFigura;
    }

    public Figura(String colorFigura, int[] posicion) {
        this.colorFigura = colorFigura;
        this.posicion[0] = posicion[0];
        this.posicion[1] = posicion[1];
    }

    public String getColorFigura() {
        return colorFigura;
    }

    public void setColorFigura(String colorFigura) {
        this.colorFigura = colorFigura;
    }

    public int[] getPosicion() {
        return posicion;
    }

    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
    }
}
