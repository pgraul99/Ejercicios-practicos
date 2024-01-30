/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entregableligadepadel;

import java.util.*;

/**
 *
 * @author pgrau
 */
public class EntregableLigaDePadel {

    /*
    Ejercicio hecho por:
    Raúl Pérez Gómez
    Cristian Hidalgo Plesa
     */
    public static void main(String[] args) {
        HashMap<String, Integer> hs = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String categoria;
        do {
            categoria = sc.nextLine();
            if (!categoria.equals("FIN")) {
                getSalida(hs,sc);
            }
            hs.clear();
        } while (!categoria.equals("FIN"));
    }

    public static int meterPartidos(HashMap<String, Integer> hs, Scanner sc) {
        String equipo1 = "",equipo2 = "",partido, ganador= "";
        int punt1, punt2, cont = 0;
        int contadorPartdos = 0;
        int puntosGanador = 0;
        do {
            partido = sc.nextLine();
            if (!partido.equals("FIN")) {
                String[] partidos = partido.split(" ");
                equipo1 = partidos[0];
                punt1 = Integer.parseInt(partidos[1]);
                equipo2 = partidos[2];
                punt2 = Integer.parseInt(partidos[3]);
                if (punt1 > punt2) {
                    addPuntos(hs, equipo1, 2);
                    addPuntos(hs, equipo2, 1);
                } else {
                    addPuntos(hs, equipo2, 2);
                    addPuntos(hs, equipo1, 1);
                }
                cont ++;
            }
            
        } while (!partido.equals("FIN"));
        
        return cont;
    }

    public static void addPuntos(HashMap<String, Integer> hs, String key, int votos) {
        if (hs.containsKey(key)) {
            int votosAnteriores = hs.get(key);
            hs.put(key, votosAnteriores + votos);
        } else {
            hs.put(key, votos);
        }
    }
    
    public static void getSalida (HashMap<String,Integer> hs, Scanner sc){
        int puntosGanador=0, partidos = meterPartidos(hs, sc);;
        String ganador ="";
        for (Map.Entry<String, Integer> entry : hs.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();
            if (puntosGanador < val) {
                ganador = key;
                puntosGanador = val;
            } else if (puntosGanador == val) {
                ganador = "EMPATE";
            }
        }
        int partidosRestantes = (hs.size() * (hs.size()-1)) - partidos;
        System.out.println(ganador + " " + partidosRestantes);
    }

    
}
