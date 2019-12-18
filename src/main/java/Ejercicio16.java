import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Random;//Importamos la clase Random.

public class Ejercicio16 {
    Ejercicio16(){
        double[] notas = new double[30];//Declaramos el array y le damos longitud.
        notas(notas);
    }

    /**
     * Método que calcula la nota media de aprobados, la nota media en
     * general y el número de aprobados.
     * @param notas Array que almacenará todas las notas.
     */
    public static void notas(double[] notas){
        final int MIN = 0;//Constante que contiene la nota mínima.
        final int MAX = 10;//Constante que contiene la nota máxima.
        double notaMediaApro = 0;//Variable que almacenará la nota media de aprobados.
        double notaMedia = 0;//Variable que almacena la nota media.
        int aprobados = 0;//Variable que almacena el número de aprobados de la clase.
        for (int i = 0; i < notas.length; i++){//Bucle que se itera tantas veces como elementos contiene el array.
            notas[i] = aleatorio(MIN, MAX);//Generamos la nota aleatoria con el método aleatorio.
            if (notas[i] >= 5){//Si la nota es superior o igual a 5...
                notaMediaApro += notas[i];//sumamos la nota a nota media aprobados.
                notaMedia += notas[i];//Sumamos la nota a la nota media.
                aprobados++;//Incrementamos al número de aprobados.
            }else{//Si no...
                notaMedia += notas[i];//Sumamos la nota a la nota media.
            }
        }
        //Imprimimos los resultados.
        System.out.printf("La nota media de aprobados es: %.2f %n", (notaMediaApro / aprobados));
        System.out.printf("La nota media es: %.2f", (notaMedia / notas.length));
        System.out.printf("El total de aprobados es: %d", aprobados);
    }

    /**
     * Método que genera números aleatorios.
     * @param min Variable que almacena el mínimo a generar.
     * @param max Variable que almacena el máximo a generar
     * @return
     */
    public static double aleatorio (int min, int max){
        Random rnd = new Random();//Generamos un objeto de la clase Random.
        return min + rnd.nextDouble() * (max - min);//Generamos el número aleatorio y lo devolvemos.
    }
}
