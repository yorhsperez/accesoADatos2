package ejercicio2;

public class Excepcion2 {
    void miMetodo(){
        int numero[]=new int[5];
        try{
            System.out.println("Accesando a una posicion fuera del vector");
            numero[7]=0;
        }
        catch (ArrayIndexOutOfBoundsException excep)
        {
            System.out.println ("Ocurrio una excepcion");
        }
    }
}
