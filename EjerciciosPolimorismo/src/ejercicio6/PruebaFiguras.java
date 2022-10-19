package ejercicio6;



public class PruebaFiguras {
    public static void main(String[] args) {
        int[]posicion = {10,20};
        double[]lados ={50d,100d};
        Circulo miCirculo = new Circulo(3d,"red",posicion);
        Rectangulo miRectangulo = new Rectangulo(lados,"blue",posicion);

        System.out.println(miCirculo.getRadio());
        int[]centro = miCirculo.getPosicion();
        System.out.println(centro[0]);
        System.out.println(centro[1]);
        System.out.println(miRectangulo.getColorFigura());
    }
}
