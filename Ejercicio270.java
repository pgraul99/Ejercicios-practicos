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
public class Ejercicio270 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> hs = new TreeMap<>();
        int opcion;
        String texto;

        do {
            opcion = Integer.parseInt(sc.nextLine());
            if(opcion != 0){
                String[] alumnos = new String[opcion * 2];
                for (int i = 0; i < opcion * 2; i++) {
                    texto = sc.nextLine();
                    alumnos[i] = texto;
                }


                for (int i = 0; i < alumnos.length; i++) {
                    if ((i == 0 || i % 2 == 0) && hs.containsKey(alumnos[i])) {

                        if (alumnos[i + 1].equals("CORRECTO")) {
                            int notaAnterior = hs.get(alumnos[i]);
                            hs.put(alumnos[i], notaAnterior + 1);

                        } else if (alumnos[i + 1].equals("INCORRECTO")) {
                            int notaAnterior = hs.get(alumnos[i]);
                            hs.put(alumnos[i], notaAnterior - 1);
                        }

                    }else if ((i == 0 || i % 2 == 0) && !hs.containsKey(alumnos[i])){

                        if (alumnos[i + 1].equals("CORRECTO")) {
                            hs.put(alumnos[i], 1);

                        } else if (alumnos[i + 1].equals("INCORRECTO")) {
                            hs.put(alumnos[i], -1);
                        }
                    }
                }

                for (Map.Entry<String, Integer> entry : hs.entrySet()) {
                    String key = entry.getKey();
                    int val = entry.getValue();
                    if(val != 0){
                        System.out.println(key + ", " + val);
                    }
                }
                System.out.println("---");
                hs.clear();
            }
        } while (opcion != 0);
    }
}
