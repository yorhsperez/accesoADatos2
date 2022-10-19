package ejercicio7;

import java.sql.SQLOutput;

public class PolimorfismoPruebaFiguras {
    public static void main(String[] args) {
        int[]posicion={10,20};
        double[]lados = {50d,100d};
        PolimorfismoFigura miCirculo = new PolimorfismoCirculo(3d,"red",posicion);
        PolimorfismoFigura miRectangulo = new PolimorfismoRectangulo(lados,"blue",posicion);

        System.out.println("Mi circulo perimetro: "+miCirculo.perimetro());
        System.out.println("Mi rectangulo perimetro: "+miRectangulo.perimetro());

        //¡Atención acceso a los métodos de la subclase!!!!!
        PolimorfismoCirculo instanciaCirculo = (PolimorfismoCirculo) miCirculo;
        System.out.println(instanciaCirculo.getRadio());


        System.out.println(((PolimorfismoCirculo)miCirculo).getRadio());
        int[]lados2 = (((PolimorfismoRectangulo)miRectangulo).getPosicion());
        System.out.println(lados2[0]);
        System.out.println(lados2[1]);
    }
}
