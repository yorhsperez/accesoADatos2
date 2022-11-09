package ejercicio5;
public class Excepcion5 {
    public static void main(String[] args) {
        int num[]= {4,8,16,32,64,128,256,512};
        int den[]= {2,0,4,4,0,8};
        for(int i=0;i<num.length;i++){
            try{
                System.out.println(num[i]+"/"+den[i]+"="+num[i]/den[i]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("No existe esa posición en el vector");
            }catch(Throwable e){
                System.out.println("Ocurrió un error");
            }
        }
    }
}
