package ejercicio2;

public class ItfPositivoImpresion implements ItfImpresion {

    @Override
    public void imprimir() {
        System.out.println("Que buen tiempo hace!");

    }
}
class ItfNegativoImpresion implements ItfImpresion {

    @Override
    public void imprimir() {
        System.out.println("Odio los lunes!");

    }
}

class ItfNeutro implements ItfImpresion,ItfImpresion2{

    @Override
    public void imprimir() {
        System.out.println("Las olas del mar");

    }

    @Override
    public void imprimirBonito() {
        System.out.println("--- Las olas del mar ---");
    }
}

//clase ItfPrueba que crea una instancia de la clase ItfNeutro y la clase ItfPositivoImpresion
class ItfPrueba{
    public static void main(String[] args) {
        ItfNeutro neutro = new ItfNeutro();
        neutro.imprimir();
        neutro.imprimirBonito();
        ItfNegativoImpresion negativo = new ItfNegativoImpresion();
        negativo.imprimir();

    }
}




