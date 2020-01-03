/*Escribe un programa que permita, a partir de un array de 10 elementos numéricos V, generar un
array P con los elementos de V en orden inverso. Visualizar los dos arrays al final.*/
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio23 {
    static Scanner lector;
    public Ejercicio23(){
        lector = new Scanner (System.in);
        int[] inicial = new int[10];
        int[] inverso;
        inicial = pedirArray(inicial);
        inverso = inverso(inicial);
        System.out.println(Arrays.toString(inicial));
        System.out.println(Arrays.toString(inverso));
    }
    /**
     * Método que pide por pantalla elementos numéricos y los almacena en un array.
     * @param a vector en el que guardamos los elementos numéricos.
     * @return devuelve un array de enteros ya rellenado.
     */
    public static int[] pedirArray (int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println("Ingrese el elemento " + (i+1));
            a[i] = lector.nextInt(); lector.nextLine();
        }
        return a;
    }
    public static int[] inverso(int[] inicial){
        int[] inverso = new int[inicial.length];
        int contador = 0;
        for (int i = inicial.length -1; i >= 0; i--){
            inverso[contador] = inicial[i];
            contador++;
        }
        return inverso;
    }
}
