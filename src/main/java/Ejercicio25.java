import java.util.Arrays;
import java.util.Random;

public class Ejercicio25 {
    public Ejercicio25(){
        int[] numeros = new int[50];
        int numPares = 0;
        numeros = llenarArray(numeros);//Llenamos el array de números aleatorios.
        System.out.println(Arrays.toString(numeros));//Imprimimos el primer array.
        for (int i = 0; i < numeros.length; i++){//Recorremos el array.
            if (numeros[i] % 2 == 0){//Verificamos si es par o no.
                numPares++;//Si es par sumamos uno al contador de pares.
            }
        }
        if (numPares >= 1){//Si el contador de pares es mayor o igual a 1.
            int[] pares = new int[numPares];//Creamos el array con tantos elementos como pares registrados tengamos.
            int contador = 0;//Contador para elementos del array de pares.
            for (int i = 0; i < numeros.length; i++){//Recorremos el array...
                if (numeros[i] % 2 == 0){//Si es par...
                    pares[contador] = numeros[i]; //Almacenamos el elemento correspondiente en el array pares.
                    contador++;//Incrementamos el contador para desplazarnos de posición en el array de pares.
                }
            }
            System.out.println("El número de pares es: " + numPares);//Imprimimos el número de pares.
            System.out.println(Arrays.toString(pares));//Imprimimos el array de pares.
        }else{//Si el contador de pares está a 0...
            System.out.println("No hay pares!!");//Imprimimos que no hay pares.
        }
    }
    /**
     * Método que llena el array de números enteros, en este caso de números aleatorios.
     * @param numeros Array en el que se almacenarán los números.
     */
    public static int[] llenarArray(int[] numeros){
        for (int i = 0; i < numeros.length; i++){//bucle que se repite tantas veces como elementos tiene el array.
            numeros[i] = aleatorio(0,100);
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
