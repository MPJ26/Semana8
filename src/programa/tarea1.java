package programa;
import java.util.Scanner;
public class tarea1 {
    public static void main (String args []){
        //DECLARACION DE VARIABLE
        String texto;
        int contador=0;
        Scanner lectura =new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingrese un texto: ");
        texto = lectura.nextLine();
        // Contar vocales
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            // Convertir a minúscula para contar vocales sin importar mayúsculas
            letra = Character.toLowerCase(letra);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        // Mostrar el resultado
        System.out.println("El número de vocales en el texto es: " + contador);
        
        // Cerrar el escáner
        lectura.close();
    }
}