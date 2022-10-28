public class Curso {
    //atributos codigo y nombre
    private String codigo;
    private String nombre;

    private int tieneTutor=1;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    //setter tutor tieneTutor
    public void setTieneTutor(int tieneTutor) {
        this.tieneTutor = tieneTutor;
    }
    //getter tutor tieneTutor
    public int isTieneTutor() {
        return tieneTutor;
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



    //metodo toString
    public String toString(){
        return "Codigo: "+codigo+" Nombre: "+nombre;
    }




}
