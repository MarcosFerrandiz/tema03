public class Ejercicio5 {
    public static void main(String[] args) {
        int numero;
        int par = 0;
        int impar = 0;
        int numPar = 0;
        int numImpar = 0;
        int divisible5 = 0;
        int suma5 = 0;

        for (numero = 1; numero <= 100; numero++){

            if (numero % 2 == 0){
                par += 1;
                System.out.println(numero+ " PAR");
                numPar = numPar + numero;
            }else {
                impar += 1;
                System.out.println(numero+ " IMPAR");
                numImpar = numImpar + numero;
            }
            if (numero % 5==0){
                divisible5 += 1;
                System.out.println(" DIVISIBLE 5");
                suma5 = suma5 + numero;
            }
        }
        System.out.println("Hay " + par+" numeros pares y la suma de todos ellos da: "+numPar );
        System.out.println("Hay " + impar+" numeros impares y la suma de todos ellos da: "+numImpar);
        System.out.println("Hay " + divisible5 + " numeros divisibles entre 5 y su suma de todos ellos da: " +suma5);

    }
}
