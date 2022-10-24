import java.util.ArrayList;

public class ListaAlumnos {
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
}
