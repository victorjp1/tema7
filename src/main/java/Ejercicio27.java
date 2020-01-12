import java.util.Arrays;
import java.util.Random;

public class Ejercicio27 {
    public Ejercicio27(){
        final int NFILAS = 50;
        final int NCOLUM = 20;
        int[] operando1 = new int[NFILAS];//Primer operando para llenar la matriz.
        int[] operando2 = new int[NCOLUM];//Segundo operando que usaremos para llenar la matriz.
        int[][] resultado = new int[operando1.length][operando2.length];//Creamos la matriz.
        operando1 = llenarArray(operando1);//Llenamos el array.
        operando2 = llenarArray(operando2);//Llenamos el array.
        resultado = llenarMatriz(resultado, operando1,operando2);
        visualizarMatriz(resultado);//Visualizamos la matriz.
        System.out.println(Arrays.toString(operando1));//Imprimimos array.
        System.out.println("");//Añadimos otro salto de línea.
        System.out.println(Arrays.toString(operando2));//Imprimimos el segundo array.
    }
    public static int[][] llenarMatriz(int[][] matriz, int[] array1, int[] array2){
        for (int i = 0; i < matriz.length; i++){//Llenamos la matriz.
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = array1[i] * array2[j];
            }
        }
        return matriz;
    }
    /**
     * Método que utilizamos para visualizar la matriz.
     * @param matriz matriz a imprimir.
     */
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
