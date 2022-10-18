package ejercicio5;

public class APruebaVehiculos {
    public static void main(String[] args) {
        //Instanciamos objetos motocicleta con diferentes constructores
        AMotocicleta MotoBarata1 = new AMotocicleta("Rojo", (short) 125, (short) 25);
        AMotocicleta MotoBarata2 = new AMotocicleta("Rojo", (short) 125, (short) 25);
        AMotocicleta MotoCara = new AMotocicleta("Amarillo", (short) 1000, (short) 90);
        ACamion CamionNormal = new ACamion("Rojo", (byte) 4, (byte) 2, (short) 4000, (short) 300);
        ACamion CamionEnorme = new ACamion("Rojo", (byte) 24, (byte) 6, (short) 15000, (short) 800);

        MotoBarata1.setNumeroDePlazas((byte) 1);
//        System.out.println(MotoBarata1.getNumeroDePlazas());
//        System.out.println(MotoBarata2.getCilindrada());
//        System.out.println(CamionEnorme.getNumeroDeEjes());
        //pollo

        System.out.println(MotoBarata1.impuesto());
        System.out.println(MotoBarata2.impuesto());
        System.out.println(MotoCara.impuesto());
        System.out.println(CamionNormal.impuesto());
        System.out.println(CamionEnorme.impuesto());
    }
}
