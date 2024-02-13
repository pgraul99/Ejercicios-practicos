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
public class Ejercicio214 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion, opcion2;
        HashMap<String, Integer> hm = new HashMap<>();

        do {
            opcion = Integer.parseInt(sc.nextLine());
            if (opcion != 0) {
                for (int i = 0; i < opcion; i++) {
                    String rey = sc.next();
                    addReyes(hm, rey, 1);
                }

                sc.nextLine();

                opcion2 = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < opcion2; i++) {
                    String sucesor = sc.next();
                    if(hm.containsKey(sucesor)){
                        hm.put(sucesor, hm.get(sucesor)+1);
                        
                    }else{
                        hm.put(sucesor, 1);
                    }
                    
                    System.out.println(hm.get(sucesor));

                }
                sc.nextLine();

                System.out.println("");
                hm.clear();
            }

        } while (opcion != 0);

    }

    public static void addReyes(HashMap<String, Integer> hs, String key, int votos) {
        if (hs.containsKey(key)) {
            int reyesAnteriores = hs.get(key);
            hs.put(key, reyesAnteriores + votos);
        } else {
            hs.put(key, votos);
        }
    }

     
}
