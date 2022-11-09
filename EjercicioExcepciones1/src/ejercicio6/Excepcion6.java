package ejercicio6;

public class Excepcion6 {
    public static void main(String[] args) {
        int num[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int den[] = {2, 0, 4, 4, 0, 8};
        try {
            for (int i = 0; i < num.length; i++) {
                try {
                    System.out.println(num[i] + "/" + den[i] + "=" + num[i] / den[i]);
                } catch (ArithmeticException e) {
                    System.out.println("División por cero " + i);
                }
            }
        } catch (Throwable exception) {
            System.out.println("Ocurrió un error");
        }
        System.out.println("El programa continua aqui");
    }
}
