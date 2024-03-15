/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parquemovil.vehiculos;

import com.rol.exceptions.CargaNoValidaException;

/**
 *
 * @author dev
 */
public class Tractor extends Vehiculo{

    private double kgCargaMaxima;

    public Tractor(String codigo, String marca, String modelo, double kmAutonomia, double kgCargaMaxima) throws CargaNoValidaException {
        super(codigo, marca, modelo, kmAutonomia);
        this.setKgCargaMaxima(kgCargaMaxima);
    }


    public double getKgCargaMaxima() {
        return kgCargaMaxima;
    }

    public void setKgCargaMaxima(double kgCargaMaxima) throws CargaNoValidaException {
        if(kgCargaMaxima < 100 || kgCargaMaxima > 5000){
            throw new com.rol.exceptions.CargaNoValidaException("La carga debe ser superior a 100 y menor a 5000");
        }else{
            this.kgCargaMaxima = kgCargaMaxima;
        }
        
        
    }
    
    @Override
    public void repostar() {
        super.setKmAutonomia(super.getKmAutonomia() + ((super.getKmAutonomia()* 20)/100));
    }

    @Override
    public String toString() {
        return super.toString() + " Tractor{" + "kgCargaMaxima=" + kgCargaMaxima + '}';
    }
    
    
}
