import java.util.Scanner;//Importamos el escáner.
public class Ejercicio3 {
    /**
     * App que calcula el número de palabras que contiene suponiendo que
     * están separadas por un solo espacio.
     */
    public Ejercicio3(){
        Scanner lector = new Scanner (System.in);//Declaramos el escáner.
        String frase;//Variable que almacena la frase.
        int numPalabras;//Número de palabras.
        System.out.println("Introduce una frase");//Pedimos la frase.
        frase = lector.nextLine();//Leemos la frase.
        numPalabras = numPalabras(frase);//Calculamos el número de palabras con un método.
        System.out.println(frase + " tiene " + numPalabras + " palabras.");//Mostramos resultado.
    }

    /**
     * Número de palabras
     * @param frase Guarda la frase.
     * @return
     */
    public static int numPalabras (String frase){
        int numPalabras = 0;//Almacena el número de palabras.
        frase = frase.trim();//Quitamos espacios al principio y al final.
        boolean enPalabra = false;
        for (int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if (Character.isSpaceChar(c) | c == '\n' || c == '\t') {
                enPalabra = false;
            }else if (!enPalabra){
                enPalabra = true;
                numPalabras++;
            }
        }
        return numPalabras;//Devolvemos el número de palabras.
    }
}
