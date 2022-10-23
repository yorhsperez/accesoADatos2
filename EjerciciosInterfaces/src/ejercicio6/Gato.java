package ejercicio6;

public class Gato extends Felino implements PuedeCaminar, PuedeNadar {

    @Override
    public void nadar() {
        System.out.println("El gato nada");
    }

    @Override
    public void caminar() {
        System.out.println("El gato camina");
    }
}
