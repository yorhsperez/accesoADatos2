package ejercicio4;

public final class Math3 implements Extremos {

    @Override
    public int min(int[] a) {
        //devuelve el mínimo de un array de enteros
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    @Override
    public int max(int[] a) {
        //devuelve el máximo de un array de enteros
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    @Override
    public double min(double[] a) {
        //devuelve el mínimo de un array de reales
        double min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    @Override
    public double max(double[] a) {
        //devuelve el máximo de un array de reales
        double max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
