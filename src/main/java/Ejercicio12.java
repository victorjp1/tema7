import java.util.Scanner;//Importamos el escáner
public class Ejercicio12 {
    public Ejercicio12(){
        Scanner lector = new Scanner(System.in);//Declaramos el escáner
        String frase;//Variable que almacena la frase
        String sustitucion;//Variable que almacena la cadena a la que hay que sustituir
        String aSustituir;//Variable que almacena la cadena que se ha de sustituir
        System.out.println("Introduce una frase: ");//Pedimos la frase
        frase = lector.nextLine();//Leemos la frase
        System.out.println("Introduce la cadena que quieres que sea sustituida: ");//Pedimos la cadena que debe ser sustituida
        aSustituir = lector.nextLine();//Leemos la cadena que debe ser sustituida.
        System.out.println("Introduce la cadena por la que quieres que sea sustituida: ");//Pedimos la cadaena por la  que se debe sustituir.
        sustitucion = lector.nextLine();//Leemos la cadena por la que se debe sustituir
        frase = sustituirCadena(frase, aSustituir, sustitucion);//Llamamos al método que sustituye la cadena.
        frase = sustituirNum(frase);//Llamamos al método que sustituye los números por un asterisco.
        System.out.println(frase);//Imprimimos el resultado final.
    }

    /**
     * Método que sustituye una cadena de caracteres por otra
     * @param frase Variable que almacena la frase original
     * @param aSustituir
     * @param sustitucion
     * @return
     */
    public static String sustituirCadena(String frase, String aSustituir, String sustitucion){
        frase = frase.replaceAll(aSustituir, sustitucion);
        return frase;
    }
    public static String sustituirNum(String frase){
        frase = frase.replaceAll("\\d+", "*");
        return frase;
    }
}
