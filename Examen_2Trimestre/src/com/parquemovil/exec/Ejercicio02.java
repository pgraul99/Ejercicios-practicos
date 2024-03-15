/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parquemovil.exec;

import com.parquemovil.vehiculos.Coche;
import com.parquemovil.vehiculos.Tractor;
import com.parquemovil.vehiculos.Vehiculo;
import com.rol.exceptions.CargaNoValidaException;
import com.rol.exceptions.ColorInvalidoException;
import java.util.*;

/**
 *
 * @author dev
 */
public class Ejercicio02 {

    public static void main(String[] args) throws ColorInvalidoException, ColorInvalidoException, CargaNoValidaException {
        HashMap<String, Vehiculo> hs = new HashMap<>();

        try {
            Vehiculo c1 = new Coche("0123456A", "Seat", "Ibiza", 500, "blanco");
            hs.put(c1.getCodigo(), c1);
        } catch (ColorInvalidoException e) {
            System.out.println(e.getMessage());
        }
        

        try {
            Vehiculo c2 = new Coche("0123456B", "Renault", "CLio", 400, "negro");
            hs.put(c2.getCodigo(), c2);
        } catch (ColorInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Vehiculo c3 = new Coche("0123456C", "Seat", "Leon", 300, "rojo");
            hs.put(c3.getCodigo(), c3);
        } catch (ColorInvalidoException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Vehiculo c4 = new Coche("0123456D", "Seat", "Córdoba", 600, "blanco");
            hs.put(c4.getCodigo(), c4);
        } catch (ColorInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Vehiculo t1 = new Tractor("7894561A", "Ford", "Mondeo", 150, 4000);
            hs.put(t1.getCodigo(), t1);
        } catch (CargaNoValidaException e) {
            System.out.println(e.getMessage());
        }

        try {
            Vehiculo t2 = new Tractor("7894561B", "AUDI", "RS", 250, 10000);
            hs.put(t2.getCodigo(), t2);
        } catch (CargaNoValidaException e) {
            System.out.println(e.getMessage());
        }

        listar(hs);
        repostarTractores750(hs);
        mediaKmAutonomiaCoches(hs);
        hs = borrarBlancos(hs);
        listar(hs);
    }

    public static void listar(HashMap<String, Vehiculo> hs) {
        System.out.println("Listar Vehículos:");
        for (Map.Entry<String, Vehiculo> entry : hs.entrySet()) {
            String key = entry.getKey();
            Vehiculo val = entry.getValue();
            System.out.println(val);
        }
        System.out.println("--------------------------------------\n");
    }

    public static void repostarTractores750(HashMap<String, Vehiculo> hs) {
        System.out.println("Tractores repostados");
        for (Map.Entry<String, Vehiculo> entry : hs.entrySet()) {
            String key = entry.getKey();
            Vehiculo val = entry.getValue();
            if (val instanceof Tractor) {
                if (((Tractor) val).getKgCargaMaxima() > 750) {
                    val.repostar();
                }
            }
        }
        System.out.println("--------------------------------------\n");
    }

    public static void mediaKmAutonomiaCoches(HashMap<String, Vehiculo> hs) {
        int contBlancos = 0, contNegros = 0, totalBlancos = 0, totalNegros = 0;
        for (Map.Entry<String, Vehiculo> entry : hs.entrySet()) {
            String key = entry.getKey();
            Vehiculo val = entry.getValue();
            if (val instanceof Coche) {
                if (((Coche) val).getColor().equals("blanco")) {
                    totalBlancos += val.getKmAutonomia();
                    contBlancos++;
                } else if (((Coche) val).getColor().equals("negro")) {
                    totalNegros += val.getKmAutonomia();
                    contNegros++;
                }
            }

        }
        System.out.println("Media de kmAutonomia:");
        if (contBlancos > 0) {
            System.out.println("La media de los blancos es = " + 1.0d * (totalBlancos / contBlancos));
        }

        if (contNegros > 0) {
            System.out.println("La media de los negros es = " + 1.0d * (totalNegros / contNegros));
        }

        System.out.println("--------------------------------------\n");
    }

    public static HashMap<String, Vehiculo> borrarBlancos(HashMap<String, Vehiculo> hs) {
        HashMap<String, Vehiculo> aux = new HashMap<>();
        for (String clave : hs.keySet()) {
            if (hs.get(clave) instanceof Coche) {
                Coche valor = (Coche) hs.get(clave);
                if (!valor.getColor().equals("blanco")) {
                    aux.put(clave, valor);
                }
            } else if (hs.get(clave) instanceof Tractor) {
                aux.put(clave, hs.get(clave));
            }
        }
        
        System.out.println("Listado nuevo sin coches blancos");
        hs = aux;
        return hs;

    }

}
