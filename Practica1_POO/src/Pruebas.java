public class Pruebas {
    public static void main(String[] args) {
        ListaCursos listaCursos = new ListaCursos();
        listaCursos.añadir(new Curso("1", "Programacion"));
        listaCursos.añadir(new Curso("2", "Matematicas"));
        listaCursos.listar();
        ListaProfesores listaProfesores = new ListaProfesores();
        listaProfesores.añadir(new Profesor("Juan Perez", "12345678A", "12345","1" ));
        listaProfesores.añadir(new Profesor("Maria Gomez", "87654321B", "12345","1" ));
        //listaProfesores.listar();
        listaCursos.volverATrue("2", "12345678A");



        System.out.println("Cursos");
        listaCursos.listar();
        System.out.println("Cursos con tutor");
        //listaCursos.mostrarDniTutor();
       // listaProfesores.comprobarCualesElTutorDelCurso("12345678A");

        listaCursos.volverATrue("2", "12345678A");

        System.out.println("Dni de tutores");
        listaProfesores.esTutor();




    }
}
