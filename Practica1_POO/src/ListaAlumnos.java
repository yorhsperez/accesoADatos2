import java.util.ArrayList;
import java.util.Comparator;

public class ListaAlumnos implements ILista {
    //arrayLiat de alumnos
    private ArrayList<Alumno> listaAlumnos;

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

    //metodo para añadir nota al objeto alumno
    public void añadirNota(Alumno alumno,double nota){
        alumno.getListaNotas().add(nota);
    }

    //metodo eliminar todas las notas de un alumno
    public void eliminarNotas(Alumno alumno){
        alumno.getListaNotas().clear();
    }

    //metodo listar alumnos aprobados que tienen media > 5.0
    public void listarAprobados(){
        for (Alumno alumno : listaAlumnos) {
            if(alumno.calcularMedia()>5.0){
                System.out.println(alumno.toString());
            }
        }
    }

    //metodo listar alumnos suspensos media < 5.0
    public void listarSuspensos(){
        for (Alumno alumno : listaAlumnos) {
            if(alumno.calcularMedia()<5.0){
                System.out.println(alumno.toString());
            }
        }
    }




}
