import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    Scanner sc = new Scanner(System.in);
    //arrayLisr de alumnos
    ListaAlumnos listaAlumnos=new ListaAlumnos();
    ListaProfesores listaProfesores=new ListaProfesores();
    ListaCursos listaCursos=new ListaCursos();




    public void menuPrincipal() {
        System.out.println("---------MENU PRINCIPAL---------");
        System.out.println("1. Gestion de cursos");
        System.out.println("2. Gestion de alumnos");
        System.out.println("3. Gestion de profesores");
        System.out.println("0. Salir");
        seleccion();
    }
    //mostrar submenu de listaAlumnos
    public void seleccion() {
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:

                seleccionCursosOpcion();
                break;
            case 2:
                seleccionAlumnosOpcion();
                break;
            case 3:
                seleccionProfesoresOpcion();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public void seleccionCursosOpcion(){

        while (true){

        listaCursos.gestionDeCursos();
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Introduzca el codigo del curso:");
                String codigoCurso = sc.next();
                System.out.println("Introduzca el nombre del curso:");
                String nombreCurso = sc.next();
                listaCursos.añadir(new Curso(codigoCurso, nombreCurso));

                break;
            case 2:
                System.out.println("Introduzca el codigo del curso:");
                String codigoCursoEliminar = sc.next();
                listaCursos.eliminar(codigoCursoEliminar);
                break;
            case 3:
                listaCursos.listar();
                break;
            case 4:
                System.out.println("Introduzca el codigo del curso:");
                String codigoCursoBuscar = sc.next();
                listaAlumnos.listarAlumnosDeUnCurso(codigoCursoBuscar);
                break;
            case 0:
                menuPrincipal();
                seleccion();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        }
    }

    public void seleccionAlumnosOpcion(){
        while (true){
            listaAlumnos.gestionAlumnos();
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    sc.nextLine();
                    System.out.println("Introduce el nombre del alumno:");
                    String nombreAlumno = sc.nextLine();
                    System.out.println("Introduce el DNI del alumno:");
                    String dniAlumno = sc.nextLine();
                    System.out.println("Introduce el telefono del alumno:");
                    String telefonoAlumno = sc.nextLine();
                    System.out.println("Introduce el codigo del curso:");
                    String codigoCurso = sc.nextLine();
                    System.out.println("Introduce el nombre del curso:");
                    String nombreCurso = sc.nextLine();
                    listaAlumnos.añadir(new Alumno(nombreAlumno, dniAlumno, telefonoAlumno, new Curso(codigoCurso, nombreCurso)));
                    break;
                case 2:
                    System.out.println("Introduce el DNI del alumno:");
                    String dniAlumnoEliminar = sc.nextLine();
                    listaAlumnos.eliminar(dniAlumnoEliminar);
                    break;
                case 3:
                    listaAlumnos.listar();
                    break;
                case 4:
                    listaAlumnos.ordenarAlfabeticamente();
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Introduce el codigo del curso:");
                    String codigoCursoBuscar = sc.nextLine();
                    listaAlumnos.listarAlumnosDeUnCurso(codigoCursoBuscar);
                    break;
                case 6:
                    sc.nextLine();
                    System.out.println("Introduce el DNI del alumno:");
                    String dniAlumnoBuscar = sc.nextLine();
                    listaAlumnos.buscar(dniAlumnoBuscar);
                    break;
                case 7:
                    sc.nextLine();
                    System.out.println("Añade la nota del alumno:");
                    double nota = sc.nextDouble();
                    System.out.println("Introduce el DNI del alumno:");
                    String dniAlumnoNota = sc.next();
                    listaAlumnos.añadirNota(dniAlumnoNota, nota);
                    break;
                case 8:
                    sc.nextLine();
                    System.out.println("Introduce el DNI del alumno:");
                    String dniAlumnoEliminarNota= sc.nextLine();
                    listaAlumnos.eliminarNotas(dniAlumnoEliminarNota);
                    break;
                case 9:
                    sc.nextLine();
                    System.out.println("Introduce el codigo del curso:");
                    String codigoCursoBuscarAlumnos = sc.nextLine();
                    System.out.println("----- Alumnos aproados -----");
                    listaAlumnos.listarAprobados(codigoCursoBuscarAlumnos);
                    break;
                case 10:
                    sc.nextLine();
                    System.out.println("Introduce el codigo del curso:");
                    String codigoCursoBuscarAlumnosSuspensos = sc.nextLine();
                    System.out.println("----- Alumnos suspensos -----");
                    listaAlumnos.listarSuspensos(codigoCursoBuscarAlumnosSuspensos);
                    break;
                case 0:
                    menuPrincipal();
                    seleccion();
                    break;
            }
        }
    }


    public void seleccionProfesoresOpcion(){
        while (true){
            listaProfesores.gestionProfesores();
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    sc.nextLine();
                    System.out.println("Introduce el nombre del profesor:");
                    String nombreProfesor = sc.nextLine();
                    System.out.println("Introduce el DNI del profesor:");
                    String dniProfesor = sc.nextLine();
                    System.out.println("Introduce el telefono del profesor:");
                    String telefonoProfesor = sc.nextLine();
                    System.out.println("Introduce el codigo del curso:");
                    String codigoCurso = sc.nextLine();
                    System.out.println("Introduce el nombre del curso:");
                    String nombreCurso = sc.nextLine();
                    listaProfesores.añadir(new Profesor(nombreProfesor, dniProfesor, telefonoProfesor, new Curso(codigoCurso, nombreCurso)));
                    System.out.println("Es tutor del curso? (SI/NO)");
                    String tutor = sc.nextLine();

                    listaProfesores.crearTutorDelCurso(dniProfesor, tutor,codigoCurso);

                    break;
                case 2:
                    System.out.println("Introduce el DNI del profesor:");
                    String dniProfesorEliminar = sc.nextLine();
                    listaProfesores.eliminar(dniProfesorEliminar);
                    break;
                case 3:
                    listaProfesores.listar();
                    break;
                case 4:
                    listaProfesores.ordenarProfesoresAlfabeticamente();
                    break;
                case 5:
                    System.out.println("----PROFESORES TUTORES----");
                    listaProfesores.listarProfesoresTutores();
                    break;
                case 6:

                    sc.nextLine();
                    System.out.println("Introduce el nombre de la asignatura:");
                    String nombreAsignatura = sc.nextLine();
                    listaProfesores.listarProfesoresPorAsignatura(nombreAsignatura);

                    break;
                case 7:
                    sc.nextLine();
                    System.out.println("Introduce el DNI del profesor:");
                    String dniProfesorBuscar = sc.nextLine();
                    listaProfesores.buscar(dniProfesorBuscar);
                    break;
                case 8:
                    sc.nextLine();
                    System.out.println("Añadir asignatura al profesor:");
                    String asignatura = sc.nextLine();
                    System.out.println("Introduce el DNI del profesor:");
                    String dniProfesorAsignatura = sc.nextLine();
                    listaProfesores.añadirAsignatura(dniProfesorAsignatura, asignatura);
                    break;
                case 9:
                    sc.nextLine();
                    System.out.println("Introduce el DNI del profesor:");
                    String dniProfesorEliminarAsignatura = sc.nextLine();
                    listaProfesores.eliminarAsignaturas(dniProfesorEliminarAsignatura);
                    break;
                case 0:
                    menuPrincipal();
                    seleccion();
                    break;
            }
        }
    }


    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.menuPrincipal();



    }
}
