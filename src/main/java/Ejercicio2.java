import java.util.Scanner;//Importamos el escáner.
public class Ejercicio2 {
    public Ejercicio2(){
        String frase;//Almacena la frase.
        int numVocales;//Almacena el número de vocales.
        int numConsonantes;//Almacena el número de consonantes.
        Scanner lector = new Scanner(System.in);//Declaramos el escáner.
        System.out.println("Dime la frase mi loco");//Pedimos la frase
        frase = lector.nextLine();//Leemos la frase.
        numVocales = numeroVocales(frase);//Calculamos las vocales con un método.
        numConsonantes = numeroConsonantes(frase);//Calculamos el número de consonantes usando un método.
        //Mostramos resultados.
        System.out.println("El número de vocales es: " + numVocales + " y el número de consonantes es: " + numConsonantes);
    }

    /**
     * Método que calcula el número de vocales en un String.
     * @param frase Almacena la frase.
     * @return Devuelve un entero que es el número de vocales que hay.
     */
    public static int numeroVocales(String frase){
        int vocales = 0;//Variable contadora de vocales.
        for (int i = 0; i < frase.length(); i++){//Se repetirá tantas veces como longitud tenga la frase.
            char letra =frase.charAt(i);//Variable que almacena el caracter en cada pasada.
            switch (letra){//Valoramos el caracter... Si es un vocal sumamos al contador.
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                vocales ++;
                break;
            }
        }
        return vocales;//Devolvemos el contador de vocales.
    }
    public static int numeroConsonantes (String frase){
        int consonantes = 0;//Variable que almacena las consonantes.
        for (int i = 0; i < frase.length(); i++){//Se repetirá tantas veces como longitud tenga la frase.
            char letra =frase.charAt(i);//Cogemos la letra.
            switch (letra){//Evaluamos la letra... si es una consonante sumamos 1 al contador.
                case 'b':
                case 'c':
                case 'd':
                case 'f':
                case 'g':
                case 'h':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    consonantes ++;
                    break;
            }
        }
        return consonantes;//Devolvemos el contador de consonantes.
    }
}

