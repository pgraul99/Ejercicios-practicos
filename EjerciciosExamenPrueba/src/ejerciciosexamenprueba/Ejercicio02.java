/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosexamenprueba;

import java.util.Scanner;

/*
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        do {
            System.out.print("Introduce el primer sumando: ");
            n1 = sc.nextInt();
            System.out.print("Introduce el segundo sumando: ");
            n2 = sc.nextInt();
            if (n1 == 0 && n2 == 0) {
                System.out.println("Adiós------------------");
                break;
            }

            if (colegas(n1, n2) == true) {
                System.out.println("COLEGAS");
            } else {
                System.out.println("NO SON COLEGAS");
            }

        } while (true);
    }

    public static boolean colegas(int n1, int n2) {
        int resultado = n1 + n2;
        boolean b = true;
        String res = Integer.toString(resultado);
        for (int i = 0; i < res.length()-1; i++) {
            if (res.charAt(i) == res.charAt(i + 1)) {
                b = true;
            } else {
                b = false;
                break;
            }
        }
        return b;
    }
}
