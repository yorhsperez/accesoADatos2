public class Curso extends Profesor {
    //atributos codigo y nombre
    private String codigo;
    private String nombre;

    private String dniTutor;

    private boolean hayTutor=false;



    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dniTutor = "NO";

    }
    public Curso(){

    }

    //setter dniTutor
    public void setDniTutor(String dniTutor) {
        this.dniTutor = dniTutor;
    }
    //getter dniTutor
    public String getDniTutor() {
        return dniTutor;
    }

//geter y setter deHayTutor
    public boolean isHayTutor() {
        return hayTutor;
    }
    //setter deHayTutor
    public void setHayTutor(boolean hayTutor) {
        this.hayTutor = hayTutor;
    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //metodo que si dniTutor es igual a Profesor.getDni() , definir profesor.respuestaTutor como "SI"
    public void definirTutor(String dniProfesor){
        if (dniTutor.equalsIgnoreCase(dniProfesor)){
            setRespuestaTutor("SI");
        }
    }



    //metodo toString
    public String toString(){
        return "Codigo: "+codigo+" Nombre Curso: "+nombre+" Tutor: "+dniTutor;
    }




}
