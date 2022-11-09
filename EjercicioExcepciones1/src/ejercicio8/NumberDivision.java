package ejercicio8;

public class NumberDivision {
    public void division(String num1,String num2){
        try{
            int n1=Integer.parseInt(num1);
            int n2=Integer.parseInt(num2);
            System.out.println(n1/n2);
        }catch(NumberFormatException e){
            System.out.println("Error: "+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }

    }

}
