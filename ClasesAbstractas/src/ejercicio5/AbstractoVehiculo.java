package ejercicio5;

public abstract class AbstractoVehiculo {

    private String colorVehiculo;
    private byte numRuedas;
    private short cilindrada;
    private short potencia;

    /**
     * Constructor completo con todas las variables
     *
     * @param colorVehiculo
     * @param numRuedas
     * @param cilindrada
     * @param potencia
     */
    public AbstractoVehiculo(String colorVehiculo, byte numRuedas, short cilindrada, short potencia) {
        this.colorVehiculo = colorVehiculo;
        this.numRuedas = numRuedas;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public AbstractoVehiculo(String colorVehiculo, short cilindrada, short potencia) {
        this.colorVehiculo = colorVehiculo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    /**
     * Constructor vacio para casos a continuacion
     */
    public AbstractoVehiculo() {

    }

    /**
     * @return color de vehiculo
     */
    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public byte getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(byte numRuedas) {
        this.numRuedas = numRuedas;
    }

    public short getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(short cilindrada) {
        this.cilindrada = cilindrada;
    }

    public short getPotencia() {
        return potencia;
    }

    public void setPotencia(short potencia) {
        this.potencia = potencia;
    }

    /**
     *
      * @return metodo abstracto que obliga a clases hijas a sobreescribir el metodo
     */
    public abstract double impuesto();
}
