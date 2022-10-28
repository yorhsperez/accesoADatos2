import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class ListaCursos implements ILista {
    //arrayList de Cursos
    private ArrayList<Curso> listaCursos = new ArrayList<>();


    //metodo lista submenu
    public void gestionDeCursos() {
        System.out.println("---------GESTION DE CURSOS---------");
        System.out.println("1. Añadir curso");
        System.out.println("2. Eliminar curso");
        System.out.println("3. Listar cursos");
        System.out.println("4. Mostrar alumnos de un curso");
        System.out.println("0. Salir");
        System.out.println("Eliga una opcion:");
        System.out.println("----------------------------------------");
    }


    @Override
    public void añadir(Object objeto) {
        listaCursos.add((Curso) objeto);
    }

    @Override
    public void buscar(String codigoCurso) {
        //buscar curso
        for (Curso curso : listaCursos) {
            if (curso.getCodigo().equals(codigoCurso)) {
                System.out.println(curso);
            }
        }
    }

    @Override
    public void eliminar(String codigoCurso) {
        //eliminar objeto curso que tenga el codigo que le pasamos

        try {


        for (Curso curso : listaCursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigoCurso)) {
                System.out.println("Curso eliminado es "+curso.toString());
                listaCursos.remove(curso);
            }
        }

        }catch (ConcurrentModificationException e){
            System.out.println("Eliminado");
        }

    }

    @Override
    public void listar() {
        //listar cursos
        for (Curso curso : listaCursos) {
            System.out.println(curso.toString());
        }

    }

    ///getter arraylist cursos
    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }


    //metodo para volver a true curso.isHayTutor() a true solo si esta en false


    //metodo para mostrar el dni del tutor de un curso

    public void añadirTutorAlCurso(String dniProfesor, String codigoCurso, String respuesta) {

        if (respuesta.equalsIgnoreCase("SI")) {


            for (Curso curso : listaCursos) {
                if (curso.getDniTutor().equalsIgnoreCase("no")) {


                    if (curso.getCodigo().equalsIgnoreCase(codigoCurso)) {
                        curso.setDniTutor(dniProfesor);
                    } else if (curso.getDniTutor().length()>2) {
                        System.out.println("El curso ya tiene tutor.");
                    }
                }

            }
        }
    }

    //metodo para definir tutor
    public void definirTutor(String dniProfesor) {
        for (Curso curso : listaCursos) {
            if(curso.getDniTutor().equalsIgnoreCase(dniProfesor)){
                curso.definirTutor(dniProfesor);

            }
        }
    }

}

