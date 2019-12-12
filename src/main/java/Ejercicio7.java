import java.util.Scanner;

public class Ejercicio7 {
    public Ejercicio7() {

        Scanner input = new Scanner(System.in); // El Scanner
        System.out.println("Ingresa una frase: ");
        String frase = input.nextLine(); // Guardamos la frase o texto
        String[] p = separarFrase(frase); // Separamos palabras
        for (int i = 0; i < p.length; i++) {
            System.out.println("Parte " + (i + 1) + ": " + p[i]);
        }
        System.out.println("La frase " + frase + " tiene " + cuentaPalabras(frase) + " palabras.");

    }

    /**
     * Método que separa la frase en palabras.
     * @param s La cadena a separar.
     * @return Cadena en partes.
     */
    public static String[] separarFrase(String s) {
        int numPalabras = 0; // Cantidad de palabras

        // Recorremos en busca de espacios
        boolean enPalabra = false;//Boolea n que controla si esta en la frase o no.
        for (int i = 0; i < s.length(); i++){//Bucle que recorre la frase.
            char c = s.charAt(i);//Guardamos caracter de la posición que indique i.
            if (Character.isSpaceChar(c) || c == '\n' || c == '\t') {//Si es espacio, salto de línea o tabulacion...
                enPalabra = false;//Boolean se pone en false.
            }else if (!enPalabra){//Si en palabra es falso...
                enPalabra = true;//Se pone la boolean en true.
                numPalabras++;//Sumamos número de palabras.
            }
        }



        String[] partes = new String[numPalabras];
        for (int i = 0; i < partes.length; i++) {//Un bucle que recorre todas las partes del array.
            partes[i] = ""; // Se inicializa en "" en lugar de null (defecto)
        }

        int ind = 0; // Creamos un índice para las palabras
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') { // Si hay un espacio
                ind++; // Pasamos a la siguiente palabra
                continue; // Próximo i
            }
            partes[ind] += s.charAt(i); // Sino, agregamos el carácter a la palabra actual
        }
        return partes; // Devolvemos las partes
    }
    /**
     *
     * @param frase la frase que insertamos para contar las palabras que tiene
     * @return devuelve un int con las palabras que tiene la frase pasada
     */
    public static int cuentaPalabras (String frase){
        int palabras = 0;
        boolean esPalabra = false;

        for (int i = 0; i < frase.length(); i++) { //el bucle es para recorrer la frase y cuando encuentre un espacio, enter o tab, el boole cambia de valor y suma una palabra
            char c = frase.charAt(i);
            if (Character.isSpaceChar(c) || c == '\n' || c == '\t') {
                esPalabra = false;
            } else if (!esPalabra) {
                esPalabra = true;
                palabras++;
            }
        }
        return palabras;
    }



}
