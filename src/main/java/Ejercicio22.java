import java.util.Arrays;
import java.util.Scanner;
/*Escribe un programa que permita introducir un array P de 10 elementos numéricos, visualizar su
contenido y crear otro array S con los elementos de P que sean mayores de 10 (cuando los
elementos sean <=10, se pondrá un -1). Visualizar después el contenido de S.*/
public class Ejercicio22 {
    static Scanner lector;//Declaramos el escáner como global.
    public Ejercicio22(){
        int[] inicial = new int[10];//Array usado para almacenar los número introducidos por el usuario.
        int[] convertido;//Array final para el array convertido sustituyendo los números pertinentes.
        lector = new Scanner(System.in);
        final int MAXIMO = 10;
        inicial = pedirArray(inicial);//Llamamos al método para llenar el array.
        System.out.println("El array que has introducido es: " + Arrays.toString(inicial));
        lector.nextLine();
        convertido = sustituirArray(inicial, MAXIMO);//Llamamos al método que sustituye los menores a su max;
        System.out.println("El array final sustituyendo los mayores o iguales que 10 es: " + Arrays.toString(convertido));
        lector.nextLine();
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

    /**
     * Método que según un máximo, todos los elementos numéricos de una array menores a ese número son sustituidos por -1
     * @param a vector al cual tenemos que hacer las comprobaciones
     * @param MAX constante con valor de entero la cual es el máximo a valorar.
     * @return Devolvemos el array modificado.
     */
    public static int[] sustituirArray (int[] a, final int MAX){
        int[] convertido = new int[10];
        for (int i = 0; i < a.length; i++){
            if (a[i] <= MAX){
                convertido[i] = -1;
            }else{
                convertido[i] =  a[i];
            }
        }
        return convertido;
    }
}
