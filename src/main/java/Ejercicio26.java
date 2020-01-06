import java.util.Random;
import java.util.Scanner;

public class Ejercicio26 {
    public Ejercicio26(){
        Scanner lector = new Scanner (System.in);
        int[][] numeros = new int[4][8];//Matriz usada para almacenar los números.
        float media = 0f;//Variable utilizada para almacenar la media de toda la matriz.
        int maximo;//Variable usada para guardar el valor máximo de la matriz.
        int minimo;//Variable usada para guardar el valor mínimo de la matriz.
        int fila;//Variable que guarda la fila que contiene el elemento que quiere mostrar el usuario.
        int columna;//Variable que guarda la columna que contiene el elemento que quiere mostrar el usuario.
        numeros = llenarMatriz(numeros);//LLenamos la matriz.
        System.out.println("Matriz mostrada por filas:");
        visualizarMatriz(numeros);//Imprimimos la matriz por filas.
        lector.nextLine();
        //Borramos pantalla y situamos el cursor arriba a la izquierda.
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
        int[][] traspuesta = trasponerMatriz(numeros);//Creamos una matriz traspuesta y la rellenamos con un método.
        System.out.println("Matriz traspuesta:");
        visualizarMatriz(traspuesta);//Visualizamos la matiz traspuesta.
        lector.nextLine();
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
        System.out.println("Vamos a imprimir la matriz por filas y la suma de cada fila: ");
        visualizarYSuma(numeros);
        lector.nextLine();
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
        media = mediaMatriz(numeros);//Calculamos la media de toda la matriz.
        System.out.printf("La media de toda la matriz es: %.2f %n", media);
        minimo = minValueMatriz(numeros);//Calculamos el mínimo valor de la matriz.
        System.out.println("El mínimo en la matriz es: " + minimo);
        maximo = maxValueMatriz(numeros);//Calculamos el maximo valor de la matriz.
        System.out.println("El máximo en la matriz es: " + maximo);
        lector.nextLine();
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
        System.out.println("Elige que elemento quiere ver, necesitamos saber la fila y la columna.");
        System.out.println("Recuerda que disponemos de 4 filas y 8 columnas.");
        //Le pedimos que introduzca una fila y una columna de la matriz para seleccionar un elemento y lo mostramos.
        System.out.println("Elige la fila: ");
        fila = Integer.parseInt(lector.nextLine());
        System.out.println("Elige la columna: ");
        columna = Integer.parseInt(lector.nextLine()) -1;
        System.out.println("El valor que has elegido es: " + numeros[fila][columna]);
        lector.nextLine();
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
        System.out.println("Elige que fila ebtera quieres ver:");
        fila = Integer.parseInt(lector.nextLine()) -1;
        mostrarFila(numeros, fila);
        System.out.println("Elige la columna que quieres mostrar: ");
        columna = Integer.parseInt(lector.nextLine())-1;
        mostrarFila(traspuesta, columna);
    }
    public static void mostrarFila(int[][] matriz, int fila){
        for (int i = 0; i < matriz[fila].length;i++ ){
            System.out.printf("%10d",matriz[fila][i]);
        }
    }
    public static int maxValueMatriz(int[][] matriz){
        int maximo = Integer.MIN_VALUE;
        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo){
                    maximo = matriz[i][j];
                }
            }
        }
        return maximo;
    }
    public static int minValueMatriz(int[][] matriz){
        int minimo = Integer.MAX_VALUE;
        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < matriz[i].length; j++) {
                if (matriz[i][j] < minimo){
                    minimo = matriz[i][j];
                }
            }
        }
        return minimo;
    }
    public static float mediaMatriz (int[][] matriz){
        float media = 0;
        int contador = 0;
        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < matriz[i].length; j++) {
                media += matriz[i][j];
                contador++;
            }
        }
        media = media / contador;
        return media;
    }
    public static void visualizarYSuma(int[][] matriz){
        int acumulador = 0;
        for (int i=0; i < matriz.length; i++) {
            acumulador = 0;
            System.out.printf("Fila " + (i + 1) + ": %n %n");
            for (int j=0; j < matriz[i].length; j++) {
                System.out.printf("%-10d",matriz[i][j]);
                acumulador += matriz[i][j];
            }
            System.out.println("\n");
            System.out.printf("La suma total de la fila es: %d", acumulador);
            System.out.println("\n");
        }
    }
    public static int[][] trasponerMatriz(int[][] matriz){
        int[][] traspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j= 0; j < matriz[i].length; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        return traspuesta;
    }

    public static void visualizarMatriz(int[][] matriz){
        for (int i=0; i < matriz.length; i++) {
            System.out.printf("Fila " + (i + 1) + ": %n %n");
            for (int j=0; j < matriz[i].length; j++) {
                System.out.printf("%-10d",matriz[i][j]);
            }
            System.out.println();
            System.out.println();
        }
    }

    /**
     * Método que sirve para llenar una matriz con números aleatorios.
     * @param matriz matriz a llenar
     * @return devolvemos la anterior matriz con números aleatorios
     */
    public static int[][] llenarMatriz (int[][] matriz){
        for (int i=0; i < matriz.length; i++) {//Bucle que recorre las filas de la matriz.
            for (int j=0; j < matriz[i].length; j++) {//Bucle que recorre las columnas de la matriz.
                matriz[i][j] = aleatorio(0,50);
            }
        }
        return matriz;
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
