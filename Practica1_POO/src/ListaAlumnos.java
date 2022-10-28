import java.util.ArrayList;
import java.util.Comparator;

public class ListaAlumnos implements ILista {
    //arrayLiat de alumnos
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public void gestionAlumnos(){
        System.out.println("---------GESTION DE ALUMNOS---------");
        System.out.println("1. Añadir alumno");
        System.out.println("2. Eliminar alumno");
        System.out.println("3. Listar alumnos");
        System.out.println("4. Ordenar alfabeticamente");
        System.out.println("5. Mostar alumnos de un curso");
        System.out.println("6. Mostrar informacion alumno");
        System.out.println("7. Añaadir nota");
        System.out.println("8. Eliminar nota");
        System.out.println("9. Listar alumnos aprobados");
        System.out.println("10. Listar alumnos suspensos");
        System.out.println("0. Salir");
        System.out.println("Eliga una opcion:");
        System.out.println("----------------------------------------");
    }

    @Override
    public void añadir(Object objeto) {
        listaAlumnos.add((Alumno)objeto);

    }

    @Override
    public void buscar(String dni) {
        //buscar alumno y mostrar su toString
        for (Alumno alumno : listaAlumnos) {
            if(alumno.getDni().equals(dni)){
                System.out.println(alumno.toString());
            }
        }
    }

    @Override
    public void eliminar(String dni) {
        //eliminar alumno
        for (Alumno alumno : listaAlumnos) {
            if(alumno.getDni().equals(dni)){
                listaAlumnos.remove(alumno);
            }
        }

    }

    @Override
    public void listar() {
        //listar alumnos
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno.toString());
        }

    }
    //ordenar alfabeticamente objeto alumno de arrayList
    public void ordenarAlfabeticamente(){
        //mostrar el arraylist de alumnos por su nombre
        listaAlumnos.sort(Comparator.comparing(Alumno::getNombre));
        //y mostrar el arraylist

    }

   //metodo añadir nota del alumno con el dni
    public void añadirNota(String dni, double nota){
        //buscar alumno y añadir nota
        for (Alumno alumno : listaAlumnos) {
            if(alumno.getDni().equals(dni)){
                alumno.añadirNota(nota);
            }
        }
    }

    //metodo eliminar todas las notas de un alumno con dni
    public void eliminarNotas(String dni){
        //buscar alumno y eliminar notas
        for (Alumno alumno : listaAlumnos) {
            if(alumno.getDni().equals(dni)){
                alumno.eliminarNotas(dni);
            }
        }
    }


    //metodo listar alumnos aprobados de un curso codigo curso que tienen media > 5.0
    public void listarAprobados(String codigoCurso){
        //buscar curso y mostrar alumnos aprobados
        for (Alumno alumno : listaAlumnos) {
            if(alumno.getCurso().getCodigo().equals(codigoCurso)){
                if(alumno.calcularMedia()>5.0){
                    System.out.println(alumno.toString());
                }
            }
        }
    }


    //metodo listar alumnos suspensos de un curso codigo curso media < 5.0
    public void listarSuspensos(String codigoCurso){
        //buscar curso y mostrar alumnos suspensos
        for (Alumno alumno : listaAlumnos) {
            if(alumno.getCurso().getCodigo().equals(codigoCurso)){
                if(alumno.calcularMedia()<5.0){
                    System.out.println(alumno.toString());
                }
            }
        }
    }

    //listar alumnos de un curso
    public void listarAlumnosDeUnCurso(String codigoCurso){
        for (Alumno alumno : listaAlumnos) {
            if(alumno.getCurso().getCodigo().equals(codigoCurso)){
                System.out.println(alumno.toString());
            }
        }
    }




}
