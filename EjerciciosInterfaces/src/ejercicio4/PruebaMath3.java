package ejercicio4;

public class PruebaMath3 {
    public static void main(String[] args) {
        Math3 aux = new Math3();
        int[] n = new int[12];

        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (100 * Math.random() + 1);
            System.out.println("n[" + i + "] = " + n[i]);
        }
        System.out.println("Minimo : " + aux.min(n));
        System.out.println("Maximo : " + aux.max(n));

    }
}
