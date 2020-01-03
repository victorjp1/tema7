import java.util.Arrays;
import java.util.Random;

public class Ejercicio24 {
    public Ejercicio24(){
        int[] operando = new int[50];
        int[] resultado = new int[50];
        operando = llenarArray(operando);
        resultado = sumatorioArrays(operando);
        System.out.println("Array 1: \n " + Arrays.toString(operando));
        System.out.println("Array 2:  \n" + Arrays.toString(resultado));
    }

    /**
     * Método que usando un array numérico llena otro array el cual se compone de la suma del elemento actual
     * y todos los anteriores del primer array.
     * @param operando array que contiene los elementos del array original
     * @return devolvemos el array de resultado.
     */
    public static int[] sumatorioArrays(int[] operando){
        int[] resultado = new int[operando.length];
        int acumulador = 0;
        for (int i = 0; i < operando.length; i++){
            acumulador += operando[i];
            resultado[i] = acumulador;
        }
        return resultado;
    }
    /**
     * Método que llena el array de números enteros.
     * @param numeros Array en el que se almacenarán los números.
     */
    public static int[] llenarArray(int[] numeros){
        for (int i = 0; i < numeros.length; i++){//bucle que se repite tantas veces como elementos tiene el array.
            numeros[i] = aleatorio(0,50);
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
