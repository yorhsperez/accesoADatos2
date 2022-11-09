package ejercicio1;

public class Exepcion1 {
    public static void main(String args[]) {

        //añadir try-catch
        try{
            int numero[] = new int[5];
            numero[7] = 0;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
