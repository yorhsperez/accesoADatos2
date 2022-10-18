package ejercicio5;

public class ACamion extends AbstractoVehiculo {

    private byte numeroDeEjes;

    /**
     *
     * @param numeroDeEjes Constructor con el parametro de la clase
     */
    public ACamion(byte numeroDeEjes) {

        this.numeroDeEjes = numeroDeEjes;
    }

    /**
     * Constructor con contructor de clase padre que se asignan los parametros correspondientes
     * @param color
     * @param numRuedas
     * @param numeroDeEjes
     * @param cilindrada
     * @param potencia
     */
    public ACamion(String color, byte numRuedas, byte numeroDeEjes, short cilindrada, short potencia){
        super(color,numeroDeEjes,cilindrada,potencia);
        this.numeroDeEjes=numeroDeEjes;
    }


    /**
     *
      * @return resultado de numero de ejes;
     */
    public byte getNumeroDeEjes() {
        return numeroDeEjes;
    }

    /**
     *
     * @param numeroDeEjes metodo que se le pasa un parametro y se asigna a la variable numeroDeEjes
     */
    public void setNumeroDeEjes(byte numeroDeEjes) {
        this.numeroDeEjes = numeroDeEjes;
    }

    @Override
    /**
     * Metodo que se implementa de la clase padre con el calculo de impuesto
     */
    public double impuesto() {
        double impuesto = (getCilindrada()/30)+(getPotencia()*20)+(getNumRuedas()*20)+(getNumeroDeEjes()*50);

        return impuesto;
    }
}
