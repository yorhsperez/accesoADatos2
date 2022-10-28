import java.util.ArrayList;

public class Profesor extends Persona {

    String respuestaTutor="NO";
    private Curso curso;
    String codCurso;
   private ArrayList<String>listaDeAsignaturas=new ArrayList<>();

   public Profesor(String nombre,String dni,String telefono){
       super(nombre,dni,telefono);

   }

    public Profesor(String nombre, String dni, String telefono,String curso) {

        super(nombre, dni, telefono);
        this.codCurso = curso;
    }

    public Profesor() {

    }

    //setter respuestaTutor
    public void setRespuestaTutor(String respuestaTutor) {
        this.respuestaTutor = respuestaTutor;
    }
    //getter respuestaTutor
    public String getRespuestaTutor() {
        return respuestaTutor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<String> getListaDeAsignaturas() {
        return listaDeAsignaturas;
    }

    public void setListaDeAsignaturas(ArrayList<String> listaDeAsignaturas) {
        this.listaDeAsignaturas = listaDeAsignaturas;
    }

    //metodo para añadir asignaturas
    public void añadirAsignatura(String asignatura){
        listaDeAsignaturas.add(asignatura);
    }
    //metodo para eliminar asignaturas
    public void eliminarAsignatura(String asignatura){
        listaDeAsignaturas.remove(asignatura);
    }



//getter codCurso
    public String getCodCurso() {
        return codCurso;
    }
    //setter codCurso
    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }


    //mostrar lista de cursos












   //metodo toString con toda la informacion del profesor

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + getNombre() + '\'' +
                ", dni='" + getDni() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", curso=" + codCurso +
                ", Es Tutor=" + respuestaTutor  +
                '}';
    }
}