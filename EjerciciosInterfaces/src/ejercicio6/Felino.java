package ejercicio6;

public class Felino extends Mamifero implements PuedeCaminar, PuedeNadar {

    @Override
    public void caminar() {
        System.out.println("El felino camina");
    }

    @Override
    public void nadar() {
        System.out.println("El felino nada");
    }
}

