/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosexamenprueba;

import java.util.Scanner;

/**
 *
 * @author pgrau
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        String textoMasCambiado="";
        int mayor = 0;

        do {
            System.out.print("Introduce texto aquí: ");
            texto = sc.nextLine();
            if (texto.toLowerCase().equals("fin") == true) {
                break;
            }
            System.out.println("El texto convertido es: " + convertido(texto));
            if (textoMasCambios(texto) > mayor) {
                mayor=textoMasCambios(texto);
                textoMasCambiado=texto;
            }

        } while (texto.toLowerCase().equals("fin") == false);

        System.out.println("------------------------------------------------");
        System.out.println("El texto más cambiado es: "+ textoMasCambiado);

    }

    public static String convertido(String t) {
        String[] array = t.split(" ");
        String str = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 4) {
                str += array[i].toUpperCase() + " ";
            } else {
                str += array[i] + " ";
            }
        }
        return str;
    }

    public static int textoMasCambios(String t) {
        int cont = 0;
        String[] array = t.split(" ");
        String str = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 4) {
                str += array[i].toUpperCase() + " ";
                cont++;
            } else {
                str += array[i] + " ";
            }
        }
        return cont;

    }

}
