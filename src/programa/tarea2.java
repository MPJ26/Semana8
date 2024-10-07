package programa;
import java.util.Scanner;
public class tarea2 {
    public static void main (String args []){
    //DECLARACION DE VARIABLE
        int contador = 0;
        String frase;
        Scanner lectura = new Scanner(System.in);
        // entrada de datos
        System.out.print("Ingrese una frase: ");
        frase = lectura.nextLine(); // Leer la frase completa ingresada por el usuario

        // Contar las palabras en la frase
        if (!frase.isEmpty()) {
            String[] palabras = frase.trim().split("\\s+"); // Dividir la frase en palabras
            contador = palabras.length; // Contar la cantidad de palabras
        }

        // Mostrar el resultado
        System.out.println("La cantidad de palabras en la frase es: " + contador);
        
        lectura.close(); // Cerrar el scanner
    }
}
        