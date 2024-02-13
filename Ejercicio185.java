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
public class Ejercicio185 {

    public static void main(String[] args) {
        List<String> ts = new ArrayList<>();
        HashSet<String> si = new HashSet<>();
        HashSet<String> no = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            opcion = Integer.parseInt(sc.nextLine());
            if (opcion != 0) {
                for (int i = 0; i < opcion; i++) {
                    String respuesta = sc.nextLine();
                    String[] resp = respuesta.split(" ");
                    for (int j = 0; j < resp.length - 1; j++) {
                        if (resp[0].equals("SI:")) {
                            if (!(resp[j].equals("SI:") || resp[j].equals("FIN"))) {
                                si.add(resp[j]);
                            }

                        } else if (resp[0].equals("NO:")) {
                            if (!(resp[j].equals("NO:") || resp[j].equals("FIN"))) {
                                no.add(resp[j]);
                            }
                        }
                    }
                }

                for (String negativa : no) {
                    if (!si.contains(negativa)) {
                        ts.add(negativa);
                    }
                }
                Collections.sort(ts);
                

                si.clear();
                no.clear();

                if (!ts.isEmpty()) {
                    for (int i = 0; i < ts.size(); i++) {
                        System.out.print(ts.get(i));
                        if (i < ts.size() - 1) {
                            System.out.print(" ");
                        }
                    }
                }

                ts.clear();
                System.out.println("");
            }
        } while (opcion != 0);

    }

}
