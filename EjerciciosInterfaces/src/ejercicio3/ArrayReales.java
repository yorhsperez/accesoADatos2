package ejercicio3;

public class ArrayReales implements Estadisticas {
    public double[] valor;


    //Inicializa el atributo array con numeros aleatorios
    public void asignar(){
        valor = new double[10];
        for (int i = 0; i < valor.length; i++) {
            valor[i] = Math.random();
        }
    }

    /// imprime los valores del vector
    public void imprimir(){
        for (int i = 0; i < valor.length; i++) {
            System.out.println(valor[i]);
        }
    }

    @Override
    public double minimo() {
        //calcular el valor minimo de un array double
        double min = valor[0];
        for (int i = 0; i < valor.length; i++) {
            if (valor[i] < min) {
                min = valor[i];
            }
        }
        return min;
    }

    @Override
    public double maximo() {
        //calcular el valor maximo de un array double
        double max = valor[0];
        for (int i = 0; i < valor.length; i++) {
            if (valor[i] > max) {
                max = valor[i];
            }
        }
        return max;
    }

    @Override
    public double sumatorio() {
        //calcular el sumatorio de un array double
        double sum = 0;
        for (int i = 0; i < valor.length; i++) {
            sum += valor[i];
        }
        return sum;
    }
}
