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
public class Ejercicio366 {

    public static void main(String[] args) {
        (new Ejercicio366()).run();
    }

    public void run() {

        int opcion;
        Scanner sc = new Scanner(System.in);
        ArrayList<Ninios> al = new ArrayList<>();

        do {
            opcion = sc.nextInt();
            for (int i = 0; i < opcion; i++) {
                al.add(new Ninios(sc.nextInt(), sc.nextInt()));
            }

            Collections.sort(al);

            for (Ninios ninios : al) {
                System.out.println(ninios.bueno + " " + ninios.peso);
            }

            al.clear();

            if (opcion != 0) {
                System.out.println("");
            }

        } while (opcion != 0);
    }

    class Ninios implements Comparable {

        int bueno;
        int peso;

        public Ninios(int bueno, int peso) {
            this.bueno = bueno;
            this.peso = peso;
        }

        @Override
        public int compareTo(Object o) {
            Ninios other = (Ninios) o;
            if (this.bueno != other.bueno) {
                return other.bueno - this.bueno;
            } else {
                return this.peso - other.peso;
            }
        }

    }

}
