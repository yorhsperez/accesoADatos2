package ejercicio6;

public class Murcielago extends Mamifero implements PuedeVolar,PuedeCaminar {

    @Override
    public void volar() {
        System.out.println("El murcielago vuela");
    }

    public void caminar() {
        System.out.println("El murcielago camina");
    }
}

