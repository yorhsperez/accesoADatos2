package ejercicio5;

public class AMotocicleta extends AbstractoVehiculo {
    private byte numeroDePlazas;

    /**
     * Contructor con la variable de la clase
     *
     * @param numeroDePlazas
     */
    public AMotocicleta(byte numeroDePlazas) {
        this.numeroDePlazas = numeroDePlazas;
    }

    /**
     * Constructor con constructor de clase padre que se le asignan los parametros correspondientes.
     *
     * @param color
     * @param cilindrada
     * @param potencia
     */
    public AMotocicleta(String color, short cilindrada, short potencia) {
        super(color, cilindrada, potencia);
    }

    @Override
    /**
     * Metodo que se implementa de la clase padre con el calculo de impuesto
     */
    public double impuesto() {
        double impuesto = (getCilindrada() / 30) + (getPotencia() * 30);
        return impuesto;
    }

    /**
     * @return el resultado de numeroDePlazas
     */
    public byte getNumeroDePlazas() {
        return numeroDePlazas;
    }

    /**
     * @param numeroDePlazas metodo que se le pasa un parametro y se asigna a la variable numeroDePlazas
     */
    public void setNumeroDePlazas(byte numeroDePlazas) {
        this.numeroDePlazas = numeroDePlazas;
    }
}
