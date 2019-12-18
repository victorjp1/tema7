import java.util.Random;
import java.util.Scanner;
public class Ejercicio20 {
    public Ejercicio20(){
        int[] numeros = new int[20];
        Scanner lector = new Scanner (System.in);
        int numero;
        llenarArray(numeros);
        System.out.println("Dime un número");
        numero = Integer.parseInt(lector.nextLine());
        if(ocurrencia(numeros, numero)){
            System.out.printf("El número %d se encuentra en el array", numero);
        }else{
            System.out.printf("El número %d no se encuentra en el array", numero);
        }
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
    public static boolean ocurrencia(int[] numeros,int numero){
        boolean ocurrencia = false;
        for(int i = 0; i < numeros.length; i++){
            if (numero == numeros[i]){
                ocurrencia = true;
            }
        }
        return ocurrencia;
    }
}
