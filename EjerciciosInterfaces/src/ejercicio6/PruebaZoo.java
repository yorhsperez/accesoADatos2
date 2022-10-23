package ejercicio6;

public class PruebaZoo {
    public static void main(String[] args) {
        Avestruz avestruz = new Avestruz();

        avestruz.caminar();

        Loro loro = new Loro();
        loro.caminar();
        loro.volar();
        Murcielago murcielago = new Murcielago();
        murcielago.caminar();
        murcielago.volar();

        Gato gato = new Gato();
        gato.caminar();
        gato.nadar();


    }
}
