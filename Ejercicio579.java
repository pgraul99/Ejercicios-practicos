/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto_listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pgrau
 */
public class Ejercicio579 {

    public static void main(String[] args) {
        (new Ejercicio579()).run();
    }

    public void run() {
        int opcion;
        Scanner sc = new Scanner(System.in);
        ArrayList<Tarea> al = new ArrayList<>();

        do {
            opcion = sc.nextInt();
            for (int i = 0; i < opcion; i++) {
                al.add(new Tarea(sc.nextInt(), sc.nextInt()));
            }
            
            Collections.sort(al);
            
            for (Tarea tarea : al) {
                System.out.println(tarea.prioridad + " " + tarea.duracion);
            }
            
            al.clear();
            
            if (opcion != 0) {
                System.out.println("---");
            }

        } while (opcion != 0);
    }

    class Tarea implements Comparable{
        int duracion;
        int prioridad;

        public Tarea(int prioridad, int duracion) {
            this.prioridad = prioridad;
            this.duracion = duracion;
        }
        
        

        @Override
        public int compareTo(Object o) {
            Tarea other = (Tarea) o;
            if(this.prioridad != other.prioridad){
                return other.prioridad - this.prioridad;
            }else{
                return this.duracion - other.duracion;
            }
        }
    }
}


