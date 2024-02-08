/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto_listas;


import java.util.*;


/**
 *
 * @author pgrau
 */
public class Ejercicio416 {

    public static void main(String[] args) {
        List<String> ts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String personas;

        do {
            boolean repetida = false;
            String[] resp;
            personas = sc.nextLine();
            if (!personas.equals("0")) {
                for (int i = 0; i < Integer.parseInt(personas); i++) {
                    String respuesta = sc.next();
                    resp = respuesta.split("/");
                    String fechaNacimiento = resp[0] + "/" + resp[1];
                    if (!ts.contains(fechaNacimiento)) {
                        ts.add(fechaNacimiento);
                    } else {
                        repetida = true;
                        break;
                    }

                }
                sc.nextLine();
                if (repetida) System.out.println("SI");
                else System.out.println("NO");
                ts.clear();
            }
        } while (!personas.equals("0"));

    }

    

}
