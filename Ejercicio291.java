/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto_listas;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author pgrau
 */
public class Ejercicio291 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, TreeSet<Integer>> hm = new TreeMap<>();
        int opcion;

        do {
            opcion = Integer.parseInt(sc.nextLine());
            if (opcion != 0) {
                for (int i = 1; i < opcion + 1; i++) {
                    String texto = sc.nextLine().toLowerCase();
                    String[] cadena = texto.split(" ");
                    for (String cad : cadena) {
                        if (cad.length() > 2) {
                            if (!hm.containsKey(cad)) {
                                hm.put(cad, new TreeSet<>());
                            }
                            hm.get(cad).add(i);
                        }
                    }
                }

                for (Map.Entry<String, TreeSet<Integer>> entry : hm.entrySet()) {
                    String key = entry.getKey();
                    TreeSet<Integer> val = entry.getValue();
                    System.out.print(key);
                    for (Integer i : val) {
                        System.out.print(" " + i);
                    }
                    System.out.println();
                }

                System.out.println("----");
                hm.clear();
            }

        } while (opcion != 0);

    }

}
