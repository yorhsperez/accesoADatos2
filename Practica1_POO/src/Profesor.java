import java.util.ArrayList;

public class Profesor extends Persona {

    private String esTutorDelCurso="";
    private Curso curso;
   private ArrayList<String>listaDeAsignaturas=new ArrayList<>();

    public Profesor(String nombre, String dni, String telefono,Curso curso) {

        super(nombre, dni, telefono);
        this.curso = curso;
    }

    //geter y setter de esTutorDelCurso
    public String getEsTutorDelCurso() {
        return esTutorDelCurso;
    }

    public void setEsTutorDelCurso(String esTutorDelCurso) {
        this.esTutorDelCurso = esTutorDelCurso;
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


   //Este metodo solo puede tener un profesor tutor del curso











   //metodo toString con toda la informacion del profesor

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + getNombre() + '\'' +
                ", dni='" + getDni() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", curso=" + curso +
                ", Es Tutor=" + esTutorDelCurso +
                '}';
    }
}