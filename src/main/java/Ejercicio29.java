import java.util.Random;

public class Ejercicio29{
    public Ejercicio29() {
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
        double[][] notas = new double[20][3];
        llenarMatriz(notas);
        imprimirMatriz(notas);
    }
    public static void imprimirMatriz(double[][]matriz){
        double acumulador = 0;
        System.out.printf("%-19s %-14s %-14s %-14s %-14s %n %n","", "MOD 1", "MOD 2", "MOD 3", "MEDIA");
        for (int i = 0; i < matriz.length; i++){
            acumulador = 0;
            System.out.printf("%-20s", "ALUMNO " + (i+1));
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("%-15.2f",matriz[i][j]);
                acumulador += matriz[i][j];
            } 
            System.out.printf("%-15.2f", calcularMedia(acumulador, matriz[i].length));  
            System.out.println("");
        }
        imprimirMaximas(matriz);
        //imprimirMediaYSuperados(matriz);
    }
    /*
    public static void imprimirMediaYSuperados(double[][] matriz){
        double superados = 0;
        System.out.println("");
        for (int i = 0; i < matriz[0].length;i++){
            superados = calcularMediaModulo(matriz,i);
        }
        System.out.println("");
    }
    public static double calcularMediaModulo(double[][],int i){

    }*/
    public static void imprimirMaximas (double[][] matriz){
        double maximoCol = 0;
        System.out.println("");
        System.out.printf("%-20s", "NOTA MÁXIMA");
        for (int i = 0; i < matriz[0].length;i++){
            maximoCol = maxValueColum(matriz, i);
            System.out.printf("%-14.2f ", maximoCol);
        }
        System.out.println("");
    }
    public static double calcularMedia( double acumulador, int total){
        return acumulador / total;
    }
    /**
     * Método que sirve para llenar una matriz con números aleatorios.
     * @param matriz matriz a llenar
     * @return devolvemos la anterior matriz con números aleatorios
     */
    public static void llenarMatriz (double[][] matriz){
        for (int i=0; i < matriz.length; i++) {//Bucle que recorre las filas de la matriz.
            for (int j=0; j < matriz[i].length; j++) {//Bucle que recorre las columnas de la matriz.
                matriz[i][j] = aleatorio(0,10);
            }
        }
    }
    /**
     * Método que genera un número aleatorio
     * @param min número mínimo a generar.
     * @param max número máximo a generar.
     * @return
     */
    public static double aleatorio(int min, int max){
        Random r = new Random();
        return min + r.nextDouble()*(max - min);
    } 
    public static double maxValueColum(double[][] matriz, int columna){
        double maximo = Double.MIN_VALUE;
        for (int i = 0; i < matriz.length; i++){
            if (maximo < matriz[i][columna]){
                maximo = matriz[i][columna];
            }
        }
        return maximo;
    }
    
}