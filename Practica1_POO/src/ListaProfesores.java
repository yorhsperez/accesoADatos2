import java.util.ArrayList;
import java.util.Objects;

public class ListaProfesores implements ILista {
    //arrayList de profesores


    private ArrayList<Profesor> listaProfesores = new ArrayList<>();
    ListaCursos listaCursos = new ListaCursos();

    public void gestionProfesores() {
        System.out.println("---------GESTION DE PROFESORES---------");
        System.out.println("1. Añadir profesor");
        System.out.println("2. Eliminar profesor");
        System.out.println("3. Listar profesores");
        System.out.println("4. Ordernar alfabeticamente");
        System.out.println("5. Listar profesores tutores");
        System.out.println("6. Listar profesores de una asignatura");
        System.out.println("7. Mostrar informacion profesor");
        System.out.println("8. Añadir asignatura");
        System.out.println("9. Eliminar asignaturas de profesor");
        System.out.println("0. Salir");
        System.out.println("Eliga una opcion:");
        System.out.println("----------------------------------------");

    }

    @Override
    public void añadir(Object objeto) {
        listaProfesores.add((Profesor) objeto);
    }

    @Override
    public void buscar(String dni) {
        for (Profesor profesor : listaProfesores) {
            if (profesor.getDni().equals(dni)) {
                System.out.println(profesor);
            }
        }
    }

    @Override
    public void eliminar(String dni) {
        //eliminar profesor
        for (Profesor profesor : listaProfesores) {
            if (profesor.getDni().equals(dni)) {
                listaProfesores.remove(profesor);
            }
        }
    }

    @Override
    public void listar() {
        //listar profesores
        for (Profesor profesor : listaProfesores) {
            System.out.println(profesor.toString());
        }

    }

    //Metodo parta mostrar un profesor con su toString
    public void mostrarProfesor(Profesor profesor) {
        System.out.println(profesor.toString());
    }

    //Metodo para eliminar asignaturas de un profesor
    public void eliminarAsignaturas(Profesor profesor, String asignatura) {
        profesor.getListaDeAsignaturas().remove(asignatura);
    }

    //metodo listar profesores por asignatura
    public void listarProfesoresPorAsignatura(String asignatura) {
        for (Profesor profesor : listaProfesores) {
            if (profesor.getListaDeAsignaturas().contains(asignatura)) {
                System.out.println(profesor.toString());
            }
        }
    }

    //metodo ordenar profesores alfabeticamente
    public void ordenarProfesoresAlfabeticamente() {
        listaProfesores.sort((Profesor p1, Profesor p2) -> p1.getNombre().compareTo(p2.getNombre()));
    }

    //metodo añadir tutor solo uno por codigo de curso


    //metodo listar profesores tutores
    public void listarProfesoresTutores() {
        for (Profesor profesor : listaProfesores) {
            if (profesor.getRespuestaTutor().equalsIgnoreCase("si")) {
                System.out.println(profesor.toString());
            }
        }
    }


    //metodo para añadir asignaturas a un profesor
    public void añadirAsignatura(String dni, String asignatura) {
        for (Profesor profesor : listaProfesores) {
            if (profesor.getDni().equals(dni)) {
                profesor.getListaDeAsignaturas().add(asignatura);
            }
        }
    }

    ///metodo eliminar todas las asignaturas de un profesor
    public void eliminarAsignaturas(String dni) {
        for (Profesor profesor : listaProfesores) {
            if (profesor.getDni().equals(dni)) {
                profesor.getListaDeAsignaturas().clear();
            }
        }
    }

    public void esTutor() {
        System.out.println(listaCursos.getListaCursos().size());
    }

    }


