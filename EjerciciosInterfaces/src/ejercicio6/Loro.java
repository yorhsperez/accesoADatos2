package ejercicio6;

public class Loro extends Aves implements PuedeCaminar,PuedeVolar{

    @Override
    public void caminar() {
        System.out.println("El loro camina");
    }

    @Override
    public void volar() {
        System.out.println("El loro vuela");
    }
}
