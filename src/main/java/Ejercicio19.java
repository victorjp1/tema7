import java.util.Random;

public class Ejercicio19 {
    public Ejercicio19(){
        int[] numeros = new int[100]; //Array que almacena los números
        int contador = 0;
        llenarArray(numeros);
        contador = multiplos5(numeros, contador);
        System.out.printf("Entre todos los números existen %d múltiplos de 5 %n", contador);
        contador = igualA0(numeros, contador);
        System.out.printf("Entre todos los números existen %d iguales a 0 %n", contador);
        contador = multiplos10(numeros, contador);
        System.out.printf("Entre todos los números existen %d múltiplos de 10 %n",contador);
    }

    /**
     * Método que recorre un array numérico y imprime cuales son múltiplos de 5
     * y además devuelve cuantos múltiplos hay en total
     * @param numeros array numérico
     * @param contador contador de cuantos múltiplos hay
     * @return
     */
    public static int multiplos5(int[] numeros, int contador){
        contador = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 5 == 0){
                System.out.printf("%d es múltiplo de 5! %n", numeros[i]);
                contador++;
            }
        }
        return contador;
    }
    /**
     * Método que recorre un array numérico y imprime cuales son múltiplos de 10
     * y además devuelve cuantos múltiplos hay en total
     * @param numeros array numérico
     * @param contador contador de cuantos múltiplos hay
     * @return
     */
    public static int multiplos10(int[] numeros, int contador){
        contador = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 10 == 0){
                System.out.printf("%d es múltiplo de 10! %n", numeros[i]);
                contador++;
            }
        }
        return contador;
    }

    /**
     * Método que recorre un array numérico y averigua cuales son iguales a 0
     * y lo imprime, además devuelve cuantos hay.
     * @param numeros array numérico
     * @param contador número de ocurrencias de 0 que existen
     * @return
     */
    public static int igualA0(int[] numeros, int contador){
        contador = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == 0){
                System.out.printf("%d es igual que 0! %n", numeros[i]);
                contador++;
            }
        }
        return contador;
    }
    /**
     * Método que llena el array de números enteros.
     * @param numeros Array en el que se almacenarán los números.
     */
    public static void llenarArray(int[] numeros){
        for (int i = 0; i < numeros.length; i++){//bucle que se repite tantas veces como elementos tiene el array.
            numeros[i] = aleatorio(0,100);
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
