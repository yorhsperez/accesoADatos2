import java.util.ArrayList;

public class Profesor extends Persona {
    //atributos curso y lista de notas arrayList double
    private Curso curso;
   private ArrayList<String>listaDeAsignaturas;

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

    //metodo toString de Profesor
    @Override
    public String toString() {
        return "Profesor{" + "curso=" + curso + ", listaDeAsignaturas=" + listaDeAsignaturas + '}';
    }
}