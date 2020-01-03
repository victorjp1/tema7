import java.util.Arrays;
import java.util.Random;
public class Ejercicio18 {
    public Ejercicio18(){
        int[] operando1 = new int [10];//Array que contiene los números de un operando.
        int[] operando2 = new int [10];//Array que contiene los números del otro operando
        int[] resultado = new int [10];//Array que almacenará el resultado de las operaciones entre los otros arrays.
        llenarArray(operando1);
        llenarArray(operando2);
        sumaArrays(operando1, operando2, resultado);
        System.out.println("El resultado de la suma es: ");
        System.out.println(Arrays.toString(resultado));
        divisionArrays(operando1, operando2, resultado);
        System.out.println("El resultado de la división es:");
        System.out.println(Arrays.toString(resultado));
    }
    /**
     * Método que llena el array de números enteros.
     * @param numeros Array en el que se almacenarán los números.
     */
    public static void llenarArray(int[] numeros){
        for (int i = 0; i < numeros.length; i++){//bucle que se repite tantas veces como elementos tiene el array.
            numeros[i] = aleatorio(1,10);
        }
    }

    /**
     * método que suma dos números de la misma posición de diferentes arrays, con todas las posiciones
     *  y lo almacena en la misma posición de un array llamado resultado.
     * @param operando1 array que contiene todos los elementos del operando 1
     * @param operando2 array que contiene todos los elementos del operando 1
     * @param resultado array que contiene todos los elementos que almacenarán el resultado de la operación
     */
    public static void sumaArrays(int[] operando1, int[] operando2, int[] resultado){
        if(operando1.length == operando2.length){
            for(int i = 0; i < operando1.length; i++){
                resultado[i] = operando1[i] + operando2[i];
            }
        }else{
            System.out.println("Las longitudes no coinciden!");
        }

    }

    /**
     * Método que hace la división entre dos números de la misma posición de diferentes arrays, lo repite con todos
     * y lo almacena en otro array llamado resultado.
     * @param operando1  array que contiene todos los elementos del operando 1
     * @param operando2 array que contiene todos los elementos del operando 2
     * @param resultado array que contiene todos los elementos que almacenarán el resultado de la operación
     */
    public static void divisionArrays(int[] operando1, int[] operando2, int[] resultado){
        if (operando1.length == operando2.length){
            for(int i = 0; i < operando1.length; i++){
                resultado[i] = operando1[i] / operando2[i];
            }
        }else{
            System.out.println("Las longitudes de los arrays no coinciden");
        }

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
