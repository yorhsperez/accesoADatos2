package ejercicio8;

public class Principal {
    public static void main(String[] args) {
        Asalariado empleado1 = new Asalariado("Manuel Cortina",12345678,28,1200);
        EmpleadoProduccion empleado2 = new EmpleadoProduccion("Jua Mota",55333222,30,1200,"noche");
        //Sacar por pantalla el nombre y sueldo de empleado1 y empleado2
        System.out.println("Nombre: "+empleado1.getNombre()+" - Sueldo: "+empleado1.getSalario());
        System.out.println("Nombre: "+empleado2.getNombre()+" - Sueldo: "+empleado2.getSalario());

        Asalariado empleadoX;
        empleadoX=empleado1;
        empleado1=empleado2;
        System.out.println("* * * * * * * * ");
        //Sacar por pantalla el nombre y sueldo de empleado1 y empleado2
        System.out.println("Nombre: "+empleado1.getNombre()+" - Sueldo: "+empleado1.getSalario());
        System.out.println("Nombre: "+empleado2.getNombre()+" - Sueldo: "+empleado2.getSalario());
        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Antonio Gil",55333666,35,1200,"Caceres");
        empleado1=empleadoX;
        System.out.println("* * * * * * * * ");
        //Sacar por pantalla nombre y sueldo de empleado1, empleado2 y empleado3,turno del empleado2, región del empleado3
        System.out.println("Nombre: "+empleado1.getNombre()+" - Sueldo: "+empleado1.getSalario());
        System.out.println("Nombre: "+empleado2.getNombre()+" - Sueldo: "+empleado2.getSalario()+" - Turno: "+empleado2.getTurno());
        System.out.println("Nombre: "+empleado3.getNombre()+" - Sueldo: "+empleado3.getSalario()+" - Región: "+empleado3.getRegion());
        Asalariado[] array_asal = new Asalariado[3];
        array_asal[0]=empleado1;
        array_asal[1]=empleado2;
        array_asal[2]=empleado3;
        System.out.println("* * * * * * * *- ");
        for (Asalariado a:array_asal) {
            System.out.println("Nombre: "+a.getNombre()+" - Sueldo: "+a.getSalario());
        }
    }



}
