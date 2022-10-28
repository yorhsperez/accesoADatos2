import java.util.ArrayList;

public class Alumno extends Persona {
   //atributos curso y lista de notas arrayList double
    private Curso curso;
    private ArrayList<Double> listaNotas = new ArrayList<>();

    public Alumno(String nombre,String dni,String telefono,Curso curso){
        super(nombre,dni,telefono);
        this.curso=curso;

    }


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

    //metodo añadir nota double a listaNotas
    public void añadirNota(double nota){

        listaNotas.add(nota);
    }
    //metodo eliminar todas las notas del listaNotas con parametro DNI de Persona
    public void eliminarNotas(String dni){
        if(dni.equals(this.dni)){
            listaNotas.clear();
        }
    }

    //metodo para calcular media de las notas del arrayList listaNotas
    public double calcularMedia(){
        double media=0;
        for (Double nota : listaNotas) {
            media+=nota;
        }
        return media/listaNotas.size();
    }

   //metodo toString de Alumno con datos de persona
    public String toString(){
        return "Alumno{" + "nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + ", curso=" + curso +'}';
    }


}

