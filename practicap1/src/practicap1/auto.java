/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicap1;

/**
 *
 * @author CARDENAS
 */
public class auto extends vehiculo{
   String color;
   String marca;
   float placa;
   String diseño;
   String num_asientos;

   
   public auto(String color, String marca, float placa, String diseño, String num_asientos){
   this.color=color;
   this.marca=marca;
   this.placa=placa;
   this.diseño=diseño;
   this.num_asientos=num_asientos;
   
   }

    /*public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getDiseño() {
        return diseño;
    }

    public String getNum_asientos() {
        return num_asientos;
    }*/

  public void procesar(){
      this.encender();
     
      
  }
    }

