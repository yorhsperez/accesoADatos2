import java.util.ArrayList;

public class ListaCursos implements ILista {
    //arrayList de Cursos
    private ArrayList<Curso> listaCursos=new ArrayList<>();

    //metodo lista submenu
    public void gestionDeCursos(){
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
        listaCursos.add((Curso)objeto);
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
            if(curso.getCodigo().equals(codigoCurso)){
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

    //listar alumnos de un curso

}
