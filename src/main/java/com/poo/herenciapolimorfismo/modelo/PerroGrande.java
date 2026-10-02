/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class PerroGrande extends Perro{
    private int pesoKg;

    public PerroGrande(String nombre, int edad, String raza, int pesoKg) {
        super(nombre,edad,raza);
        this.pesoKg = pesoKg;
    }

   public PerroGrande() {
        this("sin nombre", 0 ,"desconocida",0 );
        
    }
  
    public int getPesoKg() {
        return pesoKg;
    }

    
    @Override
  public void hacerSonido() {
    
    System.out.println(super.getNombre()+ " hace Guau Guau!");
  }
}
    
    
    

