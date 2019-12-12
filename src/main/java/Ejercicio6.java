import java.util.Scanner;
public class Ejercicio6 {
    public Ejercicio6(){
        Scanner lector = new Scanner (System.in);
        String frase;
        int mult;
        System.out.println("Inserta una frase: ");
        frase = lector.nextLine();
        System.out.println("Inserta el número de veces que quieres que se repita: ");
        mult = Integer.parseInt(lector.nextLine());
        for (int i = 0; i < mult; i++){
            System.out.println(frase);
            System.out.println("---------------------------------------------------------");
        }
    }
}
