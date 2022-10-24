import java.util.ArrayList;

public class Profesor extends Persona {
   //atributos curso y lista de notas arrayList double
    private Curso curso;
    private ArrayList<Double> listaNotas;

    //getter y setter
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public ArrayList<Double> getListaNotas() {
        return listaNotas;
    }
    public void setListaNotas(ArrayList<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }

    //metodo añadir asignatura
    public void añadirAsignatura(Curso curso){
        this.curso=curso;
    }
    //metodo eliminar asignatura
    public void eliminarAsignatura(Curso curso){
        this.curso=null;
    }

    //metodo toString
    public String toString(){
       return "Curso: "+curso+" Lista de notas: "+listaNotas;
    }

}
