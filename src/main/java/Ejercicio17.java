import java.util.Scanner;//Importamos el escáner.

public class Ejercicio17 {
    public Ejercicio17(){
        Scanner lector = new Scanner(System.in);//Declaramos el escáner.
        int longitudArray;//Variable que almacena la longitud del array.
        double media;//Variable que almacena la media.
        System.out.println("Introduce el número de estaturas que quieres almacenar: ");//Variable que almacena la longitud del array.
        longitudArray = Integer.parseInt(lector.nextLine());//Leemos la longitud del array.
        double[] estaturas = new double [longitudArray];//Le damos la longitud al array.
        llenarArray(lector, estaturas);//LLenamos el array
        media = calcularMedia(estaturas);//Calculamos la media
        System.out.printf("La media es: %.2f %n", media);//Imprimimos la media
        System.out.println("Los elementos superior a la media son: " + superioresMedia(media, estaturas));
    }

    /**
     * Método que llena el array.
     * @param lector Objeto de la clase escáner.
     * @param a Array de tipo double.
     */
    public static void llenarArray(Scanner lector, double[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println("Estatura " + (i+1));//Pedimos la estatura N.
            a[i] = lector.nextDouble();//Leemos la estatura
            lector.nextLine();//Consumimos retorno de carro.
        }
    }

    /**
     * Método que calcula la media de estaturas.
     * @param numeros Array que almacena los valores.
     * @return
     */
    public static double calcularMedia(double[] numeros){
        double media = 0;//Variable que almacena la media.
        for (int i = 0; i < numeros.length; i++){//Bucle que se itera tantas veces como elementos contiene el array.
            media += numeros[i];
        }
        return (media / numeros.length);//Calculamos la media y la devolvemos.
    }

    /**
     * Método que averigua que estaturas son superiores a la media
     * @param media variable que almacena la media.
     * @param numeros Array que almacena los números.
     */
    public static int superioresMedia (double media, double[] numeros){
        int superior = 0;
        for (int i = 0; i < numeros.length; i++){//Bucle que se itera tantas veces como elementos contiene el array.
            if (numeros[i] > media){//Si estatura es superior a media, imprimimos que lo es.
                System.out.printf("%.2f es superior a la media %n",numeros[i]);
                superior++;
            }
            else if (numeros[i] == media){//Si no lo es y es igual a la media lo imprime
                System.out.printf("%.2f es igual a la media %n",numeros[i]);
            }
        }
        return superior;
    }
}
