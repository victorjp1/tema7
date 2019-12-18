import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio21 {
    static boolean salir = false;
    public Ejercicio21(){
        int[] numeros = new int[10];
        Scanner lector = new Scanner (System.in);
        int opcion;
        do{
            mostrarMenu();
            opcion = Integer.parseInt(lector.nextLine());
            valorarOpcion(opcion, numeros);
        }while (!salir);
        System.out.println("Has salido del programa!!!!");
    }

    /**
     * Método que muestra el menú de opciones
     */
    public static void mostrarMenu(){
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println("1. -Rellenar array");
        System.out.println("2. -Visualizar contenido del array");
        System.out.println("3. -Visualizar contenido par");
        System.out.println("4. -Visualizar contenido múltiplo de 3");
        System.out.println("0. -Salir del menú.");
        System.out.println("Seleccione una opción: ");
    }

    /**
     * Método que valora la opción anteriormente elegida del usuario
     * @param opcion Opcion que ha introducido el usuario
     * @param numeros Array para hacer operaaciones
     */
    public static void valorarOpcion(int opcion, int[] numeros){
        switch (opcion){
            case 1:
                llenarArray(numeros);
                break;
            case 2:
                visualizarArray(numeros);
                break;
            case 3:
                contenidoPar(numeros);
                break;
            case 4:
                multiplo3(numeros);
                break;
            case 0:
                salir = true;
                break;
            default:
                System.out.println("Error!!!!");
                break;
        }
    }
    /**
     * Método que llena el array de números enteros.
     * @param numeros Array en el que se almacenarán los números.
     */
    public static void llenarArray(int[] numeros){
        for (int i = 0; i < numeros.length; i++){//bucle que se repite tantas veces como elementos tiene el array.
            numeros[i] = aleatorio(0,50);
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

    /**
     * Método que imprime el contenido de un array.
     * @param numeros
     */
    public static void visualizarArray(int[] numeros){
        System.out.println(Arrays.toString(numeros));
    }

    /**
     * Método que averigua si el elemento del array es par y lo muestra junto con su posición
     * @param numeros Array numérico
     */
    public static void contenidoPar(int[]numeros){
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                System.out.printf("El número %d que se encuentra en la posicion %d es par %n", numeros[i], i);
            }
        }
    }

    /**
     * Método que averigua si el elemento del array es múltiplo de 3 y lo muestra junto con su posición
     * @param numeros array numérico
     */
    public static void multiplo3(int[]numeros){
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 3 == 0){
                System.out.printf("El número %d que se encuentra en la posicion %d es múltiplo de 3 %n", numeros[i], i);
            }
        }
    }
}
