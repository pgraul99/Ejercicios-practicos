/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

import java.util.*;

/**
 *
 * @author dev
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        TreeMap<String, Integer> hs = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        String idClase;

        do {
            System.out.print("Identificador de clase: ");
            idClase = sc.nextLine();
            if (!idClase.equals("FIN")) {
                insertarDatos(hs, sc);
            }
        } while (!idClase.equals("FIN"));
        System.out.println("----------------------------------------");
        System.out.println("SALIDA");
        getSalida(hs);

    }

    public static void addVotos(TreeMap<String, Integer> hs, String key, int votos) {
        if (hs.containsKey(key)) {
            int votosAnteriores = hs.get(key);
            hs.put(key, votosAnteriores + votos);
        } else {
            hs.put(key, votos);
        }
    }

    public static void insertarDatos(TreeMap<String, Integer> hs, Scanner sc) {
        String nombreCandidato;
        int votos;
        do {
            System.out.print("Nombre del candidato: ");
            nombreCandidato = sc.nextLine();
            if (!nombreCandidato.equals("FIN")) {
                System.out.print("Número de votos: ");
                votos = Integer.parseInt(sc.nextLine());
                addVotos(hs, nombreCandidato, votos);
            }
        } while (!nombreCandidato.equals("FIN"));
    }

    public static void getSalida(TreeMap<String, Integer> hs) {
        for (Map.Entry<String, Integer> entry : hs.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println(key + " " + val + " votos");
        }
    }

}
