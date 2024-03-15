/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parquemovil.vehiculos;

import com.rol.exceptions.ColorInvalidoException;

/**
 *
 * @author dev
 */
public class Coche extends Vehiculo{
    private String color;

    public Coche(String codigo, String marca, String modelo, double kmAutonomia, String color) throws ColorInvalidoException {
        super(codigo, marca, modelo, kmAutonomia);
        this.setColor(color);
    }
    
    
    
    

    @Override
    public void repostar() {
        super.setKmAutonomia(super.getKmAutonomia() + ((super.getKmAutonomia()* 30)/100));
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws ColorInvalidoException {
        if(!(color.equals("blanco") || color.equals("negro"))){
            throw new com.rol.exceptions.ColorInvalidoException("El color debe ser blanco o negro");
        }else{
            this.color = color;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Coche{" + "color=" + color + '}';
    }
    
    
}
