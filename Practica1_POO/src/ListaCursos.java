import java.util.ArrayList;

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
        //eliminar curso
        for (Curso curso : listaCursos) {
            if (curso.getCodigo().equals(codigoCurso)) {
                listaCursos.remove(curso);
            }
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
    public void volverATrue(String codigoCurso,String dniProfesor) {
        for (Curso curso : listaCursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigoCurso)) {
                if(!curso.isHayTutor()){
                    curso.setHayTutor(true);
                    curso.setDniTutor(dniProfesor);

                }else {
                    System.out.println("Ya hay un tutor asignado a este curso");
                }

            }
        }
    }

    //metodo para mostrar el dni del tutor de un curso

}
