package ejercicio5;

public class PruebaCantar {
    public static void main(String[] args) {
        Persona pavaroti = new Persona();
        Gallo claudio = new Gallo();
        Canario canario = new Canario();

        hacerCantar(pavaroti);
        hacerCantar(claudio);
        hacerCantar(canario);

    }

    public static void hacerCantar(PuedeCantar cantor) {
        cantor.cantar();
    }
}
