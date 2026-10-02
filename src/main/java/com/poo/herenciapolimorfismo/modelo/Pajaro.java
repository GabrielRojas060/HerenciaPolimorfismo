/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;


public class Pajaro extends Animal {
 private int altura = 0;
    public Pajaro(String nombre) {
        super(nombre);
        this.altura=0;
    }
       public Pajaro() {
        super("Carpintero");
    }
       
       public void volar(){
           this.altura +=10;
           
           System.out.println(getNombre()+ " esta volando a una altura de "+ this.altura + " metros");
       }
  @Override
  public void hacerSonido() {
    
    System.out.println(super.getNombre()+ " hace fiu fiu!");
  }
}
