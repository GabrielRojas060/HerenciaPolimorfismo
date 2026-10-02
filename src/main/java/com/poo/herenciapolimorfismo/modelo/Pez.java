/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author taidy
 */
public class Pez extends Animal {
private int profundidad = 0;
    public Pez(String nombre) {
        super(nombre);
        this.profundidad=0;
    }
       public Pez() {
        super("Rojas");
    }
       public void nadar(){
           this.profundidad +=10;
           
           System.out.println(getNombre()+ " esta volando a una profundidad de "+ this.profundidad + " metros");
       }
       
   
  public void comer(String comida, String lugar){
      
      System.out.println(getNombre()+ " esta comiendo "+ comida + " en el lugar "+ lugar);
  }
       
  @Override
  public void hacerSonido() {
    
    System.out.println(super.getNombre()+ " hace Glu Glu!");
  }
}
