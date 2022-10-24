import java.util.ArrayList;

public class Principal {
    //arrayLisr de alumnos
    private ArrayList<Alumno> listaAlumnos;
    //arrayList de profesores
    private ArrayList<Profesor> listaProfesores;
    //arrayList de cursos
    private ArrayList<Curso> listaCursos;

    public void menuPrincipal() {
        System.out.println("---------MENU PRINCIPAL---------");
        System.out.println("1. Gestion de cursos");
        System.out.println("2. Gestion de alumnos");
        System.out.println("3. Gestion de profesores");
        System.out.println("0. Salir");
    }
}
