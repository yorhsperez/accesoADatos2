package ejercicio8;

public class EmpleadoDistribucion extends Asalariado {
    private String region;

    public EmpleadoDistribucion(String nombre,long dni,int diasVacaciones,double salarioBase,String region) {
        super(nombre,dni,diasVacaciones,salarioBase);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    public double getSalario(){

        return 0;
    }
}
