public class Ejercicio3 {
    public static void main(String[] args) {
        int i = 1;
        int a = 0;
        int cantidad = 9;
        for (i = 1; i <= cantidad; i++) {
            System.out.printf("%" + (cantidad - i + 1) +"s","");
            for (a = 1; a <= i; a++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
