package ejercicio7;

public abstract class PolimorfismoFigura {
    private String colorFigura;
    private int posicion[] = new int[2];


    public PolimorfismoFigura() {
        this.posicion[0] = 0;
        this.posicion[1] = 0;
        this.colorFigura = "black";
    }

    public PolimorfismoFigura(String colorFigura) {
        this.colorFigura = colorFigura;
    }

    public PolimorfismoFigura(String colorFigura, int[] posicion) {
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

    public abstract double perimetro();
}
