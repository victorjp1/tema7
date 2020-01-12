import java.util.Arrays;
import java.util.Random;

public class Ejercicio28 {
    public Ejercicio28(){
        char[] cadena = new char[500];
        aleatorio(65,90);
        cadena = llenarArray(cadena);
        System.out.println(Arrays.toString(cadena));
    }
    public static char[] llenarArray(char[] cadena){
        for (int i = 0; i< cadena.length; i++){
            cadena[i] = (char)aleatorio(65,90);
        }
        return cadena;
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
