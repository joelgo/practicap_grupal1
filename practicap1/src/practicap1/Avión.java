
package practicap1;


public class  Avión extends vehiculo {
    
    
    String marca;

    public Avión(String marca) {
       this.marca=marca; 
        
    }
    
    
    
    public void procesar(){
        
        
     this.encender(marca);
    
    }
   
    
}
