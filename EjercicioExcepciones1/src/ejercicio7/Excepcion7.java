package ejercicio7;

public class Excepcion7 {
    public static void main(String[] args) {
        int t;
        int i = 1;//Pasas el valor 0,1,2.
        int num[] = {2, 4, 6};
        System.out.println("Recibiendo " + i);
        try {
            switch (i) {
                case 0:
                    t = 10 / i;
                    break;
                case 1:
                    num[4] = 4;
                    break;
                case 2:
                    return;
            }
        } catch (ArithmeticException e) {
            System.out.println("División por cero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Acceso a posición fuera del vector");
        } finally {
            System.out.println("Ejecutando código de limpieza");
        }
    }
}
