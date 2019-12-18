import java.util.Scanner;//Importamos la clase escáner.

public class Ejercicio15 {
    public Ejercicio15(){
        Scanner lector = new Scanner(System.in);//Declaramos el escáner.
        int[] numeros = new int[20];//Creamos el array y le damos longitud.
        //Explicamos el funcionamiento del programa.
        System.out.println("Introduce 20 elementos númericos y los mostraré de 4 en 4 en una tabla: ");
        llenarArray(lector, numeros);//Llamamos al método que llena el array.
        tabla(numeros);//Método que imprime en tablas de 4 columnas.
    }

    /**
     * Método que llena el array de números enteros.
     * @param lector Lector usado para introducir los datos.
     * @param numeros Array en el que se almacenarán los números.
     */
    public static void llenarArray(Scanner lector, int[] numeros){
        for (int i = 0; i < numeros.length; i++){//bucle que se repite tantas veces como elementos tiene el array.
            System.out.println("Número " + (i+1));//Imprimimos que introduzca el número N.
            numeros[i] = Integer.parseInt(lector.nextLine());//Leemos el número.
        }
    }

    /**
     * Método que imprime un array en una tabla con 4 columnas.
     * @param numeros Array que contiene los números.
     */
    public static void tabla (int[] numeros){
        int contador =  1;//Variable usada para controlar las columnas.
        final int COLUMNAS = 4;//Constante con el número de columnas que queremos.
        for (int i = 0; i < numeros.length; i++){//bucle que se repite tantas veces como elementos tiene el array.
            System.out.printf("%10d", numeros[i]);//Imprimimos con un ancho de 10 caracteres el elemento.
            if (contador  % COLUMNAS == 0){//Si el resto de la división entre contador y columnas es 0...
                System.out.println();//Salto de línea.
            }
            contador++;//Sumamos uno al contador.
        }
    }
}
