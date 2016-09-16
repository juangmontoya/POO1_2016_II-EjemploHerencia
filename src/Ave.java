/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgmontoya
 */
public class Ave extends Animal {
    private int velocidadVuelo;

    public Ave() {
        super(null, 0, null);
    }
    
    

    public Ave(int velocidadVuelo, String nombre, int edad, String raza) {
        super(nombre, edad, raza);
        this.velocidadVuelo = velocidadVuelo;
    }   
    
    /**
     *
     */
    @Override
    public void makeNoise() {
        System.out.println("SHII SHI ..");                
    }
    
    public void volar(){
    System.out.println("El ave está volando...");                
    }
}
