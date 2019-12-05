import java.util.Scanner;
public class Ejercicio1 {
    public Ejercicio1(){
        //main
        Scanner lector = new Scanner (System.in);//Declaramos el escáner.
        String frase;//Variable que almacena la frase.
        System.out.printf("\u001B[2J");
        System.out.println("Dime una frase crack:");//Pedimos la frase.
        frase = lector.nextLine();//Leemos la frase.
        System.out.println(primeraMayus(frase)); //Imprimimos el resultado del método primeraMayus.
        lector.close();//Cerramos el lector.
    }
    public static String primeraMayus (String frase){
        StringBuilder fraseFinal = new StringBuilder();//Frase que devolveremos. La creamos como Builder para que reutilice la dir de memoria.
        frase = frase.trim();//Eliminamos espacios en blanco.
        for(int i = 0; i < frase.length(); i++){//Bucle que se ejecuta según la largaria del String.
            if(i == 0){//Si i es 0...
                fraseFinal.append(Character.toUpperCase(frase.charAt(i)));//Convertimos a mayus y lo guardamos en el nuevo String.
            }else{//Si no...
                fraseFinal.append(frase.charAt(i));//Guardaremos el caracter tal cual está.
            }
        }
        return fraseFinal.toString();//Devolvemos el String creado.
    }
}
