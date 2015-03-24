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
public class auto extends vehiculo implements pasajero{
   String color;
   String marca;
   float placa;
   String diseño;
   String num_asientos;
   String i;
   String j;
   String k;
   
   public auto(String color, String marca, float placa, String diseño, String num_asientos, String i,String j,String k){
   this.color=color;
   this.marca=marca;
   this.placa=placa;
   this.diseño=diseño;
   this.num_asientos=num_asientos;
   this.i=i;
    this.j=j;
    this.k=k;
   }

   

  public void procesar(){
      
      if(i.equals(j)){this.encender();}
      
      else{ this.apagar();}
      
      if(k.equals("si"))
      {
         this.num_asiento(); 
      } else {
      
      this.mensaje();
      }
  
  }
  
  
  
   @Override
  public void num_asiento()
  {
      System.out.println(" el numero de asiento del pasajero es 109");
  }
   @Override
   
    public void mensaje()
    {
        System.out.println("Usted no pago su pasaje !!!!!!");
    }
    
    
    }

