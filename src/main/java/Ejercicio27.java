import java.util.Arrays;
import java.util.Random;

public class Ejercicio27 {
    public Ejercicio27(){
        int[] operando1 = new int[50];
        int[] operando2 = new int[20];
        int[][] resultado = new int[50][20];
        operando1 = llenarArray(operando1);
        operando2 = llenarArray(operando2);
        for (int i = 0; i < resultado.length; i++){
            for (int j = 0; j < resultado[i].length; j++){
                resultado[i][j] = operando1[i] * operando2[j];
            }
        }
        visualizarMatriz(resultado);
        System.out.println(Arrays.toString(operando1));
        System.out.println("");
        System.out.println(Arrays.toString(operando2));
    }
    public static void visualizarMatriz(int[][] matriz){
        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < matriz[i].length; j++) {
                System.out.printf("%-5d",matriz[i][j]);
            }
            System.out.println("");
            System.out.println("");
        }
    }
    /**
     * Método que llena el array de números enteros.
     * @param numeros Array en el que se almacenarán los números.
     */
    public static int[] llenarArray(int[] numeros){
        for (int i = 0; i < numeros.length; i++){//bucle que se repite tantas veces como elementos tiene el array.
            numeros[i] = aleatorio(1,5);
        }
        return numeros;
    }

    /**
     * Método que genera un número aleatorio
     * @param min número mínimo a generar.
     * @param max número máximo a generar.
     * @return
     */
    public static int aleatorio(int min, int max){
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
}
