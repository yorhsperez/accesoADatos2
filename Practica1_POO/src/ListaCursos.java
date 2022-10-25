import java.util.ArrayList;

public class ListaCursos implements ILista {
    //arrayList de Cursos
    private ArrayList<Curso> listaCursos;

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
        //añadir curso al arrayList
        listaCursos.add((Curso)objeto);
    }

    @Override
    public void buscar(Object objeto) {
        //buscar curso y mostrar su toString
        for (Curso curso : listaCursos) {
            if(curso.equals(objeto)){
                System.out.println(curso.toString());
            }
        }
    }

    @Override
    public void eliminar(Object objeto) {
        //eliminar curso del arrayList
        listaCursos.remove((Curso)objeto);

    }

    @Override
    public void listar() {
        //listar cursos
        for (Curso curso : listaCursos) {
            System.out.println(curso.toString());
        }

    }
}
